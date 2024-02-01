package Modelo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class SarreraTest {

    @Test
    public void getIdTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", 5, "14:00-00:00", 2, 5.50);
        assertEquals(1, s1.getId());
    }
    
    @Test
    public void setIdTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", 5, "14:00-00:00", 2, 5.50);
        s1.setId(4);
        assertEquals(4, s1.getId());
    }

    @Test
    public void getDataTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", 5, "14:00-00:00", 2, 5.50);
        assertEquals("30/01/24", s1.getData());
    }
    
    @Test
    public void setDataTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", 5, "14:00-00:00", 2, 5.50);
        s1.setData("31/01/24");
        assertEquals("31/01/24", s1.getData());
    }
    
    @Test
    public void getPelikulaTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", 5, "14:00-00:00", 2, 5.50);
        assertEquals(5, s1.getFilma());
    }
    
    @Test
    public void setPelikulaTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", 5, "14:00-00:00", 2, 5.50);
        s1.setFilma(4);
        assertEquals(4, s1.getFilma());
    }
    
    @Test
    public void getOrdutegiaTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", 5, "14:00-00:00", 2, 5.50);
        assertEquals("14:00-00:00", s1.getOrdutegia());
    }
    
    @Test
    public void setOrdutegiaTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", 5, "14:00-00:00", 2, 5.50);
        s1.setOrdutegia("15:00-20:00");
        assertEquals("15:00-20:00", s1.getOrdutegia());
    }
    
    @Test
    public void getAretoaTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", 5, "14:00-00:00", 2, 5.50);
        assertEquals(2, s1.getAreto());
    }
    
    @Test
    public void setAretoaTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", 5, "14:00-00:00", 2, 5.50);
        s1.setAreto(6);
        assertEquals(6, s1.getAreto());
    }
    
    @Test
    public void getPrezioaTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", 5, "14:00-00:00", 2, 5.50);
        assertEquals(5.50, s1.getPrezioa(), 0.001);
    }
    
    @Test
    public void setPrezioaTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", 5, "14:00-00:00", 2, 5.50);
        s1.setPrezioa(6.90);
        assertEquals(6.90, s1.getPrezioa(), 0.001);
    }
    
    @Test
    public void testToString() {
        Sarrera sarrera = new Sarrera(1, "2024-02-01", 123, "18:00", 5, 10.50);
        String esperotakoa = "Sarrera [id=1, data=2024-02-01, filma=123, ordutegia=18:00, areto=5, prezioa=10.5]";
        assertEquals(esperotakoa, sarrera.toString());
    }

    /*@Test
    public void testHashCode() {
        Sarrera sarrera1 = new Sarrera(1, "2024-02-01", 123, "18:00", 5, 10.50);
        Sarrera sarrera2 = new Sarrera(1, "2024-02-01", 123, "18:00", 5, 10.50);
        assertEquals(sarrera1.hashCode(), sarrera2.hashCode());
    }*/

    @Test
    public void testEquals() {
        Sarrera sarrera1 = new Sarrera(1, "2024-02-01", 123, "18:00", 5, 10.50);
        Sarrera sarrera2 = new Sarrera(1, "2024-02-01", 123, "18:00", 5, 10.50);
        Sarrera sarrera3 = new Sarrera(2, "2024-02-02", 456, "20:00", 7, 15.75);

        assertTrue(sarrera1.equals(sarrera2));
        assertFalse(sarrera1.equals(sarrera3));
    }
}