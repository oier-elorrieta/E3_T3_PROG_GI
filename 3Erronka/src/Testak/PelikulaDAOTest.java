package Testak;

import static org.junit.Assert.*;
import org.junit.Test;
import Modelo.Pelikula;
import Modelo.DatuBasea.Konexioa;
import Modelo.DatuBasea.PelikulaDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PelikulaDAOTest {

   @Test
   public void testpelikulakJaso() {
         Pelikula[] esperotakoa = new Pelikula[16];
         int id = 0;
         String izena = "";
         String generoa = "";
         int iraupena = 0;
         int kont = 0;
       
       Konexioa konexioa = new Konexioa();
       Connection konektatu = konexioa.konektatu();

       if (konektatu != null) {
           try {
               Statement s1 = konektatu.createStatement();
               String sql = "SELECT * FROM filma";
               ResultSet lerroak = s1.executeQuery(sql);
               while (lerroak.next()) {
                   id = lerroak.getInt("id_filma");
                   izena = lerroak.getString("film_izena");
                   generoa = lerroak.getString("generoa");
                   iraupena = lerroak.getInt("iraupena");
                   
                   esperotakoa[kont] =  new Pelikula(id, izena, generoa, iraupena);
                   kont++;
               }
               
               PelikulaDAO pelikula = new PelikulaDAO();
               Pelikula[] pelikulak = pelikula.pelikulakJaso();
               
               assertArrayEquals(esperotakoa, pelikulak);
               
           } catch (SQLException e) {
               System.err.println("Errorea: Ezin izan da kontsulta egin.");
               e.printStackTrace();
           } finally {
               konexioa.deskonektatu();
           }
       }
   }
}