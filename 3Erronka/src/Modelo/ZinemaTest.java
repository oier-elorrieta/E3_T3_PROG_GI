package Modelo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ZinemaTest {

	// ***** ID TEST *****
	@Test
	public void getIdTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com",
				"17:00-23:00");
		assertEquals(1, z1.getId());
	}

	@Test
	public void setIdTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com",
				"17:00-23:00");
		z1.setId(01);
		assertEquals(01, z1.getId());
	}

	// ***** IZENA TEST *****
	@Test
	public void getIzenaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com",
				"17:00-23:00");
		assertEquals("Elorrieta Zinema", z1.getIzena());
	}

	@Test
	public void setIzenaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com",
				"17:00-23:00");
		z1.setIzena("Getxo");
		assertEquals("Getxo", z1.getIzena());
	}

	// ***** HELIDEA TEST *****
	@Test
	public void getHelbideaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com",
				"17:00-23:00");
		assertEquals("San Ignazio", z1.getHelbidea());
	}

	@Test
	public void setHelbideaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com",
				"17:00-23:00");
		z1.setHelbidea("Leioa");
		assertEquals("Leioa", z1.getHelbidea());
	}

	// ***** TELEFONOA TEST *****
	@Test
	public void getTlfTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com",
				"17:00-23:00");
		assertEquals(658659874, z1.getTlf());
	}

	@Test
	public void setTlfTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com",
				"17:00-23:00");
		z1.setTlf(55588859);
		assertEquals(55588859, z1.getTlf());
	}

	// ***** ARETOA TEST *****
	@Test
	public void getAretoaTest() {
		Aretoa[] aretoak = new Aretoa[] { new Aretoa(1, "Areto1", null, "10/02/2024", "17:00-23:00") };
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, aretoak, null, "elorrietazinema@gmail.com",
				"17:00-23:00");
		assertArrayEquals(aretoak, z1.getAretoak());
	}

	@Test
	public void setAretoaTest() {
		Aretoa[] aretoak = new Aretoa[] { new Aretoa(1, "Areto1", null, "10/02/2024", "17:00-23:00") };
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com",
				"17:00-23:00");
		z1.setAretoak(aretoak);
		assertArrayEquals(aretoak, z1.getAretoak());
	}
	
	// ***** SAIOA TEST *****
		@Test
		public void getSaioaTest() {
			Saioa[] saioak = new Saioa[] { new Saioa(1, "10:00-12:00", "10/02/2024", null, null) };
			Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, saioak, "elorrietazinema@gmail.com",
					"17:00-23:00");
			assertArrayEquals(saioak, z1.getSaioak());
		}

		@Test
		public void setSaioaTest() {
			Saioa[] saioak = new Saioa[] { new Saioa(1, "10:00-12:00", "10/02/2024", null, null) };
			Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com",
					"17:00-23:00");
			z1.setSaioak(saioak);
			assertArrayEquals(saioak, z1.getSaioak());
		}

	// ***** EMAILA TEST *****
	@Test
	public void getEmailaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com",
				"17:00-23:00");
		assertEquals("elorrietazinema@gmail.com", z1.getEmaila());
	}

	@Test
	public void setEmailaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com",
				"17:00-23:00");
		z1.setEmaila("unai@gmail.com");
		assertEquals("unai@gmail.com", z1.getEmaila());
	}

	// ***** ORDUTEGIA TEST *****
	@Test
	public void getOrdutegiaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com",
				"17:00-23:00");
		assertEquals("17:00-23:00", z1.getOrdutegia());
	}

	@Test
	public void setOrdutegiaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com",
				"17:00-23:00");
		z1.setOrdutegia("11:00-12:00");
		assertEquals("11:00-12:00", z1.getOrdutegia());
	}

	// ***** TOSTRING TEST *****
	@Test
	public void testToString() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com",
				"17:00-23:00");
		String esperotakoa = "Zinema [id=1, izena=Elorrieta Zinema, kokapena=null, tlf=658659874, aretoak=null, saioak=null, emaila=elorrietazinema@gmail.com, "
				+ "ordutegia=17:00-23:00]";
		assertEquals(esperotakoa, z1.toString());
	}

	// ***** EQUALS TEST *****
	@Test
	public void testEquals() {
		Zinema zinema1 = new Zinema(1, "Zinema1", "Helbidea1", 123456789, null, null, "emaila1", "ordutegia1");
		Zinema zinema2 = new Zinema(1, "Zinema1", "Helbidea1", 123456789, null, null, "emaila1", "ordutegia1");
		Zinema zinema3 = new Zinema(2, "Zinema2", "Helbidea2", 987654321, null, null, "emaila2", "ordutegia2");

		assertTrue(zinema1.equals(zinema2));
		assertFalse(zinema1.equals(zinema3));
		assertFalse(zinema1.equals(null));
	}
}
