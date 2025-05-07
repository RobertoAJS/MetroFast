package pe.edu.upc.metrofast.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name ="HistorialDeViajes")
public class HistorialDeViajes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int historyid;
    @Column(name = "traveldate", nullable = false)
    private LocalDate traveldate;
    @Column(name = "totalprice", nullable = false, length = 40)
    private int totalprice;
    @Column(name = "transportmode", nullable = false, length = 40)
    private int transportmode;

    @ManyToOne
    @JoinColumn(name = "tripid")
    private ViajeProgramado tripid;



    public HistorialDeViajes() {
    }

    public HistorialDeViajes(int historyid, LocalDate traveldate, int totalprice, int transportmode, ViajeProgramado tripid) {
        this.historyid = historyid;
        this.traveldate = traveldate;
        this.totalprice = totalprice;
        this.transportmode = transportmode;
        this.tripid = tripid;
    }

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
