package Testak;

import static org.junit.Assert.*;
import org.junit.Test;
import Modelo.Zinema;
import Modelo.DatuBasea.ZinemaDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ZinemaDAOTest {

    @Test
    public void testZinemakJaso() {
        // Crear una instancia del DAO
        ZinemaDAO zinemaDAO = new ZinemaDAO();
        
        // Llamar al método para obtener los cines
        Zinema[] zinemak = zinemaDAO.zinemakJaso();
        
        // Verificar que se obtuvo al menos un cine
        assertTrue("Gutxienez zinema bat espero zen", zinemak.length > 0);
        
        // Conectar a la base de datos de prueba
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/E3","root","")) {
            // Crear una sentencia SQL para obtener los resultados esperados
            Statement statement = connection.createStatement();
            String sql = "SELECT id_zinema, zinema_izena, helbidea, telefonoa, email FROM zinema";
            ResultSet resultSet = statement.executeQuery(sql);
            
            // Comparar los resultados obtenidos con los resultados esperados de la base de datos
            int index = 0;
            while (resultSet.next() && index < zinemak.length) {
                assertEquals("Zinemaren ID ez du bat egiten", resultSet.getInt("id_zinema"), zinemak[index].getId());
                assertEquals("Zinemaren izena ez du bat egiten", resultSet.getString("zinema_izena"), zinemak[index].getIzena());
                assertEquals("Zinemaren helbidea ez du bat egiten", resultSet.getString("helbidea"), zinemak[index].getHelbidea());
                assertEquals("Zinemaren telefonoa ez du bat egiten", resultSet.getInt("telefonoa"), zinemak[index].getTlf());
                assertEquals("Zinemaren helbide elektronikoa ez du bat egiten", resultSet.getString("email"), zinemak[index].getEmaila());
                index++;
            }
            
            // Verificar que se han comparado todos los resultados
            assertEquals("Jasotako zinemen zenbakia ez dator bat datu basean daudenekin", index, zinemak.length);
        } catch (SQLException e) {
        	
            e.printStackTrace();
        }
    }
}
