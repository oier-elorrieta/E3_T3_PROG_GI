package Testak;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DatuBasea.Konexioa;

public class KonexioaTest {

    private Konexioa konexioa;

    @Before
    public void setUp() throws Exception {
        konexioa = new Konexioa();
    }

    @After
    public void tearDown() throws Exception {
        konexioa.deskonektatu();
    }

    @Test
    public void testKonektatu() {
        try {
            Connection konektatu = konexioa.konektatu();
            assertNotNull(konektatu);
            // Konprobatzen dugu ia Datu Basearekin konektatu gara. AssertFalse ondo egiten
            // bada, ondo dago (datu basea ez dago itxita)
            assertFalse(konektatu.isClosed());
        } catch (SQLException e) {
            fail("Errorea: " + e.getMessage());
        }
    }

    @Test
    public void testDeskonektatu() {
        try {
            Connection konektatu = konexioa.konektatu();
            konexioa.deskonektatu();
            // Konprobatzen dugu ia Datu Basearekin deskonektatu gara. AssertTrue ondo egiten
            // bada, ondo dago (datu basea itxita dago)
            assertTrue(konektatu.isClosed());
        } catch (SQLException e) {
            fail("Errorea: " + e.getMessage());
        }
    }
}