package com.rsc.dlvery.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DeliveryId implements Serializable {
    private String itemCd;

    private String orderId;

    public String getItemCd() {
        return itemCd;
    }

    public void setItemCd(String itemCd) {
        this.itemCd = itemCd;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public DeliveryId(String itemCd, String orderId) {
        this.itemCd = itemCd;
        this.orderId = orderId;
    }

    
}
