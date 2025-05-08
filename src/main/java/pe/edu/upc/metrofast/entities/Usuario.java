package pe.edu.upc.metrofast.entities;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name ="Usuario")
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int userid;

    @Column(name = "username", nullable = false, length = 20)
    private String username;
    @Column(name = "email", nullable = false, length = 30)
    private String email;
    @Column(name = "passsword", nullable = false, length = 40)
    private String passsword;
    @Column(name = "phonenumber", nullable = false)
    private int phonenumber;
    @Column(name = "createdat", nullable = false)
    private LocalDate createat;
    @Column(name = "updatedat", nullable = false)
    private LocalDate updatedat;
    @Column(name = "deletedat", nullable = false)
    private int deletedat;

    public Usuario() {
    }

    public Usuario(int userid, String username, String email, String passsword, int phonenumber, LocalDate createat, LocalDate updatedat, int deletedat) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.passsword = passsword;
        this.phonenumber = phonenumber;
        this.createat = createat;
        this.updatedat = updatedat;
        this.deletedat = deletedat;
    }

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
