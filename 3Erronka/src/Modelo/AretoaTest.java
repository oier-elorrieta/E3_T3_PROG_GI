package Modelo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AretoaTest {

	//***** ID TEST *****
	@Test
	public void getIdTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", "10/02/2024", "17:00-23:00");
		assertEquals(1, a1.getId());
	}

	@Test
	public void setIdTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", "10/02/2024", "17:00-23:00");
		a1.setId(3);
		assertEquals(3, a1.getId());
	}

	//***** IZENA TEST *****
	@Test
	public void getIzenaTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", "10/02/2024", "17:00-23:00");
		assertEquals("Areto1", a1.getIzena());
	}

	@Test
	public void setIzenaTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", "10/02/2024", "17:00-23:00");
		a1.setIzena("Areto77");
		assertEquals("Areto77", a1.getIzena());
	}

	//***** DATA TEST *****
	@Test
	public void getDataTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", "10/02/2024", "17:00-23:00");
		assertEquals("10/02/2024", a1.getData());
	}

	@Test
	public void setDataTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", "10/02/2024", "17:00-23:00");
		a1.setData("01/01/2020");
		assertEquals("01/01/2020", a1.getData());
	}

	//***** ORDUTEGIA TEST *****
	@Test
	public void getOrdutegiaTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", "10/02/2024", "17:00-23:00");
		assertEquals("17:00-23:00", a1.getOrdutegia());
	}

	@Test
	public void setOrdutegiaTest() {
		Aretoa a1 = new Aretoa(1, "Areto1", "10/02/2024", "17:00-23:00");
		a1.setOrdutegia("10:00-18:00");
		assertEquals("10:00-18:00", a1.getOrdutegia());
	}

	//***** TOSTRING TEST *****
	@Test
	public void toStringTest() {
		Aretoa aretoa = new Aretoa(1, "Zinema Aretoa", "2024-02-01", "18:00");

		String esperotakoa = "Aretoa [id=1, izena=Zinema Aretoa, data=2024-02-01, ordutegia=18:00]";

		assertEquals(esperotakoa, aretoa.toString());
	}
	
	//***** EQUALS TEST *****
	@Test
    public void equalsTest() {

        Aretoa aretoa1 = new Aretoa(1, "Zinema Aretoa", "2024-02-01", "18:00");
        Aretoa aretoa2 = new Aretoa(1, "Zinema Aretoa", "2024-02-01", "18:00");
        Aretoa aretoa3 = new Aretoa(2, "Zinema Aretoa", "2024-02-01", "18:00");

        assertTrue(aretoa1.equals(aretoa2)); // balore berdinak, aretoak berdinak izan beharko dira
        assertFalse(aretoa1.equals(aretoa3)); // Id desberdinak, aretoak desberdinak izan beharko dira
        assertFalse(aretoa1.equals(null));
    }
}
