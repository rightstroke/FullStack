package com.rsc.dlvery.entity;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_deliveryItem")
public class DelivertItem {
    @EmbeddedId
    private DeliveryId id;

    private String name;

    public DeliveryId getId() {
        return id;
    }

    public void setId(DeliveryId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
