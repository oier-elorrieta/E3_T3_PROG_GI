package Testak;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import Modelo.Aretoa;

public class AretoaTest {

	//***** ID ZINEMA TEST *****
	@Test
	public void getIdZinemaTest() {
		Aretoa a1 = new Aretoa(1, 2,"Areto1");
		assertEquals(1, a1.getId_zinema());
	}

	@Test
	public void setIdZinemaTest() {
		Aretoa a1 = new Aretoa(0, 1, "Areto1");
		a1.setId_zinema(1);;
		assertEquals(1, a1.getId_zinema());
	}
	
	//***** ID ARETO TEST *****
		@Test
		public void getIdAretoTest() {
			Aretoa a1 = new Aretoa(1, 1, "Areto1");
			assertEquals(1, a1.getId_areto());
		}

		@Test
		public void setIdAretoTest() {
			Aretoa a1 = new Aretoa(1, 0, "Areto1");
			a1.setId_areto(1);
			assertEquals(1, a1.getId_areto());
		}

	//***** IZENA TEST *****
	@Test
	public void getIzenaTest() {
		Aretoa a1 = new Aretoa(1, 1, "Areto1");
		assertEquals("Areto1", a1.getIzena());
	}

	@Test
	public void setIzenaTest() {
		Aretoa a1 = new Aretoa(1, 1, "Areto1");
		a1.setIzena("Areto77");
		assertEquals("Areto77", a1.getIzena());
	}

	//***** TOSTRING TEST *****
	@Test
	public void toStringTest() {
		Aretoa a1 = new Aretoa(1, 1, "Areto1");

		String esperotakoa = "Aretoa [id_zinema=1, id_areto=1, izena=Areto1]";

		assertEquals(esperotakoa, a1.toString());
	}
	
	//***** EQUALS TEST *****
	@Test
    public void equalsDiraTest() {

        Aretoa aretoa1 = new Aretoa(1, 1, "Areto1");
        Aretoa aretoa2 = new Aretoa(1, 1, "Areto1");

        assertTrue(aretoa1.equals(aretoa2)); // balore berdinak, aretoak berdinak izan beharko dira
    }
	
	@Test
    public void equalsEzTest() {

        Aretoa aretoa1 = new Aretoa(1, 1, "Areto1");
        Aretoa aretoa2 = new Aretoa(2, 1, "Areto1");

        assertFalse(aretoa1.equals(aretoa2)); // Id desberdinak, aretoak desberdinak izan beharko dira

    }
}
