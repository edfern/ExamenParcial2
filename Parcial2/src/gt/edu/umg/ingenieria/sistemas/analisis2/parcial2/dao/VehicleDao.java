package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleOwnerEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleServiceHistoryEntryEntity;
import java.util.*;

public class VehicleDao implements IVehicleDao {

    public VehicleDao() {
    }

    @Override
    public VehicleEntity findVehicleByLicenseNumber(String licenseNumber) {
        System.out.println("Se ha encontrado el vehiculo " + licenseNumber);
        
        VehicleOwnerEntity owner = new VehicleOwnerEntity();
        owner.setFullName("Josue Barillas");
        owner.setDpi("27741584648456842");
        
        Set<VehicleServiceHistoryEntryEntity> serviceHistory = new HashSet<>();
                
        VehicleEntity veh = new VehicleEntity();
        veh.setBrand("Toyota");
        veh.setModel(2011);
        veh.setColor("Black");
        veh.setLicenseNumber(licenseNumber);
        veh.setTypeEngine("Diésel");
        veh.setTypeBatery("VRLA(Valve Regulated Lead Acid)");
        veh.setTypeLightsInter("H3-4");
        veh.setTypeTires("205/55 R16");
        
        veh.setOwner(owner);
        veh.setServiceHistory(serviceHistory);
        
        return veh;        
    }

}