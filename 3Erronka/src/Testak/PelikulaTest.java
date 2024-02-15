package Testak;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Modelo.Pelikula;

public class PelikulaTest {
	
	//***** ID TEST *****
	@Test
	public void getIdTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105);
		assertEquals(1, p1.getId());
	}
	
	@Test
	public void setIdTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105);
		p1.setId(9);
		assertEquals(9, p1.getId());
	}
	
	//***** IZENA TEST *****
	@Test
	public void getIzenaTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105);
		assertEquals("Hulk", p1.getIzena());
	}
	
	@Test
	public void setIzenaTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105);
		p1.setIzena("Handia");
		assertEquals("Handia", p1.getIzena());
	}
	
	//***** GENEROA TEST *****
	@Test
	public void getGeneroaTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105);
		assertEquals("Zientzia-fikzioa", p1.getGeneroa());
	}
	
	@Test
	public void setGeneroaTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105);
		p1.setGeneroa("Drama");
		assertEquals("Drama", p1.getGeneroa());
	}
	
	//***** IRAUPENA TEST *****
	@Test
	public void getIraupenaTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105);
		assertEquals(105, p1.getIraupena());
	}
	
	@Test
	public void setIraupenaTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105);
		p1.setIraupena(60);
		assertEquals(60, p1.getIraupena());
	}
	
	//***** TOSTRING TEST *****
	@Test
    public void testToString() {
        Pelikula pelikula = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105);
        String esperotakoa = "\nPelikula [id=1, izena=Hulk, generoa=Zientzia-fikzioa, iraupena=105]";
        assertEquals(esperotakoa, pelikula.toString());
    }

	//***** EQUALS TEST *****
    @Test
    public void testEquals() {
        Pelikula pelikula1 = new Pelikula(1, "Hulk", "Sci-fi", 120);
        Pelikula pelikula2 = new Pelikula(1, "Hulk", "Sci-fi", 120);
        Pelikula pelikula3 = new Pelikula(2, "Planeta Simios", "Sci-fi", 162);

        assertTrue(pelikula1.equals(pelikula2));
        assertFalse(pelikula1.equals(pelikula3));
        assertFalse(pelikula1.equals(null));
    }
}
