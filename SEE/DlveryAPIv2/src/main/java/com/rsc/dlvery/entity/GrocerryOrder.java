package com.rsc.dlvery.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class GrocerryOrder extends Order {
    @Temporal(TemporalType.DATE)
    private Date expiry;

    private Boolean isFruits;

    @Override
    public String toString() {
        return "GrocerryOrder [expiry=" + expiry + ", isFruits=" + isFruits + "]";
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public Boolean getIsFruits() {
        return isFruits;
    }

    public void setIsFruits(Boolean isFruits) {
        this.isFruits = isFruits;
    }

    

    
}
