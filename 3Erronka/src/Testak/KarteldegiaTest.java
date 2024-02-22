package Testak;

import org.junit.Test;

import Modelo.Karteldegia;
import Modelo.Pelikula;

import static org.junit.Assert.*;

import org.junit.Test;

public class KarteldegiaTest {

	@Test
	public void testGetPelikulak() {
		Pelikula[] pelikulak = { new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105) };
		Karteldegia karteldegia = new Karteldegia(pelikulak);

		assertArrayEquals(pelikulak, karteldegia.getPelikulak());
	}

	@Test
	public void testSetPelikulak() {
		Pelikula[] pelikulak = { new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105) };
		Karteldegia karteldegia = new Karteldegia(new Pelikula[0]);

		karteldegia.setPelikulak(pelikulak);
		assertArrayEquals(pelikulak, karteldegia.getPelikulak());
	}

	@Test
	public void testToString() {
		Pelikula[] pelikulak = {new Pelikula(1, "Hulk", "Zientzia-fikzioa", 105)
        };
		Karteldegia karteldegia = new Karteldegia(pelikulak);

		String expected = "Karteldegia [pelikulak=[\nPelikula [id=1, izena=Hulk, generoa=Zientzia-fikzioa, iraupena=105]]]";
		assertEquals(expected, karteldegia.toString());
	}

	@Test
	public void testEquals() {
		Pelikula[] pelikulak1 = { new Pelikula(1, "El Padrino", "Drama", 180),
				new Pelikula(2, "Pulp Fiction", "Thriller", 154) };
		Pelikula[] pelikulak2 = { new Pelikula(1, "El Padrino", "Drama", 180),
				new Pelikula(2, "Pulp Fiction", "Thriller", 154) };
		Pelikula[] pelikulak3 = { new Pelikula(4, "El Padrino", "Drama", 180),
				new Pelikula(5, "Pulp Fiction", "Thriller", 154) };

		Karteldegia karteldegia1 = new Karteldegia(pelikulak1);
		Karteldegia karteldegia2 = new Karteldegia(pelikulak2);
		Karteldegia karteldegia3 = new Karteldegia(pelikulak3);

		assertTrue(karteldegia1.equals(karteldegia2));
		assertFalse(karteldegia1.equals(karteldegia3));
		assertFalse(karteldegia1.equals(null));
	}
	
	@Test
    public void testGetPelikulaId_PelikulakNull() {
        Pelikula[] pelikulak = null;
        Karteldegia karteldegia = new Karteldegia(pelikulak);
        Pelikula result = karteldegia.getPelikulaId(1);
        assertNull(result);
    }

    @Test
    public void testGetPelikulaId_PelikulakHutzik() {
        Pelikula[] pelikulak = new Pelikula[0];
        Karteldegia karteldegia = new Karteldegia(pelikulak);
        Pelikula result = karteldegia.getPelikulaId(1);
        assertNull(result);
    }

    @Test
    public void testGetPelikulaId_IdEzAurkitzen() {
        Pelikula[] pelikulak = {
            new Pelikula(1, "Pelikula1", "Generoa1", 90),
            new Pelikula(2, "Pelikula2", "Generoa2", 120),
            new Pelikula(3, "Pelikula3", "Generoa3", 105)
        };
        Karteldegia karteldegia = new Karteldegia(pelikulak);
        Pelikula result = karteldegia.getPelikulaId(5);
        assertNull(result);
    }

    @Test
    public void testGetPelikulaId_IdAurkitzen() {
        Pelikula[] pelikulak = {
            new Pelikula(1, "Pelikula1", "Generoa1", 90),
            new Pelikula(2, "Pelikula2", "Generoa2", 120),
            new Pelikula(3, "Pelikula3", "Generoa3", 105)
        };
        Karteldegia karteldegia = new Karteldegia(pelikulak);
        Pelikula result = karteldegia.getPelikulaId(2);
        assertEquals("Pelikula2", result.getIzena());
    }
}
