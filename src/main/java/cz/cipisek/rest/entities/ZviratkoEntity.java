package cz.cipisek.rest.entities;

public class ZviratkoEntity {
    private Integer id;
    private String nazev;
    private String vek;


    public void setId(int id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setVek(String vek) {
        this.vek = vek;
    }

    public String getVek() {
        return vek;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getNazev() {
        return nazev;
    }
}
