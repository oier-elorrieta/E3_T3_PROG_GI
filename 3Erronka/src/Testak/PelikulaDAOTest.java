package Testak;

import static org.junit.Assert.*;
import org.junit.Test;
import Modelo.Pelikula;
import Modelo.DatuBasea.PelikulaDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PelikulaDAOTest {

   @Test
   public void testpelikulakJaso() {
       // Crear una instancia del DAO
       PelikulaDAO pelikulaDAO = new PelikulaDAO();
       
       // Llamar al método para obtener los cines
       Pelikula[] pelikulak = pelikulaDAO.pelikulakJaso();

       // Verificar que se obtuvo al menos un cine
       assertTrue("Gutxienez pelikula bat espero zen", pelikulak.length > 0);

       // Conectar a la base de datos de prueba
       try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/E3", "root", "")) {

           // Crear una sentencia SQL para obtener los resultados esperados
           Statement statement = connection.createStatement();
           String sql = "SELECT id_filma, film_izena, generoa, iraupena FROM filma";
           ResultSet resultSet = statement.executeQuery(sql);
       
           // Comparar los resultados obtenidos con los resultados esperados de la base de datos
           int index = 0;
           while (resultSet.next() && index < pelikulak.length) {

               assertEquals("pelikularen ID ez du bat egiten", resultSet.getInt("id_filma"), pelikulak[index].getId());
               assertEquals("pelikularen izena ez du bat egiten", resultSet.getString("film_izena"), pelikulak[index].getIzena());
               assertEquals("pelikularen izena ez du bat egiten", resultSet.getString("generoa"), pelikulak[index].getGeneroa());
               assertEquals("pelikularen iraupena ez du bat egiten", resultSet.getInt("iraupena"), pelikulak[index].getIraupena());
               
               index++;
           }
     
           // Verificar que se han comparado todos los resultados
           assertEquals("Jasotako pelikulen zenbakia ez dator bat datu basean daudenekin", index, pelikulak.length);
           
       } catch (SQLException e) {

           e.printStackTrace();
       }
   }
}