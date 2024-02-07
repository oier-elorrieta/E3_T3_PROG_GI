package Modelo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class SarreraTest {
	
	//***** ID TEST *****
    @Test
    public void getIdTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", null, 5.50);
        assertEquals(1, s1.getId());
    }
    
    @Test
    public void setIdTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", null, 5.50);
        s1.setId(4);
        assertEquals(4, s1.getId());
    }

    //***** DATA TEST *****
    @Test
    public void getDataTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", null, 5.50);
        assertEquals("30/01/24", s1.getData());
    }
    
    @Test
    public void setDataTest() {
        Sarrera s1 = new Sarrera(1, "30/01/24", null, 5.50);
        s1.setData("31/01/24");
        assertEquals("31/01/24", s1.getData());
    }
    
    //***** SAIOA TEST *****
    @Test
    public void getSaioaTest() {
    	Saioa saio1 = new Saioa(1, "10:00-12:00", "07/02/2024", null, null);
    	
    	Sarrera s1 = new Sarrera(1, "30/01/24", saio1, 5.50);
        assertEquals(saio1, s1.getSaioa());
    }
    
    @Test
    public void setSaioaTest() {
    	Saioa saio1 = new Saioa(1, "10:00-12:00", "07/02/2024", null, null);
    	
    	Sarrera s1 = new Sarrera(1, "30/01/24", null, 5.50);
        s1.setSaioa(saio1);
        assertEquals(saio1, s1.getSaioa());
    }
    
    //***** PREZIOA TEST *****
    @Test
    public void getPrezioaTest() {
    	Sarrera s1 = new Sarrera(1, "30/01/24", null, 5.50);
        assertEquals(5.50, s1.getPrezioa(), 0.001);
    }
    
    @Test
    public void setPrezioaTest() {
    	Sarrera s1 = new Sarrera(1, "30/01/24", null, 5.50);
        s1.setPrezioa(6.90);
        assertEquals(6.90, s1.getPrezioa(), 0.001);
    }
    
    //***** TOSTRING TEST *****
    @Test
    public void testToString() {
    	Sarrera s1 = new Sarrera(1, "30/01/24", null, 5.52);
        String esperotakoa = "Sarrera [id=1, data=30/01/24, saioa=null, prezioa=5.52]";
        assertEquals(esperotakoa, s1.toString());
    }

    //***** EQUALS TEST *****
    @Test
    public void testEquals() {
        Sarrera sarrera1 = new Sarrera(1, "30/01/24", null, 5.50);
        Sarrera sarrera2 = new Sarrera(1, "30/01/24", null, 5.50);
        Sarrera sarrera3 = new Sarrera(2, "30/01/24", null, 5.50);

        assertTrue(sarrera1.equals(sarrera2));
        assertFalse(sarrera1.equals(sarrera3));
        assertFalse(sarrera1.equals(null));
    }
}