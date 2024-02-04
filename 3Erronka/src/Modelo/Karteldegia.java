package Modelo;

import java.util.Arrays;

public class Karteldegia {

	private Pelikula[] pelikulak;
	
	public Karteldegia(Pelikula [] pelikulak) {
		this.pelikulak = pelikulak;
	}

	public Pelikula[] getPelikulak() {
		return pelikulak;
	}

	public void setPelikulak(Pelikula[] pelikulak) {
		this.pelikulak = pelikulak;
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
