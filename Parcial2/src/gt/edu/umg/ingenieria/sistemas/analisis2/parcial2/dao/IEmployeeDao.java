package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.AssistantEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.MechanicEntity;
import java.util.*;

public interface IEmployeeDao {
    
    public String getEmployee(int employeeID);
    public AssistantEntity getAssistant(int employeeID);

}