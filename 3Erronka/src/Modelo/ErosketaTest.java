package Modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ErosketaTest {

	//***** ID TEST *****
	@Test
	public void getIdTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		assertEquals(1, e1.getId());
	}

	@Test
	public void setIdTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		e1.setId(2);
		assertEquals(2, e1.getId());
	}

	//***** KANTITATE TEST *****
	@Test
	public void getKantTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		assertEquals(4, e1.getKant());
	}

	@Test
	public void setKantTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		e1.setKant(6);
		assertEquals(6, e1.getKant());
	}
	
	//***** SARRERA TEST *****
		@Test
		public void getSarrerakTest() {
			
		}

		@Test
		public void setSarrerakTest() {
			
		}
	
	//***** DATA TEST *****
	@Test
	public void getDataTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		assertEquals("02/02/2024", e1.getData());
	}
	
	@Test
	public void setDataTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		e1.setData("02/03/2024");
		assertEquals("02/03/2024", e1.getData());
	}

	//***** DESKRIPTZIO TEST *****
	@Test
	public void getDeskTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		assertEquals("deskriptzioa", e1.getDesk());
	}
	
	@Test
	public void setDeskTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		e1.setDesk("deskrip");
		assertEquals("deskrip", e1.getDesk());
	}
	
	//***** DIRU_TOTALA TEST *****
	@Test
	public void getDiru_totalaTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		assertEquals(24.3, e1.getDiru_totala(), 0);
	}
	
	@Test
	public void toStringTest() {
		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);

		String esperotakoa = "Erosketa [id_erosketa=1, kant=4, data=02/02/2024, desk=deskriptzioa, diru_totala=24.3]";
		assertEquals(esperotakoa, e1.toString());
	}
	
	//***** EQUALS TEST *****
	@Test
    public void equalsTest() {

		Erosketa e1 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		Erosketa e2 = new Erosketa(1, 4, null, "02/02/2024", "deskriptzioa", 24.3);
		Erosketa e3 = new Erosketa(2, 4, null, "02/02/2024", "deskriptzioa", 24.3);

        assertTrue(e1.equals(e2)); // balore berdinak, aretoak berdinak izan beharko dira
        assertFalse(e1.equals(e3)); // Id desberdinak, aretoak desberdinak izan beharko dira
        assertFalse(e1.equals(null));
    }
}
