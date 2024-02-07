package Modelo;

import java.util.Objects;

public class Sarrera {
	private int id;
	private String data;
	private Saioa saioa;
	private double prezioa;
	
	public Sarrera(int id, String data, Saioa saioa, double prezioa) {
		this.id = id;
		this.data = data;
		this.saioa = saioa;
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

	public Saioa getSaioa() {
		return saioa;
	}

	public void setSaioa(Saioa saioa) {
		this.saioa = saioa;
	}

	public double getPrezioa() {
		return prezioa;
	}

	public void setPrezioa(double prezioa) {
		this.prezioa = prezioa;
	}

	@Override
	public String toString() {
		return "Sarrera [id=" + id + ", data=" + data + ", saioa=" + saioa + ", prezioa=" + prezioa + "]";
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
		return Objects.equals(data, other.data) && id == other.id
				&& Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa)
				&& Objects.equals(saioa, other.saioa);
	}

	

	
	
}