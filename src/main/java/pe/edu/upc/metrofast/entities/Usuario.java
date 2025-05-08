package pe.edu.upc.metrofast.entities;

import jakarta.persistence.*;



@Entity
@Table(name ="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;
    @Column(name = "username", nullable = false,length = 40)
    private String username;
    @Column(name = "email", nullable = false, length = 40)
    private String email;
    @Column(name = "password", nullable = false, length = 40)
    private String password;
    @Column(name = "phonenumber", nullable = false, length = 9)
    private int phonenumber;


    public Usuario() {
    }

    public Usuario(int userid, String username, String email, String password, int phonenumber) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phonenumber = phonenumber;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
}
