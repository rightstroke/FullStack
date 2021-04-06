package com.rsc.dlvery.model;


public class CustomerByNameAndEmailRequest extends BaseModel{
    private String fname;

    private String email;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}