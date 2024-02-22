package Modelo.DatuBasea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Konexioa {

	// Datu basearen konexio datuak
	private static final String url = "jdbc:mysql://localhost:3307/E3_talde3";
	private static final String erabiltzailea = "root";
	private static final String pasahitza = "";

	private Connection konektatu = null;

	// DB-rekin konektatzeko funtzioa
	public Connection konektatu() {
		if (konektatu == null) {
			try {
				// Establecer la conexión
				konektatu = DriverManager.getConnection(url, erabiltzailea, pasahitza);
				// System.out.println("Konektatuta!");
			} catch (SQLException e) {
				System.err.println("Ezin izan da Datu Basearekin konektatu: " + e.getMessage());
			}
		}

		return konektatu;
	}

	// DB-rekin konexioa ixteko funtzioa
	public void deskonektatu() {
		if (konektatu != null) {
			try {
				konektatu.close();
				// System.out.println("Konexioa itxita");
			} catch (SQLException e) {
				System.err.println("Konexioa ezin da itxi " + e.getMessage());
			}
		}
	}

}