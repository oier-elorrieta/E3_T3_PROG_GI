package Modelo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PelikulaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

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
	
	@Test
	public void setPrezioaTest() {
		Pelikula p1 = new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105, 8.25);
		p1.setPrezioa(10.5);
		 assertEquals(10.5, p1.getPrezioa(), 0.001);
	}
}
