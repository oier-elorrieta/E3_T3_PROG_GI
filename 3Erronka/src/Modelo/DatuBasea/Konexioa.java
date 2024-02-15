package Modelo.DatuBasea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Konexioa {

	// Datu basearen konexio datuak
	private static final String url = "jdbc:mysql://localhost:3306/tu_base_de_datos";
	private static final String erabiltzailea = "tu_usuario";
	private static final String pasahitza = "tu_contraseña";

	private Connection konek = null;

	// DB-rekin konektatzeko funtzioa
	public Connection konektatu() {
		
		try {
			// Cargar el driver de MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establecer la conexión
			konek = DriverManager.getConnection(url, erabiltzailea, pasahitza);
			System.out.println("Konektatuta!");
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("Ezin izan da Datu Basearekin konektatu: " + e.getMessage());
		}
		return konek;
	}

	// DB-rekin konexioa ixteko funtzioa
	public void deskonektatu() {
		if (konek != null) {
			try {
				konek.close();
				System.out.println("Konexioa itxita");
			} catch (SQLException e) {
				System.err.println("Konexioa ezin da itxi " + e.getMessage());
			}
		}
	}
}
