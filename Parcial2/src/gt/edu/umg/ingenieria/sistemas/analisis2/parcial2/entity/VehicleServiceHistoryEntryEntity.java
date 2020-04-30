package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity;

import java.util.*;

public class VehicleServiceHistoryEntryEntity {

    public String nameBay;
    public Date date;
    public String serviceDescription;
    public String Recommendation;
    
    public VehicleServiceHistoryEntryEntity() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }
    
     public String getNameBay() {
        return nameBay;
    }

    public void setNameBay(String nameBay) {
        this.nameBay = nameBay;
    }

    public String getRecommendation() {
        return Recommendation;
    }

    public void setRecommendation(String Recommendation) {
        this.Recommendation = Recommendation;
    }

    
}