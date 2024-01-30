package Modelo;

import java.util.Objects;

public class Sarrera {
	private int id;
	private String data;
	private Pelikula filma;
	private String ordutegia;
	private Aretoa areto;
	private double prezioa;
	
	public Sarrera(int id, String data, Pelikula filma, String ordutegia, Aretoa areto, double prezioa) {
		this.id = id;
		this.data = data;
		this.filma = filma;
		this.ordutegia = ordutegia;
		this.areto = areto;
		this.prezioa = prezioa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Pelikula getFilma() {
		return filma;
	}

	public void setFilma(Pelikula filma) {
		this.filma = filma;
	}

	public String getOrdutegia() {
		return ordutegia;
	}

	public void setOrdutegia(String ordutegia) {
		this.ordutegia = ordutegia;
	}

	public Aretoa getAreto() {
		return areto;
	}

	public void setAreto(Aretoa areto) {
		this.areto = areto;
	}

	public double getPrezioa() {
		return prezioa;
	}

	public void setPrezioa(double prezioa) {
		this.prezioa = prezioa;
	}

	@Override
	public String toString() {
		return "Sarrera [id=" + id + ", data=" + data + ", filma=" + filma + ", ordutegia=" + ordutegia + ", areto="
				+ areto + ", prezioa=" + prezioa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(areto, data, filma, id, ordutegia, prezioa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sarrera other = (Sarrera) obj;
		return Objects.equals(areto, other.areto) && Objects.equals(data, other.data)
				&& Objects.equals(filma, other.filma) && id == other.id && Objects.equals(ordutegia, other.ordutegia)
				&& Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa);
	}
	
}