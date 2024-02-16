package Modelo.DatuBasea;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import Modelo.Aretoa;
import Modelo.Bezeroa;
import Modelo.Erosketa;
import Modelo.Sarrera;

public class SarreraDAO {
    private Sarrera[] sarrerak;
    private int kont = 0;
    private int id_sarrera = 0;
    private int id_erosketa = 0;
    private int id_saioa = 0;

    public Sarrera[] sarrerakJaso() {
        Konexioa konexioa = new Konexioa();
        Connection konektatu = konexioa.konektatu();

        if (konektatu != null) {
            try {
                Statement s1 = konektatu.createStatement();
                String sql = "SELECT * FROM sarrera";
                ResultSet lerroak = s1.executeQuery(sql);

                while (lerroak.next()) {
                    id_sarrera = lerroak.getInt("id_sarrera"); 
                    id_erosketa = lerroak.getInt("id_erosketa");
                    id_saioa = lerroak.getInt("id_saioa");
                    
                    
                    sarrerak[kont] =  new Sarrera(id_sarrera, id_erosketa, id_saioa);
                    kont++;
                }
            } catch (SQLException e) {
                System.err.println("Errorea: Ezin izan da kontsulta egin.");
                e.printStackTrace();
            } finally {
                konexioa.deskonektatu();
            }
        }
        return sarrerak;
    }
}
