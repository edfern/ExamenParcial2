package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleEntity;
import java.util.*;

public interface IVehicleDao {

    public VehicleEntity findVehicleByLicenseNumber(String licenseNumber);
    
}