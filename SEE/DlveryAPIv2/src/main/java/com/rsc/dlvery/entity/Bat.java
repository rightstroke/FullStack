package com.rsc.dlvery.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class Bat extends Animal {
    private String canStandStraight;

    private int weight;

    public String getCanStandStraight() {
        return canStandStraight;
    }

    public void setCanStandStraight(String canStandStraight) {
        this.canStandStraight = canStandStraight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bat [canStandStraight=" + canStandStraight + ", weight=" + weight + "]";
    }

    
}
