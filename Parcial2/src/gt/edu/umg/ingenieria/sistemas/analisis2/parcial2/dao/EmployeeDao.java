package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

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
            
        }
        
        return error;
    }

}