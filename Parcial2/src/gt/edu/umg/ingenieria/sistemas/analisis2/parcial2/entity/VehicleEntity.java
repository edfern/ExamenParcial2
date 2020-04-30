package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity;

import java.util.*;

public class VehicleEntity {
    
    private VehicleOwnerEntity owner;
    private Set<VehicleServiceHistoryEntryEntity> serviceHistory;
    private String licenseNumber;
    private String brand;
    private Integer model;
    private String color;
    private String typeEngine;
    private String typeBatery;
    private String typeLightsInter;
    private String typeTires;
    private int kilometraje;

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public VehicleEntity() {
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleOwnerEntity getOwner() {
        return owner;
    }

    public void setOwner(VehicleOwnerEntity owner) {
        this.owner = owner;
    }

    public Set<VehicleServiceHistoryEntryEntity> getServiceHistory() {
        return serviceHistory;
    }

    public void setServiceHistory(Set<VehicleServiceHistoryEntryEntity> serviceHistory) {
        this.serviceHistory = serviceHistory;
    }

    public String getTypeBatery() {
        return typeBatery;
    }

    public void setTypeBatery(String typeBatery) {
        this.typeBatery = typeBatery;
    }

    public String getTypeLightsInter() {
        return typeLightsInter;
    }

    public void setTypeLightsInter(String typeLightsInter) {
        this.typeLightsInter = typeLightsInter;
    }

    public String getTypeTires() {
        return typeTires;
    }

    public void setTypeTires(String typeTires) {
        this.typeTires = typeTires;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    
}