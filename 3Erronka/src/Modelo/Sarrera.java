package Modelo;

import java.util.Objects;

public class Sarrera {
	private int id;
	private String data;
	private int filma;
	private String ordutegia;
	private int areto;
	private double totala;
	
	public Sarrera(int id, String data, int filma, String ordutegia, int areto, double totala) {
		this.id = id;
		this.data = data;
		this.filma = filma;
		this.ordutegia = ordutegia;
		this.areto = areto;
		//seria prezio
		this.totala = totala;
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

	public int getFilma() {
		return filma;
	}

	public void setFilma(int filma) {
		this.filma = filma;
	}

	public String getOrdutegia() {
		return ordutegia;
	}

	public void setOrdutegia(String ordutegia) {
		this.ordutegia = ordutegia;
	}

	public int getAreto() {
		return areto;
	}

	public void setAreto(int areto) {
		this.areto = areto;
	}

	public double getPrezioa() {
		return totala;
	}

	public void setPrezioa(double prezioa) {
		this.totala = prezioa;
	}

	@Override
	public String toString() {
		return "Sarrera [id=" + id + ", data=" + data + ", filma=" + filma + ", ordutegia=" + ordutegia + ", areto="
				+ areto + ", prezioa=" + totala + "]";
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
				&& Double.doubleToLongBits(totala) == Double.doubleToLongBits(other.totala);
	}
	
}