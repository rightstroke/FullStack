package com.rsc.dlvery.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Entity
@PrimaryKeyJoinColumn(name = "autoid")
public class WindShield extends AutoParts  {
    private String typeOfGlas;

    public String getTypeOfGlas() {
        return typeOfGlas;
    }

    public void setTypeOfGlas(String typeOfGlas) {
        this.typeOfGlas = typeOfGlas;
    }

    @Override
    public String toString() {
        return "WindShield [typeOfGlas=" + typeOfGlas + "]";
    }



}
