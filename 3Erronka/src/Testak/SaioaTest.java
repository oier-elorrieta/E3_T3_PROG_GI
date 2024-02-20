package Testak;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Test;

import Modelo.Aretoa;
import Modelo.Pelikula;
import Modelo.Saioa;

public class SaioaTest {

	//***** ID TEST *****
	@Test
	public void getIdTest() {
		Saioa s1 = new Saioa(1, null, null, null, null);
		assertEquals(1, s1.getId());
	}

	@Test
	public void setIdTest() {
		Saioa s1 = new Saioa(1, null, null, null, null);
		s1.setId(2);
		assertEquals(2, s1.getId());
	}

	//***** ORDUTEGIA TEST *****
	@Test
	public void getOrdutegiaTest() {
		LocalTime ordua = LocalTime.of(14, 30);
		Saioa s1 = new Saioa(1, ordua, null, null, null);
		assertEquals(ordua, s1.getOrdutegia());
	}

	@Test
	public void setOrdutegiaTest() {
		LocalTime ordua = LocalTime.of(14, 30);
		Saioa s1 = new Saioa(1, null, null, null, null);
		s1.setOrdutegia(ordua);
		assertEquals(ordua, s1.getOrdutegia());
	}
	
	//***** DATA TEST *****
	@Test
	public void getDataTest() {
		LocalDate data = LocalDate.of(2024, 02, 8);
		Saioa s1 = new Saioa(1, null, data, null, null);
		assertEquals(data, s1.getData());
	}
	
	@Test
	public void setDataTest() {
		LocalDate data = LocalDate.of(2024, 02, 8);
		Saioa s1 = new Saioa(1, null, null, null, null);
		s1.setData(data);
		assertEquals(data, s1.getData());
	}

	//***** PELIKULA TEST *****
	@Test
	public void getPelikulaTest() {
		Pelikula p1 = new Pelikula(1, "Handia", "Drama", 129);
		
		Saioa s1 = new Saioa(1, null, null, p1, null);
		assertEquals(p1, s1.getPelikula());
	}
	
	@Test
	public void setPelikulaTest() {
		Pelikula p1 = new Pelikula(1, "Handia", "Drama", 129);
		Saioa s1 = new Saioa(1, null, null, null, null);
		
		s1.setPelikula(p1);
		assertEquals(p1, s1.getPelikula());
	}
	
	// ***** ARETOA TEST *****
		@Test
		public void getAretoaTest() {
			Aretoa aretoa = new Aretoa (1, 1, "Areto1");
			Saioa s1 = new Saioa(1, null, null, null, aretoa);
			assertEquals(aretoa, s1.getAretoa());
		}

		@Test
		public void setAretoaTest() {
			Aretoa aretoa = new Aretoa (1, 1, "Areto1");
			Saioa s1 = new Saioa(1, null, null, null, null);
			s1.setAretoa(aretoa);
			assertEquals(aretoa, s1.getAretoa());
		}
	
	//***** TOSTRING TEST *****
	@Test
	public void toStringTest() {
		LocalTime ordua = LocalTime.of(14, 30);
		LocalDate data = LocalDate.of(2024, 02, 8);
		Saioa s1 = new Saioa(1, ordua, data, null, null);

		String esperotakoa = "Saioa [id=1, ordutegia=14:30, data=2024-02-08, pelikula=null, aretoa=null]";
		assertEquals(esperotakoa, s1.toString());
	}
	
	//***** EQUALS TEST *****
	@Test
    public void equalsTest() {

		Pelikula p1 = new Pelikula(1, "Handia", "Drama", 129);
		LocalTime ordua = LocalTime.of(14, 30);
		LocalDate data = LocalDate.of(2024, 02, 8);
		Saioa s1 = new Saioa(1, ordua, data, p1, null);
		Saioa s2 = new Saioa(1, ordua, data, p1, null);
		Saioa s3 = new Saioa(2, ordua, data, p1, null);

        assertTrue(s1.equals(s2)); // balore desberdinak, berdinak izan beharko dira
        assertFalse(s1.equals(s3)); // Id desberdina, desberdinak izan beharko dira
        assertFalse(s1.equals(null));
    }

}
