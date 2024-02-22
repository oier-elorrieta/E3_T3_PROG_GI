package Testak;

import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Aretoa;
import Modelo.Saioa;
import Modelo.Zinema;
import Modelo.DatuBasea.AretoDAO;
import Modelo.DatuBasea.Konexioa;
import Modelo.DatuBasea.SaioaDAO;
import Modelo.DatuBasea.ZinemaDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ZinemaDAOTest {

	@Test
	public void testZinemakJaso() {
		Zinema esperotakoa = null;
		Aretoa[] aretoak = null;
		Saioa[] saioak = null;
		String emaila;
		int tlf;
		String helbidea;
		String izena;
		int id;

		Konexioa konexioa = new Konexioa();
		Connection konektatu = konexioa.konektatu();
		if (konektatu != null) {
			try {
				String sql = "SELECT id_zinema, zinema_izena, helbidea, telefonoa, email FROM Zinema WHERE id_zinema = ?";
				PreparedStatement preparedStatement = konektatu.prepareStatement(sql);
				preparedStatement.setInt(1, 1);
				ResultSet lerroak = preparedStatement.executeQuery();

				while (lerroak.next()) {
					id = lerroak.getInt("id_zinema");
					izena = lerroak.getString("zinema_izena");
					helbidea = lerroak.getString("helbidea");
					tlf = lerroak.getInt("telefonoa");
					emaila = lerroak.getString("email");

					AretoDAO areto = new AretoDAO();
					aretoak = areto.aretoakJaso(1);

					SaioaDAO saio = new SaioaDAO();
					saioak = saio.saioakJaso(1);

					esperotakoa = new Zinema(id, izena, helbidea, tlf, aretoak, saioak, emaila);
				}
				
				ZinemaDAO zinem = new ZinemaDAO();
				Zinema zinema = zinem.zinemaJaso(1);
				
				assertEquals(esperotakoa, zinema);
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				konexioa.deskonektatu();
			}
		}
	}
}
