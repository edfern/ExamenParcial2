package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.EmployeeDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IEmployeeDao;
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
            
        }else {
            System.out.println("No se puede realizar el servicio porque no hay existencias");
        }
    }

    @Override
    public void OilFilterChange(ServiceOrderEntity order) {
        
        int ramd = (int) (Math.random()*5);
        
        IInventoryDao inv = new InventoryDao();
        IServiceDao service = new ServiceDao();
        String serviceName= "Cambio de filtro de aceite";
        System.out.println("\n ------- Bahía "+bayCustoms+ " --------");
        System.out.println("Iniciando servicio: "+ serviceName);
        System.out.println("Verificando Existencias");
        System.out.println("Buscando Pieza de recambio(SparePart)");
        
        if(inv.getProduct(3).getIdProduct()>0){
            VehicleServiceHistoryEntryEntity orderSer = new VehicleServiceHistoryEntryEntity();
            
            System.out.println("Existencias: " +inv.getProduct(3).getExistencias());
            orderSer.setNameBay(bayCustoms);
            orderSer.setDate(new Date());
            orderSer.setServiceDescription(serviceName + " se reemplazo el filtro por " + inv.getProduct(3).getNameProduct()+ " "+ inv.getProduct(3).getDescriptionProduct());
            orderSer.setRecommendation("El mecánico: Recomiendo que le haga un servicio a su bateria cada "+ ramd + " meses");
            orderSer.setTools(inv.getTools(5).getNameProduct());
            service.saveService(orderSer);
        }else{
            System.out.println("no se puede cambiar el filtro porque no hay existencia");
        }
        
        
    }
    

}