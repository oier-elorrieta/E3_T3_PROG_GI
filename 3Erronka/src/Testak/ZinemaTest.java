package Testak;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Modelo.Aretoa;
import Modelo.Saioa;
import Modelo.Zinema;

public class ZinemaTest {

	// ***** ID TEST *****
	@Test
	public void getIdTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");
		assertEquals(1, z1.getId());
	}

	@Test
	public void setIdTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");
		z1.setId(01);
		assertEquals(01, z1.getId());
	}

	// ***** IZENA TEST *****
	@Test
	public void getIzenaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");
		assertEquals("Elorrieta Zinema", z1.getIzena());
	}

	@Test
	public void setIzenaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");
		z1.setIzena("Getxo");
		assertEquals("Getxo", z1.getIzena());
	}

	// ***** HELIDEA TEST *****
	@Test
	public void getHelbideaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");
		assertEquals("San Ignazio", z1.getHelbidea());
	}

	@Test
	public void setHelbideaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");
		z1.setHelbidea("Leioa");
		assertEquals("Leioa", z1.getHelbidea());
	}

	// ***** TELEFONOA TEST *****
	@Test
	public void getTlfTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");
		assertEquals(658659874, z1.getTlf());
	}

	@Test
	public void setTlfTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");
		z1.setTlf(55588859);
		assertEquals(55588859, z1.getTlf());
	}

	// ***** ARETOA TEST *****
	@Test
	public void getAretoaTest() {
		Aretoa[] aretoak = new Aretoa[] { new Aretoa(1, 1, "Areto1") };
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, aretoak, null, "elorrietazinema@gmail.com");
		assertArrayEquals(aretoak, z1.getAretoak());
	}

	@Test
	public void setAretoaTest() {
		Aretoa[] aretoak = new Aretoa[] { new Aretoa(1, 1, "Areto1") };
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");
		z1.setAretoak(aretoak);
		assertArrayEquals(aretoak, z1.getAretoak());
	}
	
	// ***** SAIOA TEST *****
		@Test
		public void getSaioaTest() {
			Saioa[] saioak = new Saioa[] { new Saioa(1, null, null, null, null) };
			Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, saioak, "elorrietazinema@gmail.com");
			assertArrayEquals(saioak, z1.getSaioak());
		}

		@Test
		public void setSaioaTest() {
			Saioa[] saioak = new Saioa[] { new Saioa(1, null, null, null, null) };
			Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");
			z1.setSaioak(saioak);
			assertArrayEquals(saioak, z1.getSaioak());
		}

	// ***** EMAILA TEST *****
	@Test
	public void getEmailaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");
		assertEquals("elorrietazinema@gmail.com", z1.getEmaila());
	}

	@Test
	public void setEmailaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");
		z1.setEmaila("unai@gmail.com");
		assertEquals("unai@gmail.com", z1.getEmaila());
	}
	
	// ***** TOSTRING TEST *****
	@Test
	public void testToString() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");
		String esperotakoa = "Zinema [id=1, izena=Elorrieta Zinema, helbidea=San Ignazio, tlf=658659874, aretoak=null, saioak=null, emaila=elorrietazinema@gmail.com]";
		assertEquals(esperotakoa, z1.toString());
	}

	// ***** EQUALS TEST *****
	@Test
	public void testEquals() {
		Zinema zinema1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");
		Zinema zinema2 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");
		Zinema zinema3 = new Zinema(2, "Elorrieta Zinema", "San Ignazio", 658659874, null, null, "elorrietazinema@gmail.com");

		assertTrue(zinema1.equals(zinema2));
		assertFalse(zinema1.equals(zinema3));
		assertFalse(zinema1.equals(null));
	}
}
