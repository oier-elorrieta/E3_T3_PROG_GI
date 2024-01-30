package Modelo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class SarreraTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void getIdTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", null, "14:00-00:00", null, 5.50);
        assertEquals(1, s1.getId());
    }
    
    @Test
    public void setIdTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", null, "14:00-00:00", null, 5.50);
        s1.setId(4);
        assertEquals(4, s1.getId());
    }

    @Test
    public void getDataTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", null, "14:00-00:00", null, 5.50);
        assertEquals("30/01/24", s1.getData());
    }
    
    @Test
    public void setDataTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", null, "14:00-00:00", null, 5.50);
        s1.setData("31/01/24");
        assertEquals("31/01/24", s1.getData());
    }
    
    @Test
    public void getPelikulaTest() {
        Pelikula[] p1 = new Pelikula[] {
                new Pelikula(1, "Handia", "Drama", 120, 5.50)
            };
        Sarrera s1 = new Sarrera (1, "30/01/24", p1, "14:00-00:00", null, 5.50);
        assertArrayEquals(p1, s1.getFilma());
    }
    
    
    @Test
    public void setPelikulaTest() {
        Pelikula[] p1 = new Pelikula[] {
                new Pelikula(1, "Handia", "Drama", 120, 5.50)
            };
        Sarrera s1 = new Sarrera (1, "30/01/24", p1, "14:00-00:00", null, 5.50);
        Pelikula pBerri = new Pelikula(1, "Hulk", "Drama", 120, 5.50);
        Pelikula[] pBerria = new Pelikula[] {pBerri};
        s1.setFilma(pBerria);
        assertArrayEquals(pBerria, s1.getFilma());
    }
    
    @Test
    public void getOrdutegiaTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", null, "14:00-00:00", null, 5.50);
        assertEquals("14:00-00:00", s1.getOrdutegia());
    }
    
    @Test
    public void setOrdutegiaTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", null, "14:00-00:00", null, 5.50);
        s1.setOrdutegia("15:00-20:00");
        assertEquals("15:00-20:00", s1.getOrdutegia());
    }
    
    @Test
    public void getAretoaTest() {
        Aretoa[] a1 = new Aretoa[] {
                new Aretoa(1, "Areto1", null, "10/02/2024", "17:00-23:00")
            };
        Sarrera s1 = new Sarrera(1, "30/01/24", null, "14:00-00:00", a1, 5.50);
        assertArrayEquals(a1, s1.getAreto());
    }
    
    @Test
    public void setAretoaTest() {
        Aretoa[] a1 = new Aretoa[] {
                new Aretoa(1, "Areto1", null, "10/02/2024", "17:00-23:00")
            };
        Sarrera s1 = new Sarrera(1, "30/01/24", null, "14:00-00:00", a1, 5.50);
        Aretoa aretoBerri = new Aretoa (2, "Areto2", null, "10/02/2024", "17:00-23:00");
        Aretoa[] aretoBerria = new Aretoa[] {aretoBerri};
        
        s1.setAreto(aretoBerria);
        assertArrayEquals(aretoBerria, s1.getAreto());
    }
    
    @Test
    public void getPrezioaTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", null, "14:00-00:00", null, 5.50);
        assertEquals(5.50, s1.getPrezioa(), 0.001);
    }
    
    @Test
    public void setPrezioaTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", null, "14:00-00:00", null, 5.50);
        s1.setPrezioa(6.90);
        assertEquals(6.90, s1.getPrezioa(), 0.001);
    }
}