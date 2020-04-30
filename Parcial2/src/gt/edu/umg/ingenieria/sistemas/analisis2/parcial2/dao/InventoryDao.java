package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;


import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProductEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.SparePartEntity;


public class InventoryDao implements IInventoryDao {

    public InventoryDao() {
    }

    @Override
    public int getStock(int idProduct) {
        
        int existe;
        
        int erro = 0;
      
        
        if (idProduct == 1){
             
        System.out.println("Buscando producto con el ID: "+idProduct);
        
        SparePartEntity product = new SparePartEntity();
        
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
        
        SparePartEntity product = new SparePartEntity();
        
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
        
        SparePartEntity product = new SparePartEntity();
        
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

    @Override
    public SparePartEntity getProduct(int idProduct) {
        
        SparePartEntity product = new SparePartEntity();
        int numRand = (int) (Math.random()*50);
        
        if(idProduct == 1){
        product.setNameProduct("Tapón de tanque de combustible");
        product.setIdProduct(idProduct);
        product.setTypeProduct("Customs");
        product.setDescriptionProduct("Diámetro de la carcasa. 2.78 pulgadas. Diámetro del cuello: 1.78 pulgadas. Profundidad de la tapa: 2.41 pulgadas");
        product.setExistencias(numRand);
           
        return product;}
        if(idProduct == 2){
        product.setNameProduct("Filto de aceite");
        product.setIdProduct(idProduct);
        product.setTypeProduct("Customs");
        product.setDescriptionProduct("CLIO II Furgón (SB0/1/2_)");
        product.setExistencias(numRand);
        return product;}
        if(idProduct == 3){
        product.setNameProduct("Filtro de aceite");
        product.setIdProduct(idProduct);
        product.setTypeProduct("Customs");
        product.setDescriptionProduct("TRAFIC II Autobús (JL)");
        product.setExistencias(numRand);
        return product;}
        return null;
        
    }

    @Override
    public ProductEntity getTools(int idProduct) {
       
        ProductEntity tools = new ProductEntity();
        
        if(idProduct == 1){
        
        tools.setNameProduct("Gato");
        tools.setTypeProduct("Para vehiculo");
        tools.setDescriptionProduct("El gato de carretilla hidráulico");
        tools.setIdProduct(idProduct);
        
        return tools;
        
        } if (idProduct == 2 ){
            tools.setNameProduct("Extractor");
            tools.setTypeProduct("Para vehiculo");
            tools.setDescriptionProduct("Etamaño de 10 mm");
            tools.setIdProduct(idProduct);
            return tools;
        } if (idProduct == 3 ){
            tools.setNameProduct("llave de tubo");
            tools.setTypeProduct("Para vehiculo");
            tools.setDescriptionProduct("Etamaño de 22 mm");
            tools.setIdProduct(idProduct);
            return tools;
        } if (idProduct == 4 ){
            tools.setNameProduct("Mordazas");
            tools.setTypeProduct("Para vehiculo");
            tools.setDescriptionProduct("Etamaño de 10 mm");
            tools.setIdProduct(idProduct);
            return tools;
        } if (idProduct == 5 ){
            tools.setNameProduct("Entenallas");
            tools.setTypeProduct("Para vehiculo");
            tools.setDescriptionProduct("Etamaño de 20 mm");
            tools.setIdProduct(idProduct);
            return tools;
        }if (idProduct == 6 ){
            tools.setNameProduct("Jabon Espuma");
            tools.setTypeProduct("Para tapiceria");
            tools.setDescriptionProduct("100 unidades");
            tools.setIdProduct(idProduct);
            return tools;
        }if (idProduct == 7 ){
            tools.setNameProduct("Limpiador");
            tools.setTypeProduct("Para tapiceria");
            tools.setDescriptionProduct("Marca: ARMORALL Modelo# 78091 SKU# 87747. ARMORALL.");
            tools.setIdProduct(idProduct);
            return tools;
        }
        
        return null;
        
    }

}