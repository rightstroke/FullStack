package com.rsc.dlvery.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C")
public class Cat extends Animal {
    private String color;

    private String prefFood;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrefFood() {
        return prefFood;
    }

    public void setPrefFood(String prefFood) {
        this.prefFood = prefFood;
    }

    @Override
    public String toString() {
        return "Cat [color=" + color + ", prefFood=" + prefFood + "]";
    }
    
}
