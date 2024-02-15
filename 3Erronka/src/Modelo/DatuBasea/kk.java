package Modelo.DatuBasea;

import java.sql.*;

public class kk {

	public static void main(String[] args) {

		String herria = "Bilbao";
		String url = "jdbc:mysql://localhost:3306/db_EnpresaProg";
		String user = "root";
		String pass = "elorrieta";
		Connection conn;

		try {

			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Konektatuta");
			// Prestatu sententzia
			Statement s1 = conn.createStatement();
			String sql = "select * from empleados where salario in (select max(salario) from empleados)";
			ResultSet lerroak = s1.executeQuery(sql);
			while (lerroak.next()) {
				System.out.print(lerroak.getString("apellido") + "\t");
				System.out.print(lerroak.getString("salario") + "\t");
				System.out.print(lerroak.getString("dept_no") + "\t");
				System.out.println("");
			}
		} catch (Exception sqe) {
			sqe.printStackTrace();
		}
	}
}