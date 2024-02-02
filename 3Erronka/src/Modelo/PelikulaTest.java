package Modelo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PelikulaTest {
	
	//***** ID TEST *****
	@Test
	public void getIdTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105, 8.25);
		assertEquals(1, p1.getId());
	}
	
	@Test
	public void setIdTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105, 8.25);
		p1.setId(9);
		assertEquals(9, p1.getId());
	}
	
	//***** IZENA TEST *****
	@Test
	public void getIzenaTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105, 8.25);
		assertEquals("Hulk", p1.getIzena());
	}
	
	@Test
	public void setIzenaTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105, 8.25);
		p1.setIzena("Handia");
		assertEquals("Handia", p1.getIzena());
	}
	
	//***** GENEROA TEST *****
	@Test
	public void getGeneroaTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105, 8.25);
		assertEquals("Zientzia-fikzioa", p1.getGeneroa());
	}
	
	@Test
	public void setGeneroaTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105, 8.25);
		p1.setGeneroa("Drama");
		assertEquals("Drama", p1.getGeneroa());
	}
	
	//***** IRAUPENA TEST *****
	@Test
	public void getIraupenaTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105, 8.25);
		assertEquals(105, p1.getIraupena());
	}
	
	@Test
	public void setIraupenaTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105, 8.25);
		p1.setIraupena(60);
		assertEquals(60, p1.getIraupena());
	}
	
	//***** PREZIOA TEST *****
	@Test
	public void setPrezioaTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105, 8.25);
		p1.setPrezioa(10.5);
		 assertEquals(10.5, p1.getPrezioa(), 0.001);
	}
	
	//***** TOSTRING TEST *****
	@Test
    public void testToString() {
        Pelikula pelikula = new Pelikula(1, "Hulk", "Sci-fi", 120, 5.75);
        String esperotakoa = "Pelikula [id=1, izena=Hulk, generoa=Sci-fi, iraupena=120, prezioa=5.75]";
        assertEquals(esperotakoa, pelikula.toString());
    }

	//***** EQUALS TEST *****
    @Test
    public void testEquals() {
        Pelikula pelikula1 = new Pelikula(1, "Hulk", "Sci-fi", 120, 5.75);
        Pelikula pelikula2 = new Pelikula(1, "Hulk", "Sci-fi", 120, 5.75);
        Pelikula pelikula3 = new Pelikula(2, "Planeta Simios", "Sci-fi", 162, 7.0);

        assertTrue(pelikula1.equals(pelikula2));
        assertFalse(pelikula1.equals(pelikula3));
    }
}
