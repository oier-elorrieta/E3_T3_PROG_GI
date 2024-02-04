package Modelo;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class KarteldegiaTest {

	@Test
	public void testGetPelikulak() {
		Pelikula[] pelikulak = { new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105, 8.25), };
		Karteldegia karteldegia = new Karteldegia(pelikulak);

		assertArrayEquals(pelikulak, karteldegia.getPelikulak());
	}

	@Test
	public void testSetPelikulak() {
		Pelikula[] pelikulak = { new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105, 8.25), };
		Karteldegia karteldegia = new Karteldegia(new Pelikula[0]);

		karteldegia.setPelikulak(pelikulak);
		assertArrayEquals(pelikulak, karteldegia.getPelikulak());
	}

	@Test
	public void testToString() {
		Pelikula[] pelikulak = {new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105, 8.25),
        };
		Karteldegia karteldegia = new Karteldegia(pelikulak);

		String expected = "Karteldegia [pelikulak=[Pelikula [id=1, izena=Hulk, generoa=Zientzia-fikzioa, iraupena=105, prezioa=8.25]]]";
		assertEquals(expected, karteldegia.toString());
	}

	@Test
	public void testEquals() {
		Pelikula[] pelikulak1 = { new Pelikula(1, "El Padrino", "Drama", 180, 10.99),
				new Pelikula(2, "Pulp Fiction", "Thriller", 154, 9.99) };
		Pelikula[] pelikulak2 = { new Pelikula(1, "El Padrino", "Drama", 180, 10.99),
				new Pelikula(2, "Pulp Fiction", "Thriller", 154, 9.99) };
		Pelikula[] pelikulak3 = { new Pelikula(4, "El Padrino", "Drama", 180, 10.99),
				new Pelikula(5, "Pulp Fiction", "Thriller", 154, 9.99) };

		Karteldegia karteldegia1 = new Karteldegia(pelikulak1);
		Karteldegia karteldegia2 = new Karteldegia(pelikulak2);
		Karteldegia karteldegia3 = new Karteldegia(pelikulak3);

		assertTrue(karteldegia1.equals(karteldegia2));
		assertFalse(karteldegia1.equals(karteldegia3));
		assertFalse(karteldegia1.equals(null));
	}
}
