package Testak;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import DatuBasea.AretoDAO;
import DatuBasea.BezeroDAO;
import DatuBasea.Konexioa;
import Modelo.Aretoa;
import Modelo.Bezeroa;

public class AretoDAOTest {

	@Test
	public void testAretoakJaso() {
		Aretoa[] esperotakoa = new Aretoa[4];
		int kont = 0;
		int id_zinem = 0;
		int id_aretoa = 0;
		String areto_izena = "";
		
		Konexioa konexioa = new Konexioa();
		Connection konektatu = konexioa.konektatu();
		if (konektatu != null) {
			try {
				String sql = "select distinct id_zinema, id_aretoa, areto_izena\r\n"
						+ "from aretoa where id_zinema = ?";
				PreparedStatement preparedStatement = konektatu.prepareStatement(sql);
				preparedStatement.setInt(1, 1);
				ResultSet lerroak = preparedStatement.executeQuery();
				
				while (lerroak.next()) {
					id_zinem = lerroak.getInt("id_zinema");
					id_aretoa = lerroak.getInt("id_aretoa");
					areto_izena = lerroak.getString("areto_izena");
					esperotakoa[kont] = new Aretoa(id_zinem, id_aretoa, areto_izena);
					kont++;
				}
				AretoDAO areto = new AretoDAO();
				Aretoa[] aretoak = areto.aretoakJaso(1);
				
				assertArrayEquals(esperotakoa, aretoak);
				
			} catch (SQLException e) {
				System.err.println("Errorea: Ezin izan da kontsulta egin.");
				e.printStackTrace();
			} finally {
				konexioa.deskonektatu();
			}
	    }
	}
	
	@Test
    public void testGetAretoaId_AretoakNull() {
        Aretoa[] aretoak = null;
        AretoDAO aretoaDAO = new AretoDAO();
        Aretoa aretoa = aretoaDAO.getAretoaId(1, aretoak);
        assertNull(aretoa);
    }

    @Test
    public void testGetAretoaId_AretoakHutzik() {
        Aretoa[] aretoak = new Aretoa[0];
        AretoDAO aretoaDAO = new AretoDAO();
        Aretoa aretoa = aretoaDAO.getAretoaId(1, aretoak);
        assertNull(aretoa);
    }

    @Test
    public void testGetAretoaId_IdEzAurkitzen() {
        Aretoa[] aretoak = {
            new Aretoa(1, 10, "Aretoa1"),
            new Aretoa(1, 20, "Aretoa2"),
            new Aretoa(1, 30, "Aretoa3")
        };
        AretoDAO aretoaDAO = new AretoDAO();
        Aretoa aretoa = aretoaDAO.getAretoaId(5, aretoak);
        assertNull(aretoa);
    }

    @Test
    public void testGetAretoaId_IdAurkitzen() {
        Aretoa[] aretoak = {
            new Aretoa(1, 10, "Aretoa1"),
            new Aretoa(1, 20, "Aretoa2"),
            new Aretoa(1, 30, "Aretoa3")
        };
        AretoDAO aretoaDAO = new AretoDAO();
        Aretoa aretoa = aretoaDAO.getAretoaId(20, aretoak);
        assertEquals("Aretoa2", aretoa.getIzena());
    }

}
