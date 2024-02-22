package Modelo.DatuBasea;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.Bezeroa;

public class BezeroDAO {
	private Bezeroa[] bezeroak = new Bezeroa[4];
	private int kont = 0;
	private String NAN = "";
	private String bezero_izena = "";
	private String abizena = "";
	private char generoa;
	private String erabiltzailea = "";
	private String pasahitza = "";

	public Bezeroa[] bezeroakJaso() {
		Konexioa konexioa = new Konexioa();
		Connection konektatu = konexioa.konektatu();

		if (konektatu != null) {
			try {
				Statement s1 = konektatu.createStatement();
				String sql = "SELECT * FROM bezeroa";
				ResultSet lerroak = s1.executeQuery(sql);
				while (lerroak.next()) {
					NAN = lerroak.getString("NAN");
					bezero_izena = lerroak.getString("bezero_izena");
					abizena = lerroak.getString("abizena");
					generoa = lerroak.getString("generoa").charAt(0);
					erabiltzailea = lerroak.getString("erabiltzailea");
					pasahitza = lerroak.getString("pasahitza");

					bezeroak[kont] = new Bezeroa(NAN, bezero_izena, abizena, generoa, erabiltzailea, pasahitza);
					kont++;
				}
			} catch (SQLException e) {
				System.err.println("Errorea: Ezin izan da kontsulta egin.");
				e.printStackTrace();
			} finally {
				konexioa.deskonektatu();
			}
		}
		return bezeroak;
	}
}