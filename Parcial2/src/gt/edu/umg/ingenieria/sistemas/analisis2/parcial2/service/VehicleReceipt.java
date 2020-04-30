package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IServiceDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IVehicleDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.ServiceDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.VehicleDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ServiceOrderEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleEntity;
import java.util.*;

public class VehicleReceipt implements IVehicleReceiptService {

    public VehicleReceipt() {
    }

    @Override
    public ServiceOrderEntity receiveVehicle(String licenseNumber) {
        System.out.println("Creando nueva orden de trabajo en la bahia de recepcion.");
        
        IVehicleDao dao = new VehicleDao();
        
        VehicleEntity veh = dao.findVehicleByLicenseNumber(licenseNumber);
        veh.setColor(this.translateColor(veh.getColor()));
        
        ServiceOrderEntity order = new ServiceOrderEntity();
        order.setDate(new Date());
        order.setNit("4564879-5");
        order.setVehicle(veh);
        
        System.out.println("Se ha creado nueva orden para el vehiculo con placas " + licenseNumber);
        
        IServiceDao serviceDao = new ServiceDao();
        
        serviceDao.guardarOrden(order);
        
        return order;
    }
    
    private String translateColor(String englishColor) {
        System.out.println("Traduciendo color " + englishColor);
        switch (englishColor.toUpperCase()) {
            case "BLUE" : return "AZUL";
            case "BLACK" : return "NEGRO";
            default: return "N/A";
        }
    }

}