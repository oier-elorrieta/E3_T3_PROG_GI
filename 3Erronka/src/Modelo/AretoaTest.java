package Modelo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AretoaTest {

	//***** ID TEST *****
	@Test
	public void getIdTest() {
		Aretoa a1 = new Aretoa(1, "Areto1");
		assertEquals(1, a1.getId());
	}

	@Test
	public void setIdTest() {
		Aretoa a1 = new Aretoa(1, "Areto1");
		a1.setId(3);
		assertEquals(3, a1.getId());
	}

	//***** IZENA TEST *****
	@Test
	public void getIzenaTest() {
		Aretoa a1 = new Aretoa(1, "Areto1");
		assertEquals("Areto1", a1.getIzena());
	}

	@Test
	public void setIzenaTest() {
		Aretoa a1 = new Aretoa(1, "Areto1");
		a1.setIzena("Areto77");
		assertEquals("Areto77", a1.getIzena());
	}

	//***** TOSTRING TEST *****
	@Test
	public void toStringTest() {
		Aretoa a1 = new Aretoa(1, "Areto1");

		String esperotakoa = "Aretoa [id=1, izena=Areto1]";

		assertEquals(esperotakoa, a1.toString());
	}
	
	//***** EQUALS TEST *****
	@Test
    public void equalsTest() {

        Aretoa aretoa1 = new Aretoa(1, "Areto1");
        Aretoa aretoa2 = new Aretoa(1, "Areto1");
        Aretoa aretoa3 = new Aretoa(2, "Areto1");

        assertTrue(aretoa1.equals(aretoa2)); // balore berdinak, aretoak berdinak izan beharko dira
        assertFalse(aretoa1.equals(aretoa3)); // Id desberdinak, aretoak desberdinak izan beharko dira
        assertFalse(aretoa1.equals(null));
    }
}
