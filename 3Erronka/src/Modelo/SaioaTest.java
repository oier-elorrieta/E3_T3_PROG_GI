package Modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SaioaTest {

	//***** ID TEST *****
	@Test
	public void getIdTest() {
		Saioa s1 = new Saioa(1, "17:00-18:30", "02/02/2024", null, null);
		assertEquals(1, s1.getId());
	}

	@Test
	public void setIdTest() {
		Saioa s1 = new Saioa(1, "17:00-18:30", "02/02/2024", null, null);
		s1.setId(2);
		assertEquals(2, s1.getId());
	}

	//***** ORDUTEGIA TEST *****
	@Test
	public void getOrdutegiaTest() {		
		Saioa s1 = new Saioa(1, "17:00-18:30", "02/02/2024", null, null);
		assertEquals("17:00-18:30", s1.getOrdutegia());
	}

	@Test
	public void setOrdutegiaTest() {
		Saioa s1 = new Saioa(1, "17:00-18:30", "02/02/2024", null, null);
		s1.setOrdutegia("18:30-20:00");
		assertEquals("18:30-20:00", s1.getOrdutegia());
	}
	
	//***** DATA TEST *****
	@Test
	public void getDataTest() {
		Saioa s1 = new Saioa(1, "17:00-18:30", "02/02/2024", null, null);
		assertEquals("02/02/2024", s1.getData());
	}
	
	@Test
	public void setDataTest() {
		Saioa s1 = new Saioa(1, "17:00-18:30", "02/02/2024", null, null);
		s1.setData("03/02/2024");
		assertEquals("03/02/2024", s1.getData());
	}

	//***** PELIKULA TEST *****
	@Test
	public void getPelikulaTest() {
		Pelikula p1 = new Pelikula(1, "Handia", "Drama", 129, 5.75);
		
		Saioa s1 = new Saioa(1, "17:00-18:30", "02/02/2024", p1, null);
		assertEquals(p1, s1.getPelikula());
	}
	
	@Test
	public void setPelikulaTest() {
		Pelikula p1 = new Pelikula(1, "Handia", "Drama", 129, 5.75);
		Saioa s1 = new Saioa(1, "17:00-18:30", "02/02/2024", null, null);
		
		s1.setPelikula(p1);
		assertEquals(p1, s1.getPelikula());
	}
	
	// ***** ARETOA TEST *****
		@Test
		public void getAretoaTest() {
			Aretoa aretoa = new Aretoa (1, "Areto1", null, "10/02/2024", "17:00-23:00");
			Saioa s1 = new Saioa(1, "17:00-18:30", "02/02/2024", null, aretoa);
			assertEquals(aretoa, s1.getAretoa());
		}

		@Test
		public void setAretoaTest() {
			Aretoa aretoa = new Aretoa (1, "Areto1", null, "10/02/2024", "17:00-23:00");
			Saioa s1 = new Saioa(1, "17:00-18:30", "02/02/2024", null, null);
			s1.setAretoa(aretoa);
			assertEquals(aretoa, s1.getAretoa());
		}
	
	//***** TOSTRING TEST *****
	@Test
	public void toStringTest() {
		Pelikula p1 = new Pelikula(1, "Handia", "Drama", 129, 5.75);
		Saioa s1 = new Saioa(1, "17:00-18:30", "02/02/2024", null, null);

		String esperotakoa = "Saioa [id=1, ordutegia=17:00-18:30, data=02/02/2024, pelikula=null, aretoa=null]";
		assertEquals(esperotakoa, s1.toString());
	}
	
	//***** EQUALS TEST *****
	@Test
    public void equalsTest() {

		Pelikula p1 = new Pelikula(1, "Handia", "Drama", 129, 5.75);
		Saioa s1 = new Saioa(1, "17:00-18:30", "02/02/2024", p1, null);
		Saioa s2 = new Saioa(1, "17:00-18:30", "02/02/2024", p1, null);
		Saioa s3 = new Saioa(2, "17:00-18:30", "02/02/2024", p1, null);

        assertTrue(s1.equals(s2)); // mismos valores, deberían ser iguales
        assertFalse(s1.equals(s3)); // diferente ID, deberían ser diferentes
        assertFalse(s1.equals(null));
    }

}
