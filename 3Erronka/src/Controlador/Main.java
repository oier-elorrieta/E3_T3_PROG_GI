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
		Zinema[] zinemak = new Zinema[4];
		ZinemaDAO zinem = new ZinemaDAO();
		zinemak[0] = zinem.zinemaJaso(1);
		zinemak[1] = zinem.zinemaJaso(2);
		zinemak[2] = zinem.zinemaJaso(3);
		zinemak[3] = zinem.zinemaJaso(4);

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
