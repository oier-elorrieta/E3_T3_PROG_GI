package Modelo;

import java.util.Objects;

public class Bezeroa {
	private String NAN;
	private String izena;
	private String abizena;
	private char sexua;
	private String pasahitza;
	
	public Bezeroa(String NAN, String izena, String abizena, char sexua, String pasahitza) {
		this.NAN = NAN;
		this.izena = izena;
		this.abizena = abizena;
		this.sexua = sexua;
		this.pasahitza = pasahitza;
	}

	public String getNAN() {
		return NAN;
	}

	public void setNAN(String nAN) {
		NAN = nAN;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public char getSexua() {
		return sexua;
	}

	public void setSexua(char sexua) {
		this.sexua = sexua;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	@Override
	public String toString() {
		return "Bezeroa [NAN=" + NAN + ", izena=" + izena + ", abizena=" + abizena + ", sexua=" + sexua + ", pasahitza="
				+ pasahitza + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(NAN, abizena, izena, pasahitza, sexua);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bezeroa other = (Bezeroa) obj;
		return Objects.equals(NAN, other.NAN) && Objects.equals(abizena, other.abizena)
				&& Objects.equals(izena, other.izena) && Objects.equals(pasahitza, other.pasahitza)
				&& sexua == other.sexua;
	}
	
}