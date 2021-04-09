package com.rsc.dlvery.entity;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="animaltype",discriminatorType = DiscriminatorType.STRING)
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Boolean isMeatEater;

    private Boolean isPet;

    @Temporal(TemporalType.DATE)
    private Date dob;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getIsMeatEater() {
        return isMeatEater;
    }

    public void setIsMeatEater(Boolean isMeatEater) {
        this.isMeatEater = isMeatEater;
    }

    public Boolean getIsPet() {
        return isPet;
    }

    public void setIsPet(Boolean isPet) {
        this.isPet = isPet;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Animal [dob=" + dob + ", id=" + id + ", isMeatEater=" + isMeatEater + ", isPet=" + isPet + "]";
    }

    
}
