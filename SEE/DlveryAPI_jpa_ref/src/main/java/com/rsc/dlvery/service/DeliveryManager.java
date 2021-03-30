package com.rsc.dlvery.service;

import java.util.List;

import com.rsc.dlvery.model.DeliveryItem;

public interface DeliveryManager {
    public void addDeiveryItem(DeliveryItem di);

    public void removeDeiveryItem(DeliveryItem di);

    public void updateDeiveryItem(DeliveryItem di);

    public List<DeliveryItem> fetchAllDeiveryItems();

    public List<DeliveryItem> fetchDeiveryItemById(DeliveryItem di);

}
