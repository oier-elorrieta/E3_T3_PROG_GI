package DatuBasea;

import Modelo.Aretoa;
import Modelo.Saioa;
import Modelo.Zinema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ZinemaDAO {
	private Zinema zinema;
	private Aretoa[] aretoak = null;
	private Saioa[] saioak = null;

	private String emaila;
	private int tlf;
	private String helbidea;
	private String izena;
	private int id;

	public Zinema zinemaJaso(int id_zinema) {
		Konexioa konexioa = new Konexioa();
		Connection konektatu = konexioa.konektatu();
		if (konektatu != null) {
			try {
				String sql = "SELECT id_zinema, zinema_izena, helbidea, telefonoa, email FROM Zinema WHERE id_zinema = ?";
				PreparedStatement preparedStatement = konektatu.prepareStatement(sql);
				preparedStatement.setInt(1, id_zinema);
				ResultSet lerroak = preparedStatement.executeQuery();

				while (lerroak.next()) {
					id = lerroak.getInt("id_zinema");
					izena = lerroak.getString("zinema_izena");
					helbidea = lerroak.getString("helbidea");
					tlf = lerroak.getInt("telefonoa");
					emaila = lerroak.getString("email");

					AretoDAO areto = new AretoDAO();
					aretoak = areto.aretoakJaso(id_zinema);

					SaioaDAO saio = new SaioaDAO();
					saioak = saio.saioakJaso(id_zinema);

					zinema = new Zinema(id, izena, helbidea, tlf, aretoak, saioak, emaila);

				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				konexioa.deskonektatu();
			}
		}
		return zinema;
	}

	// Método para obtener la cantidad de cines desde la base de datos
	public int zenbatZinema() {
		int zinemaKont = 0;
		Konexioa konexioa = new Konexioa();
		Connection konektatu = konexioa.konektatu();

		if (konektatu != null) {
			try {
				String sql = "SELECT COUNT(*) AS zenbat FROM Zinema";
				PreparedStatement preparedStatement = konektatu.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();

				if (resultSet.next()) {
					zinemaKont = resultSet.getInt("zenbat");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				konexioa.deskonektatu();
			}
		}

		return zinemaKont;
	}

}
