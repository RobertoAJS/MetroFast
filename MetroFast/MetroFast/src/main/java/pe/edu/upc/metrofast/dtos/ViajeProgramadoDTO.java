package pe.edu.upc.metrofast.dtos;

import jakarta.persistence.*;

import java.time.LocalDate;

public class ViajeProgramadoDTO {
    private int tripid;
    private LocalDate tripdate;
    private int totalprice;
    private Usuario userid;
    private Linea lineid;

    public int getTripid() {
        return tripid;
    }

    public void setTripid(int tripid) {
        this.tripid = tripid;
    }

    public LocalDate getTripdate() {
        return tripdate;
    }

    public void setTripdate(LocalDate tripdate) {
        this.tripdate = tripdate;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public Usuario getUserid() {
        return userid;
    }

    public void setUserid(Usuario userid) {
        this.userid = userid;
    }

    public Linea getLineid() {
        return lineid;
    }

    public void setLineid(Linea lineid) {
        this.lineid = lineid;
    }
}
