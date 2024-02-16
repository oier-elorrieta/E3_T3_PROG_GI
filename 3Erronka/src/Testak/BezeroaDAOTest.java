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

import Modelo.Bezeroa;
import Modelo.DatuBasea.BezeroDAO;

public class BezeroaDAOTest {
    private Connection conexion;

    @Before
    public void setUp() throws SQLException {
        // Establecer conexión con una base de datos en memoria (HSQLDB)
        conexion = DriverManager.getConnection("jdbc:hsqldb:mem:testdb", "sa", "");
        
        // Crear la tabla de prueba y agregar algunos datos de prueba
        try (Statement statement = conexion.createStatement()) {
         
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
        BezeroDAO bezeroDAO = new BezeroDAO();
        Bezeroa[] bezeroak = bezeroDAO.bezeroakJaso();
        assertEquals(2, bezeroak.length);
        
    }
}
