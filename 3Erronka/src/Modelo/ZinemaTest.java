package Modelo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ZinemaTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@Test
	public void getIzenaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, "elorrietazinema@gmail.com", "17:00-23:00");
		assertEquals("Elorrieta Zinema", z1.getIzena());
	}
	
	@Test
	public void setIzenaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, "elorrietazinema@gmail.com", "17:00-23:00");
		z1.setIzena("Getxo");
		assertEquals("Getxo", z1.getIzena());
	}
	
	@Test
	public void getKokapenaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, "elorrietazinema@gmail.com", "17:00-23:00");
		assertEquals("San Ignazio", z1.getKokapena());
	}
	
	@Test
	public void setKokapenaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, "elorrietazinema@gmail.com", "17:00-23:00");
		z1.setKokapena("Leioa");
		assertEquals("Leioa", z1.getKokapena());
	}
	
	@Test
	public void getTlfTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, "elorrietazinema@gmail.com", "17:00-23:00");
		assertEquals(658659874, z1.getTlf());
	}
	
	@Test
	public void setTlfTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, "elorrietazinema@gmail.com", "17:00-23:00");
		z1.setTlf(55588859);
		assertEquals(55588859, z1.getTlf());
	}
	
	@Test
	public void getAretoaTest() {
		Aretoa[] aretoak = new Aretoa[] {
		        new Aretoa(1, "Areto1", null, "10/02/2024", "17:00-23:00")
		    };
		Zinema z2 = new Zinema (1, "Elorrieta Zinema", "San Ignazio", 658659874, aretoak, "elorrietazinema@gmail.com", "17:00-23:00");
		assertArrayEquals(aretoak, z2.getAretoak());
	}
	
	@Test
	public void setAretoaTest() {
		Aretoa[] aretoak = new Aretoa[] {
		        new Aretoa(1, "Areto1", null, "10/02/2024", "17:00-23:00")
		    };
		Zinema z2 = new Zinema (1, "Elorrieta Zinema", "San Ignazio", 658659874, aretoak, "elorrietazinema@gmail.com", "17:00-23:00");
		Aretoa aretoBerria = new Aretoa (2, "Areto2", null, "10/02/2024", "17:00-23:00");
		Aretoa[] aretoBerriak = new Aretoa[] {aretoBerria};
		
		z2.setAretoak(aretoBerriak);
		assertArrayEquals(aretoBerriak, z2.getAretoak());
	}
	
	@Test
	public void getEmailaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, "elorrietazinema@gmail.com", "17:00-23:00");
		assertEquals("elorrietazinema@gmail.com", z1.getEmaila());
	}
	
	@Test
	public void setEmailaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, "elorrietazinema@gmail.com", "17:00-23:00");
		z1.setEmaila("unai@gmail.com");
		assertEquals("unai@gmail.com", z1.getEmaila());
	}
	
	@Test
	public void getOrdutegiaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, "elorrietazinema@gmail.com", "17:00-23:00");
		assertEquals("17:00-23:00", z1.getOrdutegia());
	}
	
	@Test
	public void setOrdutegiaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, "elorrietazinema@gmail.com", "17:00-23:00");
		z1.setOrdutegia("11:00-12:00");
		assertEquals("11:00-12:00", z1.getOrdutegia());
	}
}
