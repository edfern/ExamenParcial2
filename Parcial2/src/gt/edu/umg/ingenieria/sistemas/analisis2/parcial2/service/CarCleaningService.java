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

public class CarCleaningService implements ICarCleaningService {

    public CarCleaningService() {
    }
    private String bayUpholstery= "Tapicería";
    private int idRand = (int) (Math.random()*5);
    

    @Override
    public void UpholsteryCleaning(ServiceOrderEntity order) {
         IEmployeeDao employee = new EmployeeDao();
        String serviceName= "Limpieza de tapicería";
        System.out.println("\n ------- Bahía "+bayUpholstery+ " --------");
        System.out.println("Iniciando servicio: "+ serviceName);
        IInventoryDao inv = new InventoryDao();
        String nameMec =  employee.getEmployee(idRand);
        VehicleServiceHistoryEntryEntity orderSer = new VehicleServiceHistoryEntryEntity();
        
        System.out.println("Limpieza de tapicería completado");
        int numRand = (int) (Math.random()*12);
        orderSer.setNameBay(bayUpholstery);
        orderSer.setDate(new Date());
        orderSer.setServiceDescription(serviceName+" Se utilizo: "+numRand + " "+ inv.getTools(6).getNameProduct()+ " "+numRand+ " " +inv.getTools(7).getNameProduct()+" " + inv.getTools(7).getDescriptionProduct());
        orderSer.setRecommendation("El mecánico: Recomiendo que le haga una limpieza a su vehiculo cada "+ numRand + " meses");
        
       
        
        orderSer.setTools(inv.getTools(2).getNameProduct() );
        
        IServiceDao service = new ServiceDao();
        service.saveService(orderSer);}
        
        
    

}