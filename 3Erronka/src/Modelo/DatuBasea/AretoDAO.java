 package Modelo.DatuBasea;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Modelo.Aretoa;
import Modelo.Bezeroa;

public class AretoDAO {
    private Aretoa[] aretoak = new Aretoa[4]; 
    private int kont = 0;
    private int id_aretoa = 0;
    private String areto_izena = "";
    
    public Aretoa[] aretoakJaso() {
        Konexioa konexioa = new Konexioa();
        Connection konektatu = konexioa.konektatu();

        if (konektatu != null) {
            try {
                Statement s1 = konektatu.createStatement();
                String sql = "select distinct id_aretoa, areto_izena\r\n"
                		+ "from aretoa;";
                ResultSet lerroak = s1.executeQuery(sql);
                while (lerroak.next()) {
                    id_aretoa = lerroak.getInt("id_aretoa"); 
                    areto_izena = lerroak.getString("areto_izena");
                    
                    aretoak[kont] =  new Aretoa(id_aretoa, areto_izena);
                    kont++;
                }
            } catch (SQLException e) {
                System.err.println("Errorea: Ezin izan da kontsulta egin.");
                e.printStackTrace();
            } finally {
                konexioa.deskonektatu();
            }
        }
        return aretoak;
    }
}