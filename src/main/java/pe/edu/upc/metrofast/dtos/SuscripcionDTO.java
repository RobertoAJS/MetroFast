package pe.edu.upc.metrofast.dtos;

import java.time.LocalDate;

public class SuscripcionDTO {

    private int suscriptionId;
    private boolean status;
    private LocalDate startdate;
    private LocalDate enddate;
    private boolean adfree;

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
}
