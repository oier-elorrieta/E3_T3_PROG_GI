package Modelo;

import java.util.Arrays;
import java.util.Objects;

public class Aretoa {
	private int id;
	private String izena;
	
	public Aretoa (int id, String izena) {
		this.id = id;
		this.izena = izena;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}
	@Override
	public String toString() {
		return "Aretoa [id=" + id + ", izena=" + izena + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aretoa other = (Aretoa) obj;
		return id == other.id && Objects.equals(izena, other.izena);
	}

		
}
