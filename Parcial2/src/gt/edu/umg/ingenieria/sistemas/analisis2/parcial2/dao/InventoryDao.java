package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProductEntity;
import java.util.*;
import javax.swing.text.html.HTMLEditorKit;
import javax.xml.bind.ParseConversionEvent;

public class InventoryDao implements IInventoryDao {

    public InventoryDao() {
    }

    @Override
    public int getStock(int idProduct) {
        
        int existe;
        
        int erro = 0;
      
        
        if (idProduct == 1){
             
        System.out.println("Buscando producto con el ID: "+idProduct);
        
        ProductEntity product = new ProductEntity();
        
        product.setIdProduct(idProduct);
        product.setNameProduct("Mobil");
        product.setDescriptionProduct("Extended performance");
        product.setTypeProduct("5W-30");
        product.setExistencias(30);
        
        System.out.println("Producto " + "'"+ product.getNameProduct()+ product.getDescriptionProduct()+ "' encontrado");
        
        existe = product.getExistencias();
        
        
        return existe;
        } if (idProduct == 2){
             
        System.out.println("Buscando producto con el ID: "+idProduct);
        
        ProductEntity product = new ProductEntity();
        
        product.setIdProduct(idProduct);
        product.setNameProduct("Blue Mountain");
        product.setDescriptionProduct("Motor OIL");
        product.setTypeProduct("20W-50");
        product.setExistencias(16);
        
        System.out.println("Producto " + "'"+ product.getNameProduct()+ product.getDescriptionProduct()+ "' encontrado");
        
        existe = product.getExistencias();
        
        
        return existe;
        }
       
        return erro;
    }

    @Override
    public String getNameProduct(int idProduct) {
        
        if (idProduct == 1){
        
        ProductEntity product = new ProductEntity();
        
        product.setIdProduct(idProduct);
        product.setNameProduct("Mobil");
        product.setDescriptionProduct("Extended performance");
        product.setTypeProduct("5W-30");
        product.setExistencias(30);
        
        String proName = (product.getNameProduct()+" "+ product.getDescriptionProduct());
        
        
        return proName;
        }
        return "Error no se ha encontrado el producto";
    }

}