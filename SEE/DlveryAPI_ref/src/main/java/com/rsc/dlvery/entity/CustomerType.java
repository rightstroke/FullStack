package com.rsc.dlvery.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cust_type")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;

    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CustomerType [description=" + description + ", id=" + id + "]";
    }

    
}
