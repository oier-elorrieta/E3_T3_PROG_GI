package Modelo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ZinemaTest {

	@Test
	public void getIdTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, "elorrietazinema@gmail.com", "17:00-23:00");
		assertEquals(1, z1.getId());
	}
	
	@Test
	public void setIdTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, "elorrietazinema@gmail.com", "17:00-23:00");
		z1.setId(01);
		assertEquals(01, z1.getId());
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
	public void getHelbideaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, "elorrietazinema@gmail.com", "17:00-23:00");
		assertEquals("San Ignazio", z1.getHelbidea());
	}
	
	@Test
	public void setKokapenaTest() {
		Zinema z1 = new Zinema(1, "Elorrieta Zinema", "San Ignazio", 658659874, null, "elorrietazinema@gmail.com", "17:00-23:00");
		z1.setHelbidea("Leioa");
		assertEquals("Leioa", z1.getHelbidea());
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

	 @Test
	    public void testToString() {
	        Aretoa[] aretoak1 = {
	        		new Aretoa(1, "Aretoa1", null, "01/02/2024", "18:00"), 
	        		new Aretoa(2, "Aretoa2", null, "02/02/2024", "20:30")};
	        Zinema zinema1 = new Zinema(1, "Zinema1", "Helbidea1", 123456789, aretoak1, "emaila1", "ordutegia1");

	        String expected = "Zinema [id=1, izena=Zinema1, kokapena=null, tlf=123456789, aretoa="
	        		+ "[Aretoa [id=1, izena=Aretoa1, pelikulak=null, data=01/02/2024, ordutegia=18:00], "
	        		+ "Aretoa [id=2, izena=Aretoa2, pelikulak=null, data=02/02/2024, ordutegia=20:30]], "
	        		+ "emaila=emaila1, ordutegia=ordutegia1]";
	        assertEquals(expected, zinema1.toString());
	    }

	    /*@Test
	    public void testHashCode() {
	        Aretoa[] aretoak1 = {new Aretoa(1, "Aretoa1", null, "Data1", "Ordutegia1"), new Aretoa(2, "Aretoa2", null, "Data2", "Ordutegia2")};
	        Zinema zinema1 = new Zinema(1, "Zinema1", "Helbidea1", 123456789, aretoak1, "emaila1", "ordutegia1");
	        Zinema zinema2 = new Zinema(1, "Zinema1", "Helbidea1", 123456789, aretoak1, "emaila1", "ordutegia1");
	        Zinema zinema3 = new Zinema(2, "Zinema2", "Helbidea2", 987654321, aretoak1, "emaila2", "ordutegia2");

	        assertEquals(zinema1.hashCode(), zinema2.hashCode());
	        assertNotEquals(zinema1.hashCode(), zinema3.hashCode());
	    }*/

	    @Test
	    public void testEquals() {
	        Aretoa[] aretoak1 = {
	        		new Aretoa(1, "Aretoa1", null, "01/02/2024", "18:00"), 
	        		new Aretoa(2, "Aretoa2", null, "01/02/2024", "17:00")};
	        
	        Aretoa[] aretoak2 = {
	        		new Aretoa(3, "Aretoa3", null, "01/02/2024", "18:00"), 
	        		new Aretoa(4, "Aretoa4", null, "01/02/2024", "17:00")};
	        
	        Zinema zinema1 = new Zinema(1, "Zinema1", "Helbidea1", 123456789, aretoak1, "emaila1", "ordutegia1");
	        Zinema zinema2 = new Zinema(1, "Zinema1", "Helbidea1", 123456789, aretoak1, "emaila1", "ordutegia1");
	        Zinema zinema3 = new Zinema(2, "Zinema2", "Helbidea2", 987654321, aretoak2, "emaila2", "ordutegia2");

	        assertTrue(zinema1.equals(zinema2));
	        assertFalse(zinema1.equals(zinema3));
	    }
}
