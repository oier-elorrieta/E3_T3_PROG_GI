package Modelo.DatuBasea;

import Modelo.Zinema;
import Modelo.DatuBasea.Konexioa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ZinemaDAO {
	private Zinema[] zinemak = new Zinema[4];
	private String emaila;
	private int tlf;
	private String helbidea;
	private String izena;
	private int id;

	public Zinema[] zinemakJaso() {
		Konexioa konexioa = new Konexioa();
		Connection konektatu = konexioa.konektatu();
		if (konektatu != null) {
			try {
				Statement z1 = konektatu.createStatement();
				String sql = "SELECT id_zinema, zinema_izena, helbidea, telefonoa, email FROM Zinema;";
				ResultSet lerroak = z1.executeQuery(sql);

				int kont = 0; // Honekin asegurtatzen dugu lehenengo posizioa 0 izango dela
				while (lerroak.next()) {
					id = lerroak.getInt("id_zinema");
					izena = lerroak.getString("zinema_izena");
					helbidea = lerroak.getString("helbidea");
					tlf = lerroak.getInt("telefonoa");
					emaila = lerroak.getString("email");

					Zinema zinema = new Zinema(id, izena, helbidea, tlf, null, null, emaila); // Nota: aretoak y saioak
																								// null porque no los
																								// recuperamos aquí

					zinemak[kont++] = zinema;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return zinemak;
	}

}