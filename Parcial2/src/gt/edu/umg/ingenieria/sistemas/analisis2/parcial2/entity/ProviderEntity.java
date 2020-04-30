package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity;

import java.util.*;

public class ProviderEntity {

    public ProviderEntity() {
    }
    private int idProvider;
    private String fullName;
    private String phone;
    private String direction;

    public int getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(int idProvider) {
        this.idProvider = idProvider;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    

}