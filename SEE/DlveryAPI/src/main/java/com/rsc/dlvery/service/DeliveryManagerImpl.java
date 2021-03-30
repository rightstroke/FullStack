package com.rsc.dlvery.service;

import java.util.List;

import com.rsc.dlvery.model.DeliveryItem;

import org.springframework.stereotype.Service;

@Service("DML")
public class DeliveryManagerImpl extends BaseService implements DeliveryManager{

    @Override
    public void addDeiveryItem(DeliveryItem di) {
       System.out.println(" add DI ");
        
    }

    @Override
    public void removeDeiveryItem(DeliveryItem di) {
        System.out.println(" remove DI ");
        
    }

    @Override
    public void updateDeiveryItem(DeliveryItem di) {
        System.out.println(" updaste DI ");
        
    }

    @Override
    public List<DeliveryItem> fetchAllDeiveryItems() {
        System.out.println(" Fetch all DI ");
        return null;
    }

    @Override
    public List<DeliveryItem> fetchDeiveryItemById(DeliveryItem di) {
        System.out.println(" Fetch By ID DI ");
        return null;
    }
    
}
