package Testak;

import static org.junit.Assert.*;

import org.junit.Test;

import Vista.VLoginPantaila;

public class LoginaTest {

    @Test
    public void testLoginaOndo() {

        String erabiltzailea = "usou";
        String pasahitza = "12345";
        VLoginPantaila logina = new VLoginPantaila();

        boolean result = logina.loginaKonprobatu(erabiltzailea, pasahitza);

        assertTrue(result); // Eman kredentzial egokiak direnean emaitza egia den egiaztatzen du
    }

    @Test
    public void testLoginaTxarto() {

        String erabiltzailea = "usuarioInvalido";
        String pasahitza = "contraseñaIncorrecta";
        VLoginPantaila logina = new VLoginPantaila();

        boolean result = logina.loginaKonprobatu(erabiltzailea, pasahitza);

        assertFalse(result); // Eman kredentzial okerrak direnean emaitza gezurra den egiaztatzen du
    }


}