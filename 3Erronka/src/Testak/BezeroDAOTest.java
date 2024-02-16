package Testak;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.BezeroDAO;
import Modelo.Bezeroa;

public class BezeroDAOTest {
    private Connection conexion;

    @Before
    public void setUp() throws SQLException {
        // Establecer conexión con una base de datos en memoria (HSQLDB)
        conexion = DriverManager.getConnection("jdbc:hsqldb:mem:testdb", "sa", "");
        // Crear la tabla de prueba y agregar algunos datos de prueba
        try (Statement statement = conexion.createStatement()) {
            statement.execute("CREATE TABLE bezeroa (NAN VARCHAR(10), abizena VARCHAR(50), generoa CHAR(1), erabiltzailea VARCHAR(50), pasahitza VARCHAR(50))");
            statement.execute("INSERT INTO bezeroa (NAN, abizena, generoa, erabiltzailea, pasahitza) VALUES ('123456789A', 'Lopez', 'M', 'juanito', 'secreto')");
            statement.execute("INSERT INTO bezeroa (NAN, abizena, generoa, erabiltzailea, pasahitza) VALUES ('987654321Z', 'Perez', 'F', 'laurita', 'clave')");
        }
    }

    @After
    public void tearDown() throws SQLException {
        // Eliminar la tabla de prueba y cerrar la conexión
        try (Statement statement = conexion.createStatement()) {
            statement.execute("DROP TABLE bezeroa");
        }
        conexion.close();
    }

    @Test
    public void bezeroakJasoTest() {
        BezeroDAO bezeroDAO = new BezeroDAO(conexion);
        List<Bezeroa> bezeroak = bezeroDAO.bezeroakJaso();
        assertEquals(2, bezeroak.size());
        
        // Comprobando el primer bezero
        Bezeroa bezero1 = bezeroak.get(0);
        assertEquals("123456789A", bezero1.getNAN());
        assertEquals("Lopez", bezero1.getAbizena());
        assertEquals('M', bezero1.getGeneroa());
        assertEquals("juanito", bezero1.getErabiltzailea());
        assertEquals("secreto", bezero1.getPasahitza());
        
        // Comprobando el segundo bezero
        Bezeroa bezero2 = bezeroak.get(1);
        assertEquals("987654321Z", bezero2.getNAN());
        assertEquals("Perez", bezero2.getAbizena());
        assertEquals('F', bezero2.getGeneroa());
        assertEquals("laurita", bezero2.getErabiltzailea());
        assertEquals("clave", bezero2.getPasahitza());
    }
}
