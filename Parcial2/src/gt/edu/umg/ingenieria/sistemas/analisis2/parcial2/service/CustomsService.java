package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IInventoryDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IServiceDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.InventoryDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.ServiceDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ServiceOrderEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleServiceHistoryEntryEntity;
import java.util.*;

public class CustomsService implements ICustomsService {

    public CustomsService() {
    }
    private String bayCustoms = "Customs";

    @Override
    public void fueltankInstallation(ServiceOrderEntity order) {
        
        IInventoryDao inv = new InventoryDao();
        IServiceDao service = new ServiceDao();
        System.out.println("\n ------- Bahía "+bayCustoms + " --------");
        
        String serviceName = "Instalacion de tapón de tanque de combustible ";
        
        System.out.println("Iniciando servicio: "+ serviceName);
        
        System.out.println("Buscando producto "+ inv.getProduct(1).getNameProduct());
        
        int existencia = inv.getProduct(1).getExistencias();
        
        if (existencia > 0){
            
            VehicleServiceHistoryEntryEntity orderSer = new VehicleServiceHistoryEntryEntity();
            orderSer.setDate(new Date());
            orderSer.setNameBay(bayCustoms);
            orderSer.setServiceDescription("Se realizo un cambio de "+ inv.getProduct(1).getNameProduct());
            orderSer.setRecommendation("-- no hay recomendaciones --");
            orderSer.setTools(inv.getTools(1).getNameProduct());
            service.saveService(orderSer);
            
        }
    }

}