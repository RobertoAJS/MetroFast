package pe.edu.upc.metrofast.dtos;


import pe.edu.upc.metrofast.entities.ViajeProgramado;




public class HistorialDeViajesDTO {
    private int historyid;
    private int totalamount;
    private String transportmode;
    private ViajeProgramado tripid;

    public int getHistoryid() {
        return historyid;
    }

    public void setHistoryid(int historyid) {
        this.historyid = historyid;
    }

    public int getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(int totalamount) {
        this.totalamount = totalamount;
    }

    public String getTransportmode() {
        return transportmode;
    }

    public void setTransportmode(String transportmode) {
        this.transportmode = transportmode;
    }

    public ViajeProgramado getTripid() {
        return tripid;
    }

    public void setTripid(ViajeProgramado tripid) {
        this.tripid = tripid;
    }
}
