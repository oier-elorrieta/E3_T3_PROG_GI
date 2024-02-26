package Testak;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import Modelo.Erosketa;
import Modelo.Sarrera;

public class ErosketaTest {

	// ***** ID TEST *****
	@Test
	public void getIdTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		assertEquals(1, e1.getId());
	}

	@Test
	public void setIdTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		e1.setId(2);
		assertEquals(2, e1.getId());
	}

	// ***** KANTITATE TEST *****
	@Test
	public void getKantTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		assertEquals(4, e1.getKant());
	}

	@Test
	public void setKantTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		e1.setKant(6);
		assertEquals(6, e1.getKant());
	}

	// ***** SARRERA TEST *****
	@Test
	public void getSarrerakTest() {
		LocalDate data = LocalDate.of(2024, 02, 8);
		Sarrera[] s1 = { new Sarrera(1, data, null, 5.50) };
		Erosketa e1 = new Erosketa(1, 4, s1, "02/02/2024", "deskriptzioa", 24.3);
		assertArrayEquals(s1, e1.getSarrerak());
	}

	@Test
	public void setSarrerakTest() {
		LocalDate data = LocalDate.of(2024, 02, 8);
		Sarrera[] s1 = { new Sarrera(1, data, null, 5.50) };
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		e1.setSarrerak(s1);
		assertArrayEquals(s1, e1.getSarrerak());
	}

	// ***** DATA TEST *****
	@Test
	public void getDataTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		assertEquals("02/02/2024", e1.getData());
	}

	@Test
	public void setDataTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		e1.setData("02/03/2024");
		assertEquals("02/03/2024", e1.getData());
	}

	// ***** DESKRIPTZIO TEST *****
	@Test
	public void getDeskTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		assertEquals("deskriptzioa", e1.getDesk());
	}

	@Test
	public void setDeskTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		e1.setDesk("deskrip");
		assertEquals("deskrip", e1.getDesk());
	}

	// ***** DIRU_TOTALA TEST *****
	@Test
	public void getDiru_totalaTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		assertEquals(24.3, e1.getDiru_totala(), 0);
	}

	@Test
	public void toStringTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);

		String esperotakoa = "Erosketa [id_erosketa=1, kant=4, sarrerak=null, data=02/02/2024, desk=deskriptzioa, diru_totala=24.3]";
		assertEquals(esperotakoa, e1.toString());
	}

	// ***** EQUALS TEST *****
	@Test
	public void equalsDiraTest() {

		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		Erosketa e2 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);

		assertTrue(e1.equals(e2)); // balore berdinak, aretoak berdinak izan beharko dira
	}

	@Test
	public void equalsEzTest() {

		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		Erosketa e2 = new Erosketa(2, 4, null, "02/02/2024", "deskriptzioa", 24.3);

		assertFalse(e1.equals(e2)); // Id desberdinak, aretoak desberdinak izan beharko dira
	}
}
