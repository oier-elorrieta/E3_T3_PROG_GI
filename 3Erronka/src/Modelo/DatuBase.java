package Modelo;

import java.sql.*;
import java.util.Properties;
    public class DatuBase {

        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3307/e3";
            String user = "root";
            String pass = "";
            Connection conn;
            try {
                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Konektatuta");
                // Prestatu sententzia
                Statement s1 = conn.createStatement();
                String sql = "select * "
                        +      "from aretoa ";
                ResultSet lerroak = s1.executeQuery(sql);

                while (lerroak.next()) {
                    System.out.print(lerroak.getString("id_aretoa") + "\t");
                    System.out.print(lerroak.getString("id_zinema") + "\t");
                    System.out.print(lerroak.getString("areto_izena") + "\t");
                    System.out.println("");
                }
            } catch (Exception sqe) {
                sqe.printStackTrace();
            }

        }

    }