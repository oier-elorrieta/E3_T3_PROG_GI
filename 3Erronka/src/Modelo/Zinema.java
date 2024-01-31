package Modelo;

import java.util.Arrays;
import java.util.Objects;

public class Zinema {
	private int id;
	private String izena;
	private String kokapena;
	private int tlf;
	private Aretoa[] aretoa;
	private String emaila;
	private String ordutegia;
	private String helbidea;
	
	public Zinema(int id, String izena, String helbidea, int tlf, Aretoa[] aretoa, String emaila, String ordutegia) {
		this.id = id;
		this.izena = izena;
		this.helbidea = helbidea;
		this.tlf = tlf;
		this.aretoa = aretoa;
		this.emaila = emaila;
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
		return aretoa;
	}

	public void setAretoak(Aretoa[] aretoa) {
		this.aretoa = aretoa;
	}

	public String getEmaila() {
		return emaila;
	}

	public void setEmaila(String emaila) {
		this.emaila = emaila;
	}

	public String getOrdutegia() {
		return ordutegia;
	}

	public void setOrdutegia(String ordutegia) {
		this.ordutegia = ordutegia;
	}

	@Override
	public String toString() {
		return "Zinema [id=" + id + ", izena=" + izena + ", kokapena=" + kokapena + ", tlf=" + tlf + ", aretoa="
				+ Arrays.toString(aretoa) + ", emaila=" + emaila + ", ordutegia=" + ordutegia + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(emaila, izena, kokapena, ordutegia, tlf);
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
		return Objects.equals(emaila, other.emaila) && Objects.equals(izena, other.izena)
				&& Objects.equals(kokapena, other.kokapena) && Objects.equals(ordutegia, other.ordutegia)
				&& tlf == other.tlf;
	}
	
	
}