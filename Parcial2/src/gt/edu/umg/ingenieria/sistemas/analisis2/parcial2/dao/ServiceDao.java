package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProductEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ServiceOrderEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleServiceHistoryEntryEntity;
import java.util.*;

public class ServiceDao implements IServiceDao {

    public ServiceDao() {
    }
    
    @Override
    public void guardarOrden(ServiceOrderEntity order) {
        System.out.println("Guardando la orden " + order.getDate() + " para el vehiculo " + order.getVehicle().getLicenseNumber());
    }

    @Override
    public void saveService(VehicleServiceHistoryEntryEntity order) {
        ProductEntity product = new ProductEntity();
        
        System.out.println("Registro guardado " + "SERVICIO: "+ order.getServiceDescription() + " FECHA:  " + order.getDate()+ " Bahía: " + order.getNameBay());
        System.out.println("Recomendaciones: "+order.getRecommendation());
        System.out.println("Herramientas utilizadas: "+ order.getTools());
    }

}