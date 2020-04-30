package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity;

import java.util.*;

public class ServiceOrderEntity {

    public ServiceOrderEntity() {
    }

    private VehicleEntity vehicle;
    private Date date;
    private String nit;

    public VehicleEntity getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleEntity vehicle) {
        this.vehicle = vehicle;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    

}