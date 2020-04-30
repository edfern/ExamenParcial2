package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IProviderDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IServiceDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.ProviderDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.ServiceDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ServiceOrderEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleServiceHistoryEntryEntity;
import java.util.*;

public class QAControlService implements IQAControlService {

    public QAControlService() {
    }
    private String bayBateria = "Bateria";
    private String bayLights = "Luces";

    @Override
    public void batteyReview(ServiceOrderEntity order) {
        
        System.out.println("\n ------- Bahía "+bayBateria + " --------");
        
        String serviceName = "Revision de Bateria";
        
        System.out.println("Iniciando servicio: "+ serviceName);
        
        System.out.println("El mécanico chequea la bateria del propietario " + order.getVehicle().getOwner().getFullName());
        
        System.out.println("Exito la bateria ha sido revisada");
        
        VehicleServiceHistoryEntryEntity orderSer = new VehicleServiceHistoryEntryEntity();
        
        
        orderSer.setDate(new Date());
        
        orderSer.setNameBay(bayBateria);
        
        orderSer.setServiceDescription(serviceName);
        
        orderSer.setRecommendation("Mécánico: La bateria del vehiculo "+order.getVehicle().getBrand()+ " del propietario " + order.getVehicle().getOwner().getFullName() +"\n"
                    + "debe de ser cambiada cuando antes, la vida util de la bateria ha llegado a su fin"
            );
        
        IServiceDao service = new ServiceDao();
        
        service.saveService(orderSer);
    }

    @Override
    public void interiorlights(ServiceOrderEntity order) {
         System.out.println("\n ------- Bahía "+bayLights + " --------");
        
        String serviceName = "Revision de Luces interiores";
        
        System.out.println("Iniciando servicio: "+ serviceName);
        
        System.out.println("El mécanico revisa las luces interiores del vehículo " + order.getVehicle().getBrand());
        
        System.out.println("Exito se ha revisado las luces exteriores");
        
        VehicleServiceHistoryEntryEntity orderSer = new VehicleServiceHistoryEntryEntity();
        
        orderSer.setDate(new Date());
        
        orderSer.setNameBay(bayLights);
        
        orderSer.setServiceDescription(serviceName);
        
        IProviderDao provider = new ProviderDao();
        
        
        
        orderSer.setRecommendation("Mécánico: Las luces del interior del vehiculo "+order.getVehicle().getBrand()+"\n"
                    + "una esta rota por completo y debe de ser cambiada, hay 3 en buen estado, hay dos que estan quemadas y recomiendo \n "
                + "comprar la marca " + provider.provider(1).getFullName() + " PBX: " +provider.provider(1).getPhone()+ " por ser una de las mejores marcas en el mundo"
            );
        
        IServiceDao service = new ServiceDao();
        
        service.saveService(orderSer);
        
        
        
    }

}