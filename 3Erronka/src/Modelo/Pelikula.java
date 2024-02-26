package Modelo;

import java.util.Objects;

public class Pelikula {
	private int id;
	private String izena;
	private String generoa;
	private int iraupena;
	
	public Pelikula(int id, String izena, String generoa, int iraupena) {
		this.id = id;
		this.izena = izena;
		this.generoa = generoa;
		this.iraupena = iraupena;
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

	public String getGeneroa() {
		return generoa;
	}

	public void setGeneroa(String generoa) {
		this.generoa = generoa;
	}

	public int getIraupena() {
		return iraupena;
	}

	public void setIraupena(int iraupena) {
		this.iraupena = iraupena;
	}

	@Override
	public String toString() {
		return "\nPelikula [id=" + id + ", izena=" + izena + ", generoa=" + generoa + ", iraupena=" + iraupena + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelikula other = (Pelikula) obj;
		return Objects.equals(generoa, other.generoa) && id == other.id && iraupena == other.iraupena
				&& Objects.equals(izena, other.izena);
	}
	
}