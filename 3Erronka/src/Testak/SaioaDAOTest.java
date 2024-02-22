package Testak;

import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Aretoa;
import Modelo.Karteldegia;
import Modelo.Pelikula;
import Modelo.Saioa;
import Modelo.DatuBasea.AretoDAO;
import Modelo.DatuBasea.Konexioa;
import Modelo.DatuBasea.PelikulaDAO;
import Modelo.DatuBasea.SaioaDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

public class SaioaDAOTest {

    @Test
    public void testsaioakJaso() {
        
         Saioa[] esperotakoa = new Saioa[32];
         PelikulaDAO filmak = new PelikulaDAO();
         Karteldegia karteldegi = new Karteldegia(filmak.pelikulakJaso());
         Pelikula pelikula = null;
         int id_saioa = 0;
         Aretoa aretoa;
         LocalTime ordutegia;
         LocalDate saioEguna;
         int pelikula_id;
         int aretoa_id;
         int kont = 0;
        
         Konexioa konexioa = new Konexioa();
         Connection konektatu = konexioa.konektatu();

         if (konektatu != null) {
             try {
                 String sql = "SELECT * FROM saioa where id_zinema = ?";
                 PreparedStatement preparedStatement = konektatu.prepareStatement(sql);
                 preparedStatement.setInt(1, 1);
                 ResultSet lerroak = preparedStatement.executeQuery();

                 AretoDAO areto = new AretoDAO();
                 Aretoa[] aretoak = areto.aretoakJaso(1);

                 while (lerroak.next()) {
                     id_saioa = lerroak.getInt("id_saioa");
                     ordutegia = lerroak.getTime("ordutegia").toLocalTime();
                     saioEguna = lerroak.getDate("saioaren_eguna").toLocalDate();
                     pelikula_id = lerroak.getInt("id_filma");
                     pelikula = karteldegi.getPelikulaId(pelikula_id);
                     aretoa_id = lerroak.getInt("id_aretoa");
                     aretoa = areto.getAretoaId(aretoa_id, aretoak);

                     esperotakoa[kont] = new Saioa(id_saioa, ordutegia, saioEguna, pelikula, aretoa);
                     
                     kont++;
                 }
                 
                 SaioaDAO saio = new SaioaDAO();
                 Saioa[] saioak = saio.saioakJaso(1);
                 
                 assertArrayEquals(esperotakoa, saioak);
                 
             } catch (SQLException e) {
                 System.err.println("Errorea: Ezin izan da kontsulta egin.");
                 e.printStackTrace();
             } finally {
                 konexioa.deskonektatu();
             }
         }
        
    
    }
}