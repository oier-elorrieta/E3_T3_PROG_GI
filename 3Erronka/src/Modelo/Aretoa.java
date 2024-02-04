package Modelo;

import java.util.Arrays;
import java.util.Objects;

public class Aretoa {
	private int id;
	private String izena;
	private Saioa[] saioak;
	private String data;
	private String ordutegia;
	
	public Aretoa (int id, String izena, Saioa[] saioak, String data, String ordutegia) {
		this.id = id;
		this.izena = izena;
		this.saioak = saioak;
		this.data = data;
		this.ordutegia = ordutegia;
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

	public Saioa[] getSaioak() {
		return saioak;
	}

	public void setSaioak(Saioa[] saioak) {
		this.saioak = saioak;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getOrdutegia() {
		return ordutegia;
	}

	public void setOrdutegia(String ordutegia) {
		this.ordutegia = ordutegia;
	}

	@Override
	public String toString() {
		return "Aretoa [id=" + id + ", izena=" + izena + ", saioak=" + Arrays.toString(saioak) + ", data=" + data
				+ ", ordutegia=" + ordutegia + "]";
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
		return Objects.equals(data, other.data) && id == other.id && Objects.equals(izena, other.izena)
				&& Objects.equals(ordutegia, other.ordutegia);
	}
	
}
