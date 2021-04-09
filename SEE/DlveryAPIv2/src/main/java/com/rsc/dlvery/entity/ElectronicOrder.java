package com.rsc.dlvery.entity;

import javax.persistence.Entity;

@Entity
public class ElectronicOrder extends Order {
    private String type;

    private String manuf;

    private int cost;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManuf() {
        return manuf;
    }

    public void setManuf(String manuf) {
        this.manuf = manuf;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ElectronicOrder [cost=" + cost + ", manuf=" + manuf + ", type=" + type + "]";
    }

    
}
