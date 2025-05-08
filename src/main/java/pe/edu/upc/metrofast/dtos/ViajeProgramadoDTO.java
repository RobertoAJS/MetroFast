package pe.edu.upc.metrofast.dtos;


import pe.edu.upc.metrofast.entities.Usuario;

import java.time.LocalDate;

public class ViajeProgramadoDTO {
    private int tripid;
    private LocalDate tripdate;
    private int totalprice;
    private Usuario userid;


    public Usuario getUserid() {
        return userid;
    }

    public void setUserid(Usuario userid) {
        this.userid = userid;
    }

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

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }


}
