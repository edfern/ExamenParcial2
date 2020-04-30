package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ServiceOrderEntity;
import java.util.*;

public interface IEngineRepairService {
    
    public void MotorWash(ServiceOrderEntity order);
    public void EngineOilChange(ServiceOrderEntity order);

}