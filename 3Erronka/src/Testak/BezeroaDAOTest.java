package Testak;

import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Bezeroa;
import Modelo.DatuBasea.BezeroDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BezeroaDAOTest {

    @Test
    public void testBezeroakJaso() {
        // Crear una instancia del DAO
        BezeroDAO bezeroaDAO = new BezeroDAO();
        
        // Llamar al método para obtener los bezeroak
        Bezeroa[] bezeroak = bezeroaDAO.bezeroakJaso();
        
        // Verificar que se obtuvo al menos un bezero
        assertTrue("Gutxienez bezero bat espero zen", bezeroak.length > 0);
        
        // Conectar a la base de datos de prueba
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/E3", "root", "")) {
            // Crear una sentencia SQL para obtener los resultados esperados
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM bezeroa";
            ResultSet resultSet = statement.executeQuery(sql);
            
            // Comparar los resultados obtenidos con los resultados esperados de la base de datos
            int index = 0;
            while (resultSet.next() && index < bezeroak.length) {
                assertEquals("bezeroaren NAN ez du bat egiten", resultSet.getString("NAN"), bezeroak[index].getNAN());
                assertEquals("bezeroaren izena ez du bat egiten", resultSet.getString("bezero_izena"), bezeroak[index].getIzena());
                assertEquals("bezeroaren abizena ez du bat egiten", resultSet.getString("abizena"), bezeroak[index].getAbizena());
                assertEquals("bezeroaren sexua ez du bat egiten", resultSet.getString("sexua").charAt(0), bezeroak[index].getSexua());
                assertEquals("bezeroaren erabiltzailea ez du bat egiten", resultSet.getString("erabiltzailea"), bezeroak[index].getErabiltzailea());
                assertEquals("bezeroaren pasahitza ez du bat egiten", resultSet.getString("pasahitza"), bezeroak[index].getPasahitza());

                index++;
            }
            
            // Verificar que se han comparado todos los resultados
            assertEquals("Jasotako bezeroen zenbakia ez da bat datu basean daudenekin", index, bezeroak.length);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
