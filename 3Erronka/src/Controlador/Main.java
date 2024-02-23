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
		
		
		for (int i=0;i<zinemak.length;i++) {
			System.out.println(zinemak[i].getIzena());
			}

		try {
			OngiEtorri vOngiEtorri = new OngiEtorri();
			vOngiEtorri.setVisible(true);

			// Itxaron 3 segunduak
			Thread.sleep(3000);

			// lehioa itxi
			vOngiEtorri.dispose();

		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
			Login vLogin = new Login();
			vLogin.setVisible(true);
	
		
		try {
			ZinemaMenu vZinemaMenu = new ZinemaMenu(zinemak);
			vZinemaMenu.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

