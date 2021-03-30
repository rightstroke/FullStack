package com.rsc.dlvery.entity;

public class CustomerJoin {

    private int custid;

    private String addr1;

    private String addr2;

    private String city;

    public CustomerJoin(){
        
    }

    public CustomerJoin(int custid,String addr1,String addr2,String city){
        this.custid=custid;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.city = city;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    @Override
    public String toString() {
        return "CustomerJoin [addr1=" + addr1 + ", addr2=" + addr2 + ", city=" + city + ", custid=" + custid + "]";
    }

    
}
