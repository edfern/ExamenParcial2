package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProductEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.SparePartEntity;
import java.util.*;

public interface IInventoryDao {
    
    public int getStock(int idProduct);
    public String getNameProduct(int idProduct);
    public SparePartEntity getProduct(int idProduct);
    public ProductEntity getTools(int idProduct);

}