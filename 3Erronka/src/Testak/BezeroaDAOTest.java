package Testak;

import static org.junit.Assert.*;
import org.junit.Test;

import DatuBasea.BezeroDAO;
import DatuBasea.Konexioa;
import DatuBasea.SaioaDAO;
import Modelo.Bezeroa;
import Modelo.Saioa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BezeroaDAOTest {

	@Test
	public void testBezeroakJaso() {
		Bezeroa[] esperotakoa = null;
	    int kont = 0;
	    String NAN = "";
	    String bezero_izena = "";
	    String abizena = "";
	    char generoa;
	    String erabiltzailea = "";
	    String pasahitza = "";

		Konexioa konexioa = new Konexioa();
        Connection konektatu = konexioa.konektatu();

        if (konektatu != null) {
            try {
                Statement s1 = konektatu.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

                String sql = "SELECT * FROM bezeroa";
                ResultSet lerroak = s1.executeQuery(sql);

                // ResultSet-eko errenkadak zenbatzeko
                int zenbat = 0;
                while (lerroak.next()) {
                    zenbat++;
                }
                lerroak.beforeFirst(); // ResultSet-aren hasierara bueltatzen da

                // Arraya zenbatutako tamainarekin hasieratu
                esperotakoa = new Bezeroa[zenbat];

                // ResultSet-era joan eta Bezeroa objektuak sortu
                while (lerroak.next()) {
                    NAN = lerroak.getString("NAN");
                    bezero_izena = lerroak.getString("bezero_izena");
                    abizena = lerroak.getString("abizena");
                    generoa = lerroak.getString("generoa").charAt(0);
                    erabiltzailea = lerroak.getString("erabiltzailea");
                    pasahitza = lerroak.getString("pasahitza");

                    esperotakoa[kont] = new Bezeroa(NAN, bezero_izena, abizena, generoa, erabiltzailea, pasahitza);
                    kont++;
                }

				BezeroDAO bezero = new BezeroDAO();
				Bezeroa[] bezeroak = bezero.bezeroakJaso();

				assertArrayEquals(esperotakoa, bezeroak);

			} catch (SQLException e) {
				System.err.println("Errorea: Ezin izan da kontsulta egin.");
				e.printStackTrace();
			} finally {
				konexioa.deskonektatu();
			}
		}
	}
}