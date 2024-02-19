package Controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Modelo.Karteldegia;
import Modelo.Pelikula;
import Modelo.Saioa;
import Modelo.Zinema;
import Modelo.DatuBasea.PelikulaDAO;
import Modelo.DatuBasea.SaioaDAO;
import Modelo.DatuBasea.ZinemaDAO;
import Vista.Login;
import Vista.OngiEtorri;
import Vista.ZinemaMenu;

public class Main {
	
	public static void main(String[] args) {
		Zinema[] zinemak = null;
		ZinemaDAO zinem = new ZinemaDAO();
		zinemak = zinem.zinemakJaso();
		try {
			OngiEtorri vOngiEtorri = new OngiEtorri();
			vOngiEtorri.setVisible(true);

			// Itxaron 3 segunduak
			Thread.sleep(4000);

			// lehioa itxi
			vOngiEtorri.dispose();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// ***************************
		// LOGIN
		// ***************************

		try {
			Login frame = new Login();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*Zinema[] zinemak = null;
		ZinemaDAO zinem = new ZinemaDAO();
		zinemak = zinem.zinemakJaso();
		for (int i = 0; i < zinemak.length; i++) {
			System.out.println(zinemak[i]);
		}*/

		Saioa[] saioak = null;
		SaioaDAO saio = new SaioaDAO();
		saioak = saio.saioakJaso();
		for (int i = 0; i < saioak.length; i++) {
			System.out.println(saioak[i]);
		}

	}
}
