package Modelo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class BezeroaTest {

	@Test
	public void getNANtest() {
		Bezeroa b1 = new Bezeroa("15852645K", "Laura", "Garcia", 'E', "1234");
		assertEquals("15852645K", b1.getNAN());
	}
	
	@Test
	public void setNANTest() {
		Bezeroa b1 = new Bezeroa("15852645K", "Laura", "Garcia", 'E', "1234");
		b1.setNAN("77747747P");
		assertEquals("77747747P", b1.getNAN());
	}
	
	@Test
	public void getIzenatest() {
		Bezeroa b1 = new Bezeroa("15852645K", "Laura", "Garcia", 'E', "1234");
		assertEquals("Laura", b1.getIzena());
	}
	
	@Test
	public void setIzenaTest() {
		Bezeroa b1 = new Bezeroa("15852645K", "Laura", "Garcia", 'E', "1234");
		b1.setIzena("Juanjo");
		assertEquals("Juanjo", b1.getIzena());
	}
	
	@Test
	public void getAbizenatest() {
		Bezeroa b1 = new Bezeroa("15852645K", "Laura", "Garcia", 'E', "1234");
		assertEquals("Garcia", b1.getAbizena());
	}
	
	@Test
	public void setAbizenaTest() {
		Bezeroa b1 = new Bezeroa("15852645K", "Laura", "Garcia", 'E', "1234");
		b1.setAbizena("Torres");
		assertEquals("Torres", b1.getAbizena());
	}
	
	@Test
	public void getSexuaTest() {
		Bezeroa b1 = new Bezeroa("15852645K", "Laura", "Garcia", 'E', "1234");
		assertEquals('E', b1.getSexua());
	}
	
	@Test
	public void setSexuaTest() {
		Bezeroa b1 = new Bezeroa("15852645K", "Laura", "Garcia", 'E', "1234");
		b1.setSexua('G');
		assertEquals('G', b1.getSexua());
	}
	
	@Test
	public void getPasahitzaTest() {
		Bezeroa b1 = new Bezeroa("15852645K", "Laura", "Garcia", 'E', "1234");
		assertEquals("1234", b1.getPasahitza());
	}
	
	@Test
	public void setPasahitzaTest() {
		Bezeroa b1 = new Bezeroa("15852645K", "Laura", "Garcia", 'E', "1234");
		b1.setPasahitza("11111");
		assertEquals("11111", b1.getPasahitza());
	}
	
	@Test
    public void toStringTest() {
        Bezeroa bezeroa = new Bezeroa("12345678A", "Unai", "Souto", 'M', "1234");
        String esperotakoa = "Bezeroa [NAN=12345678A, izena=Unai, abizena=Souto, sexua=M, pasahitza=1234]";
        assertEquals(esperotakoa, bezeroa.toString());
    }

    /*@Test
    public void testHashCode() {
        Bezeroa bezeroa1 = new Bezeroa("12345678A", "Unai", "Souto", 'M', "1234");
        Bezeroa bezeroa2 = new Bezeroa("12345678A", "Unai", "Souto", 'M', "1234");
        assertEquals(bezeroa1.hashCode(), bezeroa2.hashCode());
    }*/

    @Test
    public void equalsTest() {
        Bezeroa bezeroa1 = new Bezeroa("12345678A", "Unai", "Souto", 'M', "1234");
        Bezeroa bezeroa2 = new Bezeroa("12345678A", "Unai", "Souto", 'M', "1234");
        Bezeroa bezeroa3 = new Bezeroa("87654321B", "Aitor", "Mentxaka", 'M', "123");

        assertTrue(bezeroa1.equals(bezeroa2));
        assertFalse(bezeroa1.equals(bezeroa3));
    }
}
