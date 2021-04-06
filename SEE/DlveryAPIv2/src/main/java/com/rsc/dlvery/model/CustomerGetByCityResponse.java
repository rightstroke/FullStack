package com.rsc.dlvery.model;

public class CustomerGetByCityResponse {
    private int custid;
    private String fname;
    private String lname;
    private String email; 
    private String country;

    
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
