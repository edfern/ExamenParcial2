package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import java.util.*;

public interface IInventoryDao {
    
    public int getStock(int idProduct);
    public String getNameProduct(int idProduct);

}