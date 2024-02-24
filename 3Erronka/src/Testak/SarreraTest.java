package Testak;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.BeforeClass;
import org.junit.Test;

import Modelo.Saioa;
import Modelo.Sarrera;

public class SarreraTest {
	
	//***** ID TEST *****
    @Test
    public void getIdTest() {
    	LocalDate data = LocalDate.of(2024, 02, 8);
        Sarrera s1 = new Sarrera(1, data, null, 5.50);
        assertEquals(1, s1.getId());
    }
    
    @Test
    public void setIdTest() {
    	LocalDate data = LocalDate.of(2024, 02, 8);
        Sarrera s1 = new Sarrera(1, data, null, 5.50);
        s1.setId(4);
        assertEquals(4, s1.getId());
    }

    //***** DATA TEST *****
    @Test
    public void getDataTest() {
    	LocalDate data = LocalDate.of(2024, 02, 8);
        Sarrera s1 = new Sarrera(1, data, null, 5.50);
        assertEquals(data, s1.getData());
    }
    
    @Test
    public void setDataTest() {
    	LocalDate data = LocalDate.of(2024, 02, 8);
        Sarrera s1 = new Sarrera(1, null, null, 5.50);
        s1.setData(data);
        assertEquals(data, s1.getData());
    }
    
    //***** SAIOA TEST *****
    @Test
    public void getSaioaTest() {
    	Saioa saio1 = new Saioa(1, null, null, null, null);
    	
    	LocalDate data = LocalDate.of(2024, 02, 8);
        Sarrera s1 = new Sarrera(1, data, saio1, 5.50);
        assertEquals(saio1, s1.getSaioa());
    }
    
    @Test
    public void setSaioaTest() {
    	Saioa saio1 = new Saioa(1, null, null, null, null);
    	
    	LocalDate data = LocalDate.of(2024, 02, 8);
        Sarrera s1 = new Sarrera(1, data, null, 5.50);
        s1.setSaioa(saio1);
        assertEquals(saio1, s1.getSaioa());
    }
    
    //***** PREZIOA TEST *****
    @Test
    public void getPrezioaTest() {
    	LocalDate data = LocalDate.of(2024, 02, 8);
        Sarrera s1 = new Sarrera(1, data, null, 5.50);
        assertEquals(5.50, s1.getPrezioa(), 0.001);
    }
    
    @Test
    public void setPrezioaTest() {
    	LocalDate data = LocalDate.of(2024, 02, 8);
        Sarrera s1 = new Sarrera(1, data, null, 5.50);
        s1.setPrezioa(6.90);
        assertEquals(6.90, s1.getPrezioa(), 0.001);
    }
    
    //***** TOSTRING TEST *****
    @Test
    public void testToString() {
    	LocalDate data = LocalDate.of(2024, 02, 8);
        Sarrera s1 = new Sarrera(1, data, null, 5.50);
        String esperotakoa = "Sarrera [id=1, data=2024-02-08, saioa=null, prezioa=5.5]";
        assertEquals(esperotakoa, s1.toString());
    }

    //***** EQUALS TEST *****
    @Test
    public void testEqualsDira() {
    	LocalDate data = LocalDate.of(2024, 02, 8);
        Sarrera sarrera1 = new Sarrera(1, data, null, 5.50);
        Sarrera sarrera2 = new Sarrera(1, data, null, 5.50);

        assertTrue(sarrera1.equals(sarrera2));
    }
    
    @Test
    public void testEqualsEz() {
    	LocalDate data = LocalDate.of(2024, 02, 8);
        Sarrera sarrera1 = new Sarrera(1, data, null, 5.50);
        Sarrera sarrera2 = new Sarrera(2, data, null, 5.50);

        assertFalse(sarrera1.equals(sarrera2));
    }
}