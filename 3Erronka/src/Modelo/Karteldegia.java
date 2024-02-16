package Modelo;

import java.util.Arrays;

public class Karteldegia {

	private Pelikula[] pelikulak;

	public Karteldegia(Pelikula[] pelikulak) {
		this.pelikulak = pelikulak;
	}

	public Pelikula[] getPelikulak() {
		return pelikulak;
	}

	public void setPelikulak(Pelikula[] pelikulak) {
		this.pelikulak = pelikulak;
	}

	public Pelikula getPelikulaId(int id) {
		Pelikula p1 = null;
		// Aqui buscas la peli dentro del array por id. Si la encuentra, la retornas.
		for (int i = 0; i <this.pelikulak.length; i++) {
			if (id == pelikulak[i].getId()) {
				p1 = pelikulak[i];
			}
		}
		return p1;
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
