package com.rsc.dlvery.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class AutoParts {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int autoId;

    private String prodCode;

    private String type;

  

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AutoParts [id=" + autoId + ", prodCode=" + prodCode + ", type=" + type + "]";
    }

    
}
