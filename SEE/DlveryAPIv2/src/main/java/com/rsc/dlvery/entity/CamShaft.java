package com.rsc.dlvery.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "autoid")
public class CamShaft extends AutoParts {
    private int node;

    private int weight;

    public int getNode() {
        return node;
    }

    public void setNode(int node) {
        this.node = node;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "CamShaft [node=" + node + ", weight=" + weight + "]";
    }

    
}
