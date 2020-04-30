package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProviderEntity;
import java.util.*;

public class ProviderDao implements IProviderDao {

    public ProviderDao() {
    }

    @Override
    public ProviderEntity provider(int idProvider) {
        
        ProviderEntity provider = new ProviderEntity();
        
        provider.setFullName("Philips");
        provider.setIdProvider(idProvider);
        provider.setDirection("Chiquimula, Guatemala.");
        provider.setPhone("78456312");
        
        return provider;
    }

}