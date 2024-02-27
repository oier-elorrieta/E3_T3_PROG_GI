package DatuBasea;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Modelo.Karteldegia;
import Modelo.Pelikula;

public class PelikulaDAO {
	private Pelikula[] pelikulak = new Pelikula[17];
	private int id = 0;
	private String izena = "";
	private String generoa = "";
	private int iraupena = 0;
	private int kont = 0;
	
	public Pelikula[] pelikulakJaso() {
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
                	
                	pelikulak[kont] =  new Pelikula(id, izena, generoa, iraupena);
                	kont++;
                }
            } catch (SQLException e) {
                System.err.println("Errorea: Ezin izan da kontsulta egin.");
                e.printStackTrace();
            } finally {
            	konexioa.deskonektatu();
            }
        }
        return pelikulak;
	}
}


