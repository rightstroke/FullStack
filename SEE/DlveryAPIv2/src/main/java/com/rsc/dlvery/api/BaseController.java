package com.rsc.dlvery.api;

import java.util.ArrayList;
import java.util.List;

import com.rsc.dlvery.model.DeliveryItem;

public abstract class BaseController {
    public List<DeliveryItem> getDelItems(){
        DeliveryItem di1 = new DeliveryItem(1, "REDMI", "agent1");
        DeliveryItem di2 = new DeliveryItem(2, "Samsung", "agent3");
        DeliveryItem di3 = new DeliveryItem(3, "Oppo", "agent7");
        DeliveryItem di4 = new DeliveryItem(4, "icroMax", "agent3");
        
        List<DeliveryItem> lstDls = new ArrayList<>();
        lstDls.add(di1);
        lstDls.add(di2);
        lstDls.add(di3);
        lstDls.add(di4);
        return lstDls;
    }
}
