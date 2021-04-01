package com.rsc.dlvery.model;

import java.util.List;

import com.rsc.dlvery.entity.Address;

public class CustomerByNameAndEmailResponse extends BaseModel {
    private String fname;

    private String email;

    private int custid;

    private List<Address> address;

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

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerByNameAndEmailResponse [address=" + address + ", custid=" + custid + ", email=" + email
                + ", fname=" + fname + "]";
    }

    
}