package pe.edu.upc.metrofast.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Suscripcion {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int suscriptionId;

    @Column(name = "status", nullable = false)
    private boolean status;
    @Column(name = "startdate", nullable = false)
    private LocalDate startdate;
    @Column(name = "enddate", nullable = false)
    private LocalDate enddate;
    @Column(name = "adfree", nullable = false)
    private boolean adfree;

    @ManyToOne
    @JoinColumn(name = "usuarioid")
    private Usuario usuarioid;

    public Suscripcion() {
    }

    public Suscripcion(int suscriptionId, boolean status, LocalDate startdate, LocalDate enddate, boolean adfree, Usuario usuarioid) {
        this.suscriptionId = suscriptionId;
        this.status = status;
        this.startdate = startdate;
        this.enddate = enddate;
        this.adfree = adfree;
        this.usuarioid = usuarioid;
    }

    public int getSuscriptionId() {
        return suscriptionId;
    }

    public void setSuscriptionId(int suscriptionId) {
        this.suscriptionId = suscriptionId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public boolean isAdfree() {
        return adfree;
    }

    public void setAdfree(boolean adfree) {
        this.adfree = adfree;
    }

    public Usuario getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(Usuario usuarioid) {
        this.usuarioid = usuarioid;
    }
}
