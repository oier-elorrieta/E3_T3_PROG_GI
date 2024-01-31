package Modelo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AretoaTest {

	@Test
	public void getIdTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", null, "10/02/2024", "17:00-23:00");
		assertEquals(1, a1.getId());
	}

	@Test
	public void setIdTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", null, "10/02/2024", "17:00-23:00");
		a1.setId(3);
		assertEquals(3, a1.getId());
	}

	@Test
	public void geIzenaTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", null, "10/02/2024", "17:00-23:00");
		assertEquals("Areto1", a1.getIzena());
	}

	@Test
	public void setIzenaTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", null, "10/02/2024", "17:00-23:00");
		a1.setIzena("Areto77");
		assertEquals("Areto77", a1.getIzena());
	}

	@Test
	public void getPelikulaTest() {
		Pelikula[] p1 = new Pelikula[] { 
				new Pelikula(1, "Areto1", "Drama", 100, 9.5)
				};
		Aretoa a2 = new Aretoa(1, "Areto1", p1, "10/02/2024", "17:00-23:00");
		assertArrayEquals(p1, a2.getPelikulak());
	}
	
	@Test
	public void setPelikulaTest() {
		Pelikula[] p1 = new Pelikula[] {
		        new Pelikula(1, "Areto1", "Drama", 100, 9.5)
		    };
		Aretoa a2 = new Aretoa (1, "Areto1", p1, "10/02/2024", "17:00-23:00");
		Pelikula pelikulaBerria = new Pelikula (2, "Areto1", "Drama", 100, 9.5);
		Pelikula[] pelikulaBerriak = new Pelikula[] {pelikulaBerria};
		
		a2.setPelikulak(pelikulaBerriak);
		assertArrayEquals(pelikulaBerriak, a2.getPelikulak());
	}
	
	@Test
	public void getDataTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", null, "10/02/2024", "17:00-23:00");
		assertEquals("10/02/2024", a1.getData());
	}
	
	@Test
	public void setDataTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", null, "10/02/2024", "17:00-23:00");
		a1.setData("01/01/2020");
		assertEquals("01/01/2020", a1.getData());
	}
	
	@Test
	public void getOrdutegiaTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", null, "10/02/2024", "17:00-23:00");
		assertEquals("17:00-23:00", a1.getOrdutegia());
	}
	
	@Test
	public void setOrdutegiaTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", null, "10/02/2024", "17:00-23:00");
		a1.setOrdutegia("10:00-18:00");
		assertEquals("10:00-18:00", a1.getOrdutegia());
	}
}
