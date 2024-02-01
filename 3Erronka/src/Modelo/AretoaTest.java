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
		Pelikula[] p1 = new Pelikula[] { new Pelikula(1, "Areto1", "Drama", 100, 9.5) };
		Aretoa a2 = new Aretoa(1, "Areto1", p1, "10/02/2024", "17:00-23:00");
		assertArrayEquals(p1, a2.getPelikulak());
	}

	@Test
	public void setPelikulaTest() {
		Pelikula[] p1 = new Pelikula[] { new Pelikula(1, "Areto1", "Drama", 100, 9.5) };
		Aretoa a2 = new Aretoa(1, "Areto1", p1, "10/02/2024", "17:00-23:00");
		Pelikula pelikulaBerria = new Pelikula(2, "Areto1", "Drama", 100, 9.5);
		Pelikula[] pelikulaBerriak = new Pelikula[] { pelikulaBerria };

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

	@Test
	public void toStringTest() {
		Pelikula[] pelikulak = { 
				new Pelikula(1, "Hulk", "Sci-fi", 120, 5.75),
				new Pelikula(3, "Handia", "Drama", 129, 5.75) };
		Aretoa aretoa = new Aretoa(1, "Zinema Aretoa", pelikulak, "2024-02-01", "18:00");

		String esperotakoa = "Aretoa [id=1, izena=Zinema Aretoa, pelikulak="
				+ "[Pelikula [id=1, izena=Hulk, generoa=Sci-fi, iraupena=120, prezioa=5.75], "
				+ "Pelikula [id=3, izena=Handia, generoa=Drama, iraupena=129, prezioa=5.75]], "
				+ "data=2024-02-01, ordutegia=18:00]";

		assertEquals(esperotakoa, aretoa.toString());
	}
	
	@Test
    public void equalsTest() {
        Pelikula[] pelikulak1 = {
            new Pelikula(1, "Hulk", "Sci-fi", 120, 5.75),
            new Pelikula(2, "Handia", "Drama", 150, 8.25)
        };
        Pelikula[] pelikulak2 = {
            new Pelikula(3, "Frankenstein", "Sci-fi", 136, 6.5),
            new Pelikula(4, "Planeta Simios", "Sci-fi", 162, 7.0)
        };

        Aretoa aretoa1 = new Aretoa(1, "Zinema Aretoa", pelikulak1, "2024-02-01", "18:00");
        Aretoa aretoa2 = new Aretoa(1, "Zinema Aretoa", pelikulak2, "2024-02-01", "18:00");
        Aretoa aretoa3 = new Aretoa(2, "Zinema Aretoa", pelikulak2, "2024-02-01", "18:00");

        assertTrue(aretoa1.equals(aretoa2)); // mismos valores, deberían ser iguales
        assertFalse(aretoa1.equals(aretoa3)); // diferente ID, deberían ser diferentes
    }

	/*@Test
	public void hashCodeTest() {
		Pelikula[] pelikulak = { 
				new Pelikula(1, "Hulk", "Sci-fi", 120, 5.75),
				new Pelikula(3, "Handia", "Drama", 129, 5.75) };
		Aretoa areto1 = new Aretoa(1, "Zinema Aretoa", pelikulak, "2024-02-01", "18:00");
		Aretoa areto2 = new Aretoa(1, "Zinema Aretoa", pelikulak, "2024-02-01", "18:00");

		int hashcode1 = areto1.hashCode();
		int hashcode2 = areto2.hashCode();

		assertEquals(hashcode1, hashcode2);
	}*/
}
