package DatuBasea;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

import Modelo.Aretoa;
import Modelo.Karteldegia;
import Modelo.Pelikula;
import Modelo.Saioa;

public class SaioaDAO {
	private Saioa[] saioak = new Saioa[32];
	private PelikulaDAO filmak = new PelikulaDAO();
	private Karteldegia karteldegi = new Karteldegia(filmak.pelikulakJaso());
	private Pelikula pelikula = null;
	private int id_saioa = 0;
	private Aretoa aretoa;
	private LocalTime ordutegia;
	private LocalDate saioEguna;
	private int pelikula_id;
	private int aretoa_id;
	private int kont = 0;

	public Saioa[] saioakJaso(int id_zinema) {
		Konexioa konexioa = new Konexioa();
		Connection konektatu = konexioa.konektatu();

		if (konektatu != null) {
			try {
				String sql = "SELECT * FROM saioa where id_zinema = ?";
				PreparedStatement preparedStatement = konektatu.prepareStatement(sql);
				preparedStatement.setInt(1, id_zinema);
				ResultSet lerroak = preparedStatement.executeQuery();

				AretoDAO areto = new AretoDAO();
				Aretoa[] aretoak = areto.aretoakJaso(id_zinema);

				while (lerroak.next()) {
					id_saioa = lerroak.getInt("id_saioa");
					ordutegia = lerroak.getTime("ordutegia").toLocalTime();
					saioEguna = lerroak.getDate("saioaren_eguna").toLocalDate();
					pelikula_id = lerroak.getInt("id_filma");
					pelikula = karteldegi.getPelikulaId(pelikula_id);
					aretoa_id = lerroak.getInt("id_aretoa");
					aretoa = areto.getAretoaId(aretoa_id, aretoak);

					saioak[kont] = new Saioa(id_saioa, ordutegia, saioEguna, pelikula, aretoa);
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