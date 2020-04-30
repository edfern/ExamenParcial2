package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.EmployeeDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IEmployeeDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IInventoryDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IServiceDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.InventoryDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.ServiceDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProductEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ServiceOrderEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleServiceHistoryEntryEntity;
import java.util.*;

public class EngineRepairService implements IEngineRepairService {

    public EngineRepairService() {
    }
    
    private String bayMotor = "Motor";

    @Override
    public void MotorWash(ServiceOrderEntity order) {
        
        IEmployeeDao employee = new EmployeeDao();
        
        String serviceName= "Lavado de motor";
        
        System.out.println("\n ------- Bahía "+bayMotor+ " --------");
        
        System.out.println("Iniciando servicio: "+ serviceName);
        
        System.out.println("Asignando mecánico");
        
        String nameMec =  employee.getEmployee(1);
        
        VehicleServiceHistoryEntryEntity orderSer = new VehicleServiceHistoryEntryEntity();
        
        System.out.println("Se le ha asignado el mecánico : " + nameMec);
        
        System.out.println("Exito el motor "+ order.getVehicle().getTypeEngine() +" del vehículo "+ order.getVehicle().getLicenseNumber() +"ha sido lavado");
        
        System.out.println("Guardando registro");
        
        orderSer.setNameBay(bayMotor);
        orderSer.setDate(new Date());
        orderSer.setServiceDescription("Lavado de Motor");
        orderSer.setRecommendation("El mecánico: Recomiendo que le haga un servicio de lavado de motor cada 4 meses o 30,000KM ");
        
        IInventoryDao inv = new InventoryDao();
        
        orderSer.setTools(inv.getTools(2).getNameProduct() );
        
        IServiceDao service = new ServiceDao();
        
        service.saveService(orderSer);
        
        
        
    }

    @Override
    public void EngineOilChange(ServiceOrderEntity order) {
        
        String serviceName= "Cambio de aceite al motor";
        
        System.out.println("\n ------- Bahía "+bayMotor + " --------");
        
        System.out.println("Iniciando servicio: "+ serviceName);
        
        System.out.println("Verificando producto");
        
        IInventoryDao inventary = new InventoryDao();
        ProductEntity product = new ProductEntity();
        
        int existencias = inventary.getStock(2);
        
        if (existencias > 0 ){
            
            
            
            System.out.println("Se encontraron " + existencias+ " existencias del producto en bodega");
           
            System.out.println("El mecánico ha cambiado el aceite exitosamente");
            
            VehicleServiceHistoryEntryEntity orderSer = new VehicleServiceHistoryEntryEntity();
            
           IInventoryDao inv = new InventoryDao();
            String namPro = inv.getNameProduct(1);
            orderSer.setDate(new Date());
            orderSer.setNameBay(bayMotor);
            orderSer.setServiceDescription("Cambio de aceite al motor");
        
            orderSer.setTools(inv.getTools(1).getNameProduct()+ ", "+ inv.getTools(2).getNameProduct() );
            
            orderSer.setRecommendation("Mécánico: Recomiendo que le haga un cambio de aciete al motor cada 5 meses o 50,000KM y recomiendo\n"
                    + "utilizar el producto "+ namPro
            );
        
        
            IServiceDao service = new ServiceDao();
        
            service.saveService(orderSer);
             
        } else{
            
            System.out.println("No hay existencias");
            
        }
        
        
        
    }

   

}