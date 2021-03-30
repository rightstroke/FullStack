package com.rsc.dlvery.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "tbl_cust")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)   
    private int custid;

    @Column(name="firstname")
    private String fname;

    @Column(name="lastname")
    private String lname;

    @Column(unique = true)
    private String email;

    @Temporal(TemporalType.DATE)
    private Date dob;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="cust_id")
    private List<Address> address;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,optional=false)
    private CustomerType custType;

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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Customer [custid=" + custid + ", dob=" + dob + ", email=" + email + ", fname=" + fname + ", lname="
                + lname + "]";
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public CustomerType getCustType() {
        return custType;
    }

    public void setCustType(CustomerType custType) {
        this.custType = custType;
    }

    
}
