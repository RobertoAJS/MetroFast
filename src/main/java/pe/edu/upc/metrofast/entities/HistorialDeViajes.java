package pe.edu.upc.metrofast.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name ="HistorialDeViajes")
public class HistorialDeViajes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int historyid;
    @Column(name = "totalamount", nullable = false)
    private int totalamount;
    @Column(name = "transportmode", nullable = false, length = 40)
    private String transportmode;

    @ManyToOne
    @JoinColumn(name = "tripid")
    private ViajeProgramado tripid;




    public HistorialDeViajes() {
    }

    public HistorialDeViajes(int historyid, LocalDate traveldate, int totalamount, String transportmode, ViajeProgramado tripid) {
        this.historyid = historyid;
        this.totalamount = totalamount;
        this.transportmode = transportmode;
        this.tripid = tripid;
    }

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
