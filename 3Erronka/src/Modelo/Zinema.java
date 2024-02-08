package Modelo;

import java.util.Arrays;
import java.util.Objects;

public class Zinema {
	private int id;
	private String izena;
	private String kokapena;
	private int tlf;
	private Aretoa[] aretoak;
	private Saioa[] saioak;
	private String emaila;
	private String helbidea;
	
	public Zinema(int id, String izena, String helbidea, int tlf, Aretoa[] aretoak, Saioa[] saioak, String emaila) {
		this.id = id;
		this.izena = izena;
		this.helbidea = helbidea;
		this.tlf = tlf;
		this.aretoak = aretoak;
		this.saioak = saioak;
		this.emaila = emaila;
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

	public String getHelbidea() {
		return helbidea;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}
	
	public int getTlf() {
		return tlf;
	}

	public void setTlf(int tlf) {
		this.tlf = tlf;
	}

	public Aretoa[] getAretoak() {
		return aretoak;
	}

	public void setAretoak(Aretoa[] aretoak) {
		this.aretoak = aretoak;
	}

	public Saioa[] getSaioak() {
		return saioak;
	}

	public void setSaioak(Saioa[] saioak) {
		this.saioak = saioak;
	}

	public String getEmaila() {
		return emaila;
	}

	public void setEmaila(String emaila) {
		this.emaila = emaila;
	}

	@Override
	public String toString() {
		return "Zinema [id=" + id + ", izena=" + izena + ", helbidea=" + helbidea + ", tlf=" + tlf + ", aretoak="
				+ Arrays.toString(aretoak) + ", saioak=" + Arrays.toString(saioak) + ", emaila=" + emaila + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zinema other = (Zinema) obj;
		return Arrays.equals(aretoak, other.aretoak) && Objects.equals(emaila, other.emaila)
				&& Objects.equals(helbidea, other.helbidea) && id == other.id && Objects.equals(izena, other.izena)
				&& Objects.equals(kokapena, other.kokapena) && Arrays.equals(saioak, other.saioak) && tlf == other.tlf;
	}

	
	
	
}