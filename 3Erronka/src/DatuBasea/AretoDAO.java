package DatuBasea;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.Aretoa;
import Modelo.Bezeroa;
import Modelo.Pelikula;

public class AretoDAO {

	private Aretoa[] aretoak = new Aretoa[4];
	private int kont = 0;
	private int id_zinem = 0;
	private int id_aretoa = 0;
	private String areto_izena = "";

	public Aretoa[] aretoakJaso(int id_zinema) {

		Konexioa konexioa = new Konexioa();
		Connection konektatu = konexioa.konektatu();
		if (konektatu != null) {
			try {
				String sql = "select distinct id_zinema, id_aretoa, areto_izena\r\n"
						+ "from aretoa where id_zinema = ?";
				PreparedStatement preparedStatement = konektatu.prepareStatement(sql);
				preparedStatement.setInt(1, id_zinema);
				ResultSet lerroak = preparedStatement.executeQuery();
				while (lerroak.next()) {
					id_zinem = lerroak.getInt("id_zinema");
					id_aretoa = lerroak.getInt("id_aretoa");
					areto_izena = lerroak.getString("areto_izena");
					aretoak[kont] = new Aretoa(id_zinem, id_aretoa, areto_izena);
					kont++;
				}
			} catch (SQLException e) {
				System.err.println("Errorea: Ezin izan da kontsulta egin.");
				e.printStackTrace();
			} finally {
				konexioa.deskonektatu();
			}
		}

		return aretoak;

	}

	public Aretoa getAretoaId(int id, Aretoa[] aretoak) {
		if (aretoak != null) {
			for (int i = 0; i < aretoak.length; i++) {
				if (aretoak[i].getId_areto() == id) {
					return aretoak[i];
				}
			}
		}
		return null;
	}
}