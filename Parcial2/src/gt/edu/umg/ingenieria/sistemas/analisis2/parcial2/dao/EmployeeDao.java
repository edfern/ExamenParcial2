package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.AssistantEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.MechanicEntity;
import java.util.*;

public class EmployeeDao implements IEmployeeDao {

    public EmployeeDao() {
    }

    @Override
    public String getEmployee(int employeeID) {
        System.out.println("Buscando empleado con el ID: "+ employeeID);
        
        String error = "No se ha encontrado";
        
        MechanicEntity mechanic = new MechanicEntity();
        
        if(employeeID == 1)
        {
        mechanic.setFullname("Fernando Alexander Sicay");
        mechanic.setDirection("Guatemala");
        mechanic.setPhone("58785452");
        mechanic.setNumberID(employeeID);
        mechanic.setWorkArea("De servicio y lubricación");
        mechanic.setExperience("Servicio completo de lavado (chasís y motor)");
        System.out.println("Empleado encontrado");
        
        return  mechanic.getFullname();
        
        } if(employeeID == 2){
            
             mechanic.setFullname("Esvin Ricardo Mejia Abaj");
             mechanic.setDirection("La Antigua Guatemala");
             mechanic.setPhone("58784544");
             mechanic.setNumberID(employeeID);
             mechanic.setWorkArea("De servicio y lubricación");
             mechanic.setExperience("Servicio completo de lavado (chasís y motor)");
             
             System.out.println("Empleado encontrado");
        
             return  mechanic.getFullname();
            
        } if(employeeID == 3){
            
             mechanic.setFullname("Rodrigo Estevan Mejia");
             mechanic.setDirection("La Antigua Guatemala");
             mechanic.setPhone("58784544");
             mechanic.setNumberID(employeeID);
             mechanic.setWorkArea("De servicio y lubricación");
             mechanic.setExperience("Servicio completo de lavado (chasís y motor)");
             
             System.out.println("Empleado encontrado");
        
             return  mechanic.getFullname();
            
        } if(employeeID == 4){
            
             mechanic.setFullname("Fernando Ricardo Mejia Perez");
             mechanic.setDirection("La Antigua Guatemala");
             mechanic.setPhone("58784544");
             mechanic.setNumberID(employeeID);
             mechanic.setWorkArea("De servicio y lubricación");
             mechanic.setExperience("Servicio completo de lavado (chasís y motor)");
             
             System.out.println("Empleado encontrado");
        
             return  mechanic.getFullname();
            
        } if(employeeID == 5){
            
             mechanic.setFullname("Marcos Alonso Perez Ramirez");
             mechanic.setDirection("La Antigua Guatemala");
             mechanic.setPhone("58784544");
             mechanic.setNumberID(employeeID);
             mechanic.setWorkArea("De servicio y lubricación");
             mechanic.setExperience("Servicio completo de lavado (chasís y motor)");
             
             System.out.println("Empleado encontrado");
        
             return  mechanic.getFullname();
            
        }
        
        return error;
    }

    @Override
    public AssistantEntity getAssistant(int employeeID) {
        
        System.out.println("Buscando Asistente con ID: "+ employeeID);
        
        if(employeeID == 1){
        
        AssistantEntity assi = new AssistantEntity();
        
        assi.setFullname("Leonel Andres Messi");
        assi.setIdAssistant(employeeID);
        assi.setBirthDate("15/08/90");
        assi.setDirection("Estados Unidos");
        assi.setPhone("789564451");
        assi.setExperience("reparar y renovar las llantas");
        assi.setWorkArea("reparación de llantas");
        
        System.out.println("Asistente encontrado");
        
        return assi;
        } if(employeeID == 6){
        
        AssistantEntity assi = new AssistantEntity();
        
        assi.setFullname("Cristiano Ronaldo Abaj Adolfo");
        assi.setIdAssistant(employeeID);
        assi.setBirthDate("15/08/90");
        assi.setDirection("Estados Unidos");
        assi.setPhone("789556721");
        assi.setExperience("reparar y renovar las llantas");
        assi.setWorkArea("Full Area");
        
        System.out.println("Asistente encontrado");
        
        return assi;
        } if(employeeID == 2){
        
        AssistantEntity assi = new AssistantEntity();
        
        assi.setFullname("Edy Fernando Sicajau Pichilla");
        assi.setIdAssistant(employeeID);
        assi.setBirthDate("15/08/90");
        assi.setDirection("Estados Unidos");
        assi.setPhone("789577821");
        assi.setExperience("reparar y renovar las llantas");
        assi.setWorkArea("reparación de llantas");
        
        System.out.println("Asistente encontrado");
        
        return assi;
        } if(employeeID == 3){
        
        AssistantEntity assi = new AssistantEntity();
        
        assi.setFullname("Ricardo Mejia Alvarez");
        assi.setIdAssistant(employeeID);
        assi.setBirthDate("15/08/90");
        assi.setDirection("Estados Unidos");
        assi.setPhone("878564521");
        assi.setExperience("reparar y renovar las llantas");
        assi.setWorkArea("Full area");
        
        return assi;
        } if(employeeID == 4){
        
        AssistantEntity assi = new AssistantEntity();
        
        assi.setFullname("Esvin Gustavo Abaj Adolfo");
        assi.setIdAssistant(employeeID);
        assi.setBirthDate("15/08/90");
        assi.setDirection("Estados Unidos");
        assi.setPhone("789564521");
        assi.setExperience("reparar y renovar las llantas");
        assi.setWorkArea("reparación de llantas");
        
        System.out.println("Asistente encontrado");
        
        return assi;
        } if(employeeID == 5){
        
        AssistantEntity assi = new AssistantEntity();
        
        assi.setFullname("Esvin Gustavo Abaj Adolfo");
        assi.setIdAssistant(employeeID);
        assi.setBirthDate("15/08/90");
        assi.setDirection("Estados Unidos");
        assi.setPhone("789564521");
        assi.setExperience("reparar y renovar las llantas");
        assi.setWorkArea("reparación de llantas");
        
        System.out.println("Asistente encontrado");
        
        return assi;
        }
        
        return null;
    }

}