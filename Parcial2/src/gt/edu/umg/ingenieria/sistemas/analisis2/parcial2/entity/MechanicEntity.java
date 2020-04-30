package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity;

import java.util.*;

public class MechanicEntity extends AbstractPerson {

    public MechanicEntity() {
    }
    private int numberID;
    private String workArea;
    private String experience;

    public int getNumberID() {
        return numberID;
    }

    public void setNumberID(int numberID) {
        this.numberID = numberID;
    }

    public String getWorkArea() {
        return workArea;
    }

    public void setWorkArea(String workArea) {
        this.workArea = workArea;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

}