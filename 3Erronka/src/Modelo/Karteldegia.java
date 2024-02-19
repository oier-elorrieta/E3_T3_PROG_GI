package Modelo;

import java.util.Arrays;

import Modelo.DatuBasea.PelikulaDAO;

public class Karteldegia {

	private PelikulaDAO peliak = new PelikulaDAO();
	private Pelikula[] pelikulak = peliak.pelikulakJaso();

	public Karteldegia() {
		
	}
	
	public Karteldegia(Pelikula[] pelikulak) {
		this.pelikulak = pelikulak;
	}

	public Pelikula[] getPelikulak() {
		return pelikulak;
	}

	public void setPelikulak(Pelikula[] pelikulak) {
		this.pelikulak = pelikulak;
	}

	public Pelikula getPelikulaId(int id) { // hay que hacer el test JUnit
		if (pelikulak != null) {
			for (int i = 0; i < pelikulak.length; i++) {
				if (pelikulak[i].getId() == id) {
					return pelikulak[i];
				}
			}
		}
		return null; // Devuelve null si no se encuentra la película con la ID dada
	}

	@Override
	public String toString() {
		return "Karteldegia [pelikulak=" + Arrays.toString(pelikulak) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Karteldegia other = (Karteldegia) obj;
		return Arrays.equals(pelikulak, other.pelikulak);
	}

}
