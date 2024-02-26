package Modelo;

import java.util.Objects;

public class Aretoa {
	private int id_zinema;
	private int id_areto;
	private String izena;
	
	public Aretoa (int id_zinema, int id_areto, String izena) {
		this.id_zinema = id_zinema;
		this.id_areto = id_areto;
		this.izena = izena;
	}

	public int getId_zinema() {
		return id_zinema;
	}

	public void setId_zinema(int id_zinema) {
		this.id_zinema = id_zinema;
	}
	
	public int getId_areto() {
		return id_areto;
	}

	public void setId_areto(int id_areto) {
		this.id_areto = id_areto;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	@Override
	public String toString() {
		return "Aretoa [id_zinema=" + id_zinema + ", id_areto=" + id_areto + ", izena=" + izena + "]";
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
		return id_areto == other.id_areto && id_zinema == other.id_zinema && Objects.equals(izena, other.izena);
	}
	
	

		
}
