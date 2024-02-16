package Controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Modelo.Karteldegia;
import Modelo.Pelikula;
import Modelo.Zinema;
import Modelo.DatuBasea.ZinemaDAO;

public class Main {

	// Ejemplo de cómo usar el método
	public static void main(String[] args) {
            Zinema[] zinemak = null;
			ZinemaDAO ZinemaDao = new ZinemaDAO();
            zinemak = ZinemaDao.zinemakJaso(); 
            for (int i = 0;i<zinemak.length;i++) {
            System.out.println(zinemak[i]);
            }
        }
}

