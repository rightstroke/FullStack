package com.rsc.dlvery.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DeliveyId implements Serializable {
    private String itemCode;

    private String ordernum;

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    
}
