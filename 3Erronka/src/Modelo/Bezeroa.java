package Modelo;

import java.util.Objects;

public class Bezeroa {
    private String NAN;
    private String izena;
    private String abizena;
    private char generoa;
    private String erabiltzailea;
    private String pasahitza;
    
    public Bezeroa(String NAN, String izena, String abizena, char generoa, String erabiltzailea, String pasahitza) {
        this.NAN = NAN;
        this.izena = izena;
        this.abizena = abizena;
        this.generoa = generoa;
        this.erabiltzailea = erabiltzailea;
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

    public char getGeneroa() {
        return generoa;
    }

    public void setGeneroa(char generoa) {
        this.generoa = generoa;
    }
    
    public String getErabiltzailea() {
        return erabiltzailea;
    }

    public void setErabiltzailea(String erabiltzailea) {
        this.erabiltzailea = erabiltzailea;
    }
    
    public String getPasahitza() {
        return pasahitza;
    }

    public void setPasahitza(String pasahitza) {
        this.pasahitza = pasahitza;
    }

    @Override
    public String toString() {
        return "Bezeroa [NAN=" + NAN + ", izena=" + izena + ", abizena=" + abizena + ", generoa=" + generoa
                + ", erabiltzailea=" + erabiltzailea + ", pasahitza=" + pasahitza + "]";
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
                && Objects.equals(erabiltzailea, other.erabiltzailea) && Objects.equals(izena, other.izena)
                && Objects.equals(pasahitza, other.pasahitza) && generoa == other.generoa;
    }

     
}