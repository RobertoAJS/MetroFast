package pe.edu.upc.metrofast.dtos;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class UsuarioDTO {


    private int userid;
    private String username;
    private String email;
    private String passsword;
    private int phonenumber;
    private LocalDate createat;
    private LocalDate updatedat;
    private int deletedat;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public LocalDate getCreateat() {
        return createat;
    }

    public void setCreateat(LocalDate createat) {
        this.createat = createat;
    }

    public LocalDate getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(LocalDate updatedat) {
        this.updatedat = updatedat;
    }

    public int getDeletedat() {
        return deletedat;
    }

    public void setDeletedat(int deletedat) {
        this.deletedat = deletedat;
    }


}
