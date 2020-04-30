package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ServiceOrderEntity;
import java.util.*;

public interface ICustomsService {
    
    public void fueltankInstallation (ServiceOrderEntity order);
    public void OilFilterChange (ServiceOrderEntity order);

}