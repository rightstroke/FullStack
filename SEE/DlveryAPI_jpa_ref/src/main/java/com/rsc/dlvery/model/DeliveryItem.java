package com.rsc.dlvery.model;

import javax.validation.constraints.NotBlank;

public class DeliveryItem extends BaseModel {

    private int id;

    @NotBlank(message = "Item Name cannot be Blank")
    private String itemname;
    
    @NotBlank(message = "Delivery Agent cannot be Blank")
    private String deliveryAgent;

    public DeliveryItem(int id, String itemname, String deliveryAgent) {
        this.id = id;
        this.itemname = itemname;
        this.deliveryAgent = deliveryAgent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getDeliveryAgent() {
        return deliveryAgent;
    }

    public void setDeliveryAgent(String deliveryAgent) {
        this.deliveryAgent = deliveryAgent;
    }

    @Override
    public String toString() {
        return "DeliveryItem [deliveryAgent=" + deliveryAgent + ", id=" + id + ", itemname=" + itemname + "]";
    }


    
}
