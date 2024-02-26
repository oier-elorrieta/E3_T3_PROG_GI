package Modelo;

import java.util.Arrays;
import java.util.Objects;

public class Erosketa {

	private int id;
	private int kant;
	private String data;
	private String desk;
	private double diru_totala;
	private Sarrera[] sarrerak;
	
	public Erosketa(int id, int kant, Sarrera[] sarrerak, String data, String desk, double diru_totala) {
		this.id = id;
		this.kant = kant;
		this.sarrerak = sarrerak;
		this.data = data;
		this.desk = desk;
		this.diru_totala = diru_totala;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getKant() {
		return kant;
	}

	public void setKant(int kant) {
		this.kant = kant;
	}
	
	public Sarrera[] getSarrerak() {
		return sarrerak;
	}

	public void setSarrerak(Sarrera[] sarrerak) {
		this.sarrerak = sarrerak;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDesk() {
		return desk;
	}

	public void setDesk(String desk) {
		this.desk = desk;
	}

	public double getDiru_totala() {
		return diru_totala;
	}

	public void setDiru_totala(double diru_totala) {
		this.diru_totala = diru_totala;
	}

	@Override
	public String toString() {
		return "Erosketa [id_erosketa=" + id + ", kant=" + kant + ", sarrerak=" + sarrerak + ", data=" + data + ", desk=" + desk
				+ ", diru_totala=" + diru_totala + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Erosketa other = (Erosketa) obj;
		return Objects.equals(data, other.data) && Objects.equals(desk, other.desk)
				&& Double.doubleToLongBits(diru_totala) == Double.doubleToLongBits(other.diru_totala) && id == other.id
				&& kant == other.kant && Arrays.equals(sarrerak, other.sarrerak);
	}

	
	
	
	
}
