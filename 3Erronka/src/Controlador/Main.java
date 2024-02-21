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
		PelikulaDAO filmak = new PelikulaDAO();
		Karteldegia karteldegi = new Karteldegia(filmak.pelikulakJaso());
		Zinema[] zinemak = new Zinema[4];
		ZinemaDAO zinem = new ZinemaDAO();
		zinemak[0] = zinem.zinemaJaso(1);
		zinemak[1] = zinem.zinemaJaso(2);
		zinemak[2] = zinem.zinemaJaso(3);
		zinemak[3] = zinem.zinemaJaso(4);
		Saioa[] s1 = (zinemak[0].getSaioak());
		for (int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
			}

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
		
		/*for (int i = 0; i < zinemak.length; i++) {
			System.out.println(zinemak[i]);
		}*/
		
		
		
		//System.out.println(zinemak[1]);

		/*Saioa[] saioak = null;
		SaioaDAO saio = new SaioaDAO();
		saioak = saio.saioakJaso();
		for (int i = 0; i < saioak.length; i++) {
			System.out.println(saioak[i]);
		}*/

	}
}
