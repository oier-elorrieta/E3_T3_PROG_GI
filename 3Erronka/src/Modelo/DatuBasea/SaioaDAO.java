package Modelo.DatuBasea;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

import Modelo.Karteldegia;
import Modelo.Pelikula;
import Modelo.Saioa;

public class SaioaDAO {
	private Saioa[] saioak = null;
	private Karteldegia karteldegi = new Karteldegia(null);
	private int id_saioa = 0;
	private LocalTime ordutegia;
	private LocalDate saioEguna;
	private int pelikula_id;
	private int aretoa_id;
	private int kont = 0;

	public Saioa[] saioakJaso() {
		Konexioa konexioa = new Konexioa();
		Connection konektatu = konexioa.konektatu();

		if (konektatu != null) {
			try {
				Statement s1 = konektatu.createStatement();
				String sql = "SELECT * FROM saioa";
				ResultSet lerroak = s1.executeQuery(sql);
				while (lerroak.next()) {
					id_saioa = lerroak.getInt("id_filma");
					ordutegia = lerroak.getTime("ordutegia").toLocalTime();
					saioEguna = lerroak.getDate("saioaren_eguna").toLocalDate();
					//pelikula_id = 
					

					//pelikulak[kont] = new Pelikula(id, izena, generoa, iraupena);
					kont++;
				}
			} catch (SQLException e) {
				System.err.println("Errorea: Ezin izan da kontsulta egin.");
				e.printStackTrace();
			} finally {
				konexioa.deskonektatu();
			}
		}
		return saioak;
	}
}
