package pe.edu.upc.metrofast.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name ="ViajeProgramado")
public class ViajeProgramado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripid;
    @Column(name = "tripdate", nullable = false)
    private LocalDate tripdate;
    @Column(name = "totalprice", nullable = false, length = 40)
    private int totalprice;

    @ManyToOne
    @JoinColumn(name = "userid")
    private Usuario userid;

   // @ManyToOne
    // @JoinColumn(name = "lineid")
    // private Linea lineid;


    public ViajeProgramado() {
    }

    public ViajeProgramado(int tripid, LocalDate tripdate, int totalprice, Usuario userid, Linea lineid) {
        this.tripid = tripid;
        this.tripdate = tripdate;
        this.totalprice = totalprice;
        this.userid = userid;
        this.lineid = lineid;
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
