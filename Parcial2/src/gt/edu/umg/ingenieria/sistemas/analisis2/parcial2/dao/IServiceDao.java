package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ServiceOrderEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleServiceHistoryEntryEntity;
import java.util.*;

public interface IServiceDao {

    public void guardarOrden(ServiceOrderEntity order);
    public void saveService(VehicleServiceHistoryEntryEntity order);
    
}