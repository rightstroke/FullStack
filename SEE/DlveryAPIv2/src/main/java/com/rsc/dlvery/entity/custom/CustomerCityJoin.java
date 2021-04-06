package com.rsc.dlvery.entity.custom;

import java.io.Serializable;

public class CustomerCityJoin implements Serializable {

    private int custid;
    private String fname;
    private String lname;
    private String email; 
    private String country;


    public CustomerCityJoin(int custid,String fname,String lname,String email, String country){
        this.custid = custid;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.country = country;
    }


    public int getCustid() {
        return custid;
    }


    public void setCustid(int custid) {
        this.custid = custid;
    }


    public String getFname() {
        return fname;
    }


    public void setFname(String fname) {
        this.fname = fname;
    }


    public String getLname() {
        return lname;
    }


    public void setLname(String lname) {
        this.lname = lname;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }

    
}
