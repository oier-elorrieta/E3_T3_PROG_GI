package Modelo;

import java.util.Objects;

public class Saioa {
	private int id;
	private String ordutegia;
	private String data;
	private Pelikula pelikula;
	private Aretoa aretoa;
	
	public Saioa(int id, String ordutegia, String data, Pelikula pelikula, Aretoa aretoa) {
		this.id = id;
		this.ordutegia = ordutegia;
		this.data = data;
		this.pelikula = pelikula;
		this.aretoa = aretoa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrdutegia() {
		return ordutegia;
	}

	public void setOrdutegia(String ordutegia) {
		this.ordutegia = ordutegia;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Pelikula getPelikula() {
		return pelikula;
	}

	public void setPelikula(Pelikula pelikula) {
		this.pelikula = pelikula;
	}
	
	public Aretoa getSaioa() {
		return aretoa;
	}

	public void setSaioa(Aretoa aretoa) {
		this.aretoa = aretoa;
	}

	public Aretoa getAretoa() {
		return aretoa;
	}

	public void setAretoa(Aretoa aretoa) {
		this.aretoa = aretoa;
	}

	@Override
	public String toString() {
		return "Saioa [id=" + id + ", ordutegia=" + ordutegia + ", data=" + data + ", pelikula=" + pelikula + ", aretoa="+ aretoa +"]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Saioa other = (Saioa) obj;
		return Objects.equals(data, other.data) && id == other.id && Objects.equals(ordutegia, other.ordutegia)
				&& Objects.equals(pelikula, other.pelikula);
	}
	
	
}
