package Modelo;

import java.util.Objects;

public class Pelikula {
	private int id;
	private String izena;
	private String generoa;
	private int iraupena;
	private double prezioa;
	
	public Pelikula(int id, String izena, String generoa, int iraupena, double prezioa) {
		this.id = id;
		this.izena = izena;
		this.generoa = generoa;
		this.iraupena = iraupena;
		this.prezioa = prezioa;
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

	public double getPrezioa() {
		return prezioa;
	}

	public void setPrezioa(double prezioa) {
		this.prezioa = prezioa;
	}

	@Override
	public String toString() {
		return "Pelikula [id=" + id + ", izena=" + izena + ", generoa=" + generoa + ", iraupena=" + iraupena
				+ ", prezioa=" + prezioa + "]";
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
				&& Objects.equals(izena, other.izena)
				&& Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa);
	}
	
}