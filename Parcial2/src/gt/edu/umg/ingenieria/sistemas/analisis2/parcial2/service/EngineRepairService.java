package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service;


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
    private String bayBattery = "Bateria";

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

    @Override
    public void BatteryCheckandLevel(ServiceOrderEntity order) {
        IEmployeeDao employee = new EmployeeDao();
        String serviceName= "Revisión de batería y su nivel";
        System.out.println("\n ------- Bahía "+bayBattery+ " --------");
        System.out.println("Iniciando servicio: "+ serviceName);
        System.out.println("Asignando mecánico y asistente");
        
        int idRand = (int) (Math.random()*5);
        int numRand = (int) (Math.random()*12);
        
        if(idRand != 0) {
        
        String nameMec =  employee.getEmployee(idRand);
        VehicleServiceHistoryEntryEntity orderSer = new VehicleServiceHistoryEntryEntity();
       
        
        System.out.println("Se le ha asignado el MECANICO: " + nameMec + " ASISTENTE: " + employee.getAssistant(idRand).getFullname());
        
        System.out.println("Revisando bateria");
        System.out.println("Obteniendo su nivel");
        System.out.println("Exito, Revision de bateria y su nivel terminado");
        
        orderSer.setNameBay(bayBattery);
        orderSer.setDate(new Date());
        orderSer.setServiceDescription("Revision de bateria ESTADO DE BATERIA: " + estado(idRand) + " NIVEL: "+nivel(idRand));
        orderSer.setRecommendation("El mecánico: Recomiendo que le haga un servicio a su bateria cada "+ numRand + " meses");
        
        IInventoryDao inv = new InventoryDao();
        
        orderSer.setTools(inv.getTools(2).getNameProduct() );
        
        IServiceDao service = new ServiceDao();
        service.saveService(orderSer);}
        else{
            System.out.println("No se ha encontrado el empleado");
            System.out.println("No se puede realizar el servicio");
        }
    }
    

    @Override
    public void systemCooling(ServiceOrderEntity order) {
        int ramd = (int) (Math.random()*5);
        
        IInventoryDao inv = new InventoryDao();
        IServiceDao service = new ServiceDao();
        String serviceName= "Servicio de enfriamiento del sistema cada 80,000km";
        System.out.println("\n ------- Bahía "+bayMotor+ " --------");
        System.out.println("Iniciando servicio: "+ serviceName);
        System.out.println("Verificando kilometraje del vehiculo "+ order.getVehicle().getBrand());
        
        int kilometraje = order.getVehicle().getKilometraje();
        if(kilometraje >= 80000){
            System.out.println("Exito el servicio de enfriamiento del sistema ha sido satisfactorio ");
            VehicleServiceHistoryEntryEntity orderSer = new VehicleServiceHistoryEntryEntity();
            orderSer.setNameBay(bayMotor);
            orderSer.setDate(new Date());
            orderSer.setServiceDescription(serviceName);
            orderSer.setRecommendation("El mecánico: Recomiendo que le haga un servicio de enfriamiento cada "+ ramd + " meses");
            orderSer.setTools("Maquina de enfriamiento");
            service.saveService(orderSer);
        }else{
            System.out.println("No se puede realizar el servicio el kilometraje es menor a 80000");
        }
    }
    public String estado(int rand){
        String estado= "";
        
        switch(rand){
            case 1: estado = "Bueno";
            return estado;
            case 2: estado = "Regular";
            return estado;
            case 3: estado = "Malo";
            return estado;
            case 4: estado = "Intermedio";
            return estado;
            case 5: estado = "Muy malo";
            return estado;
            default:estado = "Debe cambiarla";
            return estado;
        }
        
    }
    public String nivel(int rand){
        String estado= "";
        
        switch(rand){
            case 1: estado = "13,0V 100% BATERIA CARGADA";
            return estado;
            case 2: estado = "12,5V 80% BATERIA NORMAR";
            return estado;
            case 3: estado = "12,0V 60% BATERIA NORMAL";
            return estado;
            case 4: estado = "11,5V 40% BATERIA POCA CARGA";
            return estado;
            case 5: estado = "11,0V 20% BATERIA POCA CARGA";
            return estado;
            default:estado = "10,5V 10% BATERIA RECARGAR";
            return estado;
        }
        
    }
}