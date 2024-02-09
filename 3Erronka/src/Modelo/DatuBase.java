package Modelo;

import java.sql.*;
import java.util.Properties;
    public class DatuBase {

        public static void main(String[] args) {
        	 Pelikula[] pelikulak = new Pelikula[16];
            String url = "jdbc:mysql://localhost:3307/e3";
            String user = "root";
            String pass = "";
            int id = 0;
            String izenaFilm = "";
            String genFilm = "";
            int iraupena = 0;
            Connection conn;
            try {
                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Konektatuta");
                // Prestatu sententzia
                Statement s1 = conn.createStatement();
                String sql = "select * "
                        +      "from filma";
                ResultSet lerroak = s1.executeQuery(sql);
                int i=0;
                while (lerroak.next()) {
                    id = lerroak.getInt("id_filma");
                    izenaFilm = lerroak.getString("film_izena");
                    genFilm = lerroak.getString("generoa");
                    iraupena = lerroak.getInt("iraupena");
                    
                   pelikulak[i] =  new Pelikula(id, izenaFilm, genFilm, iraupena);
                   i++; 
                }
            } catch (Exception sqe) {
                sqe.printStackTrace();
            }
            for(int i=0;i<pelikulak.length; i++) {
            	System.out.println(pelikulak[i]);
            }

            
            
        }

    }