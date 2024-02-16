package Modelo.DatuBasea;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import Modelo.Aretoa;
import Modelo.Bezeroa;
import Modelo.Erosketa;

public class ErosketaDAO {
    private Erosketa[] erosketak; 
    private int kont = 0;
    private int id_erosketa = 0;
    private int deskontua = 0;
    private LocalDate erosketa_eguna;
    private int kantitatea = 0;
    private double faktura = 0;
    private String NAN = "";
    private char non;

    public Erosketa[] erosketakJaso() {
        Konexioa konexioa = new Konexioa();
        Connection konektatu = konexioa.konektatu();

        if (konektatu != null) {
            try {
                Statement s1 = konektatu.createStatement();
                String sql = "SELECT * FROM erosketa";
                ResultSet lerroak = s1.executeQuery(sql);

                while (lerroak.next()) {
                    id_erosketa = lerroak.getInt("id_erosketa"); 
                    deskontua = lerroak.getInt("deskontua");
                    erosketa_eguna = lerroak.getDate("erosketa_eguna").toLocalDate();
                    kantitatea = lerroak.getInt("kantitatea");
                    faktura = lerroak.getDouble("faktura"); 
                    NAN = lerroak.getString("NAN");
                    non = lerroak.getString("non").charAt(0);
                    
                    erosketak[kont] =  new Erosketa(id_erosketa, deskontua, erosketa_eguna, kantitatea, faktura, NAN, non);
                    kont++;
                }
            } catch (SQLException e) {
                System.err.println("Errorea: Ezin izan da kontsulta egin.");
                e.printStackTrace();
            } finally {
                konexioa.deskonektatu();
            }
        }
        return erosketak;
    }
}
