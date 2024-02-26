package Controlador;

import Vista.VLoginPantaila;
import Vista.VOngiEtorria;
import Vista.VZinemaAukeraketa;
import DatuBasea.PelikulaDAO;
import DatuBasea.ZinemaDAO;
import Modelo.Zinema;

public class Main {

	public static void main(String[] args) {
		PelikulaDAO filmak = new PelikulaDAO();
		ZinemaDAO zinem = new ZinemaDAO();
		// Funtzioari deitzen diot jakiteko zenbat zinema dauden datu basean
		int zenbatZinema = zinem.zenbatZinema();
		Zinema[] zinemak = new Zinema[zenbatZinema];
		for (int i = 0; i < zinemak.length; i++) {
			zinemak[i] = zinem.zinemaJaso(i + 1);
		}
		// OngiEtorri lehioa hasieratu, baina ez erakutsi oraindik
		VOngiEtorria vOngiEtorri = new VOngiEtorria();

		// OngiEtorri lehiotik hasi temporizadorea
		vOngiEtorri.setVisible(true);

		// Irudiaren gainean klik egiten esperatu, temporizadorea hasi arte
		while (!vOngiEtorri.isStartProgress()) {
			try {
				Thread.sleep(100); // 100 milisegundu itxaron berriro egin arte
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// 3 segundu itxaron
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Temporizadorea amaitu ondoren, OngiEtorri lehioa itxi
		vOngiEtorri.dispose();

		// Sartu saioa pantaila
		VLoginPantaila vLogin = new VLoginPantaila();
		vLogin.setVisible(true);
		VZinemaAukeraketa vZinemaMenu = new VZinemaAukeraketa(zinemak, 0);
		vZinemaMenu.setVisible(false);

		// Saioa pantaila ixten denean itxaron
		while (vLogin.isVisible()) {
			try {
				Thread.sleep(100); // 100 milisegundu itxaron
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		vZinemaMenu.setVisible(true);
	}
}
