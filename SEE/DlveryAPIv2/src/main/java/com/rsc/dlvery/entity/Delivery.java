package com.rsc.dlvery.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_delivery")
public class Delivery {
    @EmbeddedId
    private DeliveyId id;
    
    private String name;

    private int cost;

    public DeliveyId getId() {
        return id;
    }

    public void setId(DeliveyId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    
}
