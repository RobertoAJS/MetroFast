package pe.edu.upc.metrofast.dtos;

import pe.edu.upc.metrofast.entities.ViajeProgramado;


import java.time.LocalDate;

public class HistorialDeViajesDTO {
    private int historyid;
    private LocalDate traveldate;
    private int totalprice;
    private int transportmode;
    private ViajeProgramado tripid;

    public int getHistoryid() {
        return historyid;
    }

    public void setHistoryid(int historyid) {
        this.historyid = historyid;
    }

    public LocalDate getTraveldate() {
        return traveldate;
    }

    public void setTraveldate(LocalDate traveldate) {
        this.traveldate = traveldate;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public int getTransportmode() {
        return transportmode;
    }

    public void setTransportmode(int transportmode) {
        this.transportmode = transportmode;
    }

    public ViajeProgramado getTripid() {
        return tripid;
    }

    public void setTripid(ViajeProgramado tripid) {
        this.tripid = tripid;
    }
}
