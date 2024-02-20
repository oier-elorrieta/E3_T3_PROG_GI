package Testak;

import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Saioa;
import Modelo.DatuBasea.SaioaDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SaioaDAOTest {

    @Test
    public void testsaioakJaso() {
        // Crear una instancia del DAO
        SaioaDAO saioaDAO = new SaioaDAO();
        
        // Llamar al método para obtener los cines
        Saioa[] saioak = saioaDAO.saioakJaso();
        
        // Verificar que se obtuvo al menos un cine
        assertTrue("Gutxienez saio bat espero zen", saioak.length > 0);
        
        // Conectar a la base de datos de prueba
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/E3", "root", "")) {
            // Crear una sentencia SQL para obtener los resultados esperados
            Statement statement = connection.createStatement();
            String sql = "SELECT id_saioa, saioaren_eguna, ordutegia, id_aretoa, id_filma FROM saioa";
            ResultSet resultSet = statement.executeQuery(sql);
            
            // Comparar los resultados obtenidos con los resultados esperados de la base de datos
            int index = 0;
            while (resultSet.next() && index < saioak.length) {
                assertEquals("saioaren ID ez du bat egiten", resultSet.getInt("id_saioa"), saioak[index].getId());
                assertEquals("saioaren eguna ez du bat egiten", resultSet.getDate("saioaren_eguna").toLocalDate(), saioak[index].getData());
                assertEquals("saioaren ordutegia ez du bat egiten", resultSet.getTime("ordutegia").toLocalTime(), saioak[index].getOrdutegia());
                assertEquals("saioaren aretoa ez du bat egiten", resultSet.getInt("id_aretoa"), saioak[index].getAretoa());
                assertEquals("saioaren filma ez du bat egiten", resultSet.getInt("id_filma"), saioak[index].getPelikula());

                index++;
            }
            
            // Verificar que se han comparado todos los resultados
            assertEquals("Jasotako saioen zenbakia ez dator bat datu basean daudenekin", index, saioak.length);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
