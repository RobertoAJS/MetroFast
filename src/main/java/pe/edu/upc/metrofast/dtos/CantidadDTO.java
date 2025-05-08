package pe.edu.upc.metrofast.dtos;

import java.time.LocalDate;


public class CantidadDTO {
    public  String username;
    public  int quantityTotalPrice;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getQuantityTotalPrice() {
        return quantityTotalPrice;
    }

    public void setQuantityTotalPrice(int quantityTotalPrice) {
        this.quantityTotalPrice = quantityTotalPrice;
    }


}
