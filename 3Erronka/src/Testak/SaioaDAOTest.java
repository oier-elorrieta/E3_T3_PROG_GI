package Testak;

import static org.junit.Assert.*;
import org.junit.Test;

import DatuBasea.AretoDAO;
import DatuBasea.Konexioa;
import DatuBasea.PelikulaDAO;
import DatuBasea.SaioaDAO;
import Modelo.Aretoa;
import Modelo.Karteldegia;
import Modelo.Pelikula;
import Modelo.Saioa;

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
		Saioa[] saioak;
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
				String sql = "SELECT * FROM saioa WHERE id_zinema = ?";
				PreparedStatement preparedStatement = konektatu.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				preparedStatement.setInt(1, 1);
				ResultSet lerroak = preparedStatement.executeQuery();

				// Datuen errenkaden kopurua kontatu
				int zenbat = 0;
				while (lerroak.next()) {
					zenbat++;
				}
				lerroak.beforeFirst(); // ResultSet-aren hasierara bueltatu

				// Errenkada kopurua erabiliz, arraya hasieratu
				saioak = new Saioa[zenbat];

				// ResultSet-era joan eta Saioa objektuak sortu
				while (lerroak.next()) {
					id_saioa = lerroak.getInt("id_saioa");
					ordutegia = lerroak.getTime("ordutegia").toLocalTime();
					saioEguna = lerroak.getDate("saioaren_eguna").toLocalDate();
					pelikula_id = lerroak.getInt("id_filma");
					pelikula = karteldegi.getPelikulaId(pelikula_id);
					aretoa_id = lerroak.getInt("id_aretoa");
					AretoDAO aretoDAO = new AretoDAO();
					Aretoa[] aretoak = aretoDAO.aretoakJaso(1);
					aretoa = aretoDAO.getAretoaId(aretoa_id, aretoak);

					saioak[kont] = new Saioa(id_saioa, ordutegia, saioEguna, pelikula, aretoa);
					kont++;
				}

				SaioaDAO saio = new SaioaDAO();
				Saioa[] esperotakoa = saio.saioakJaso(1);

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