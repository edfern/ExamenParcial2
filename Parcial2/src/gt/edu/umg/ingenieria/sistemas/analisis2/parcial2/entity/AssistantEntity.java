package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity;

import java.util.*;

public class AssistantEntity extends AbstractPerson {

    public AssistantEntity() {
    }
    private int idAssistant;
    private String workArea;
    private String experience;

    public int getIdAssistant() {
        return idAssistant;
    }

    public void setIdAssistant(int idAssistant) {
        this.idAssistant = idAssistant;
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