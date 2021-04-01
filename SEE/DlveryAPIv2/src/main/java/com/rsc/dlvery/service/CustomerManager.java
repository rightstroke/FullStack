package com.rsc.dlvery.service;

import java.util.List;

import com.rsc.dlvery.entity.Customer;
import com.rsc.dlvery.entity.custom.CustomerCityJoin;

public interface CustomerManager {
    public Customer save(Customer o) ;

    public List<Customer> getAllCustomer();

    public Customer findByCustId(int id);

    public Customer findByEmail(String email);

    public List<Customer> findByEmailAndFname(String email,String fnama);

    public List<Customer> getCustomerData(String fname);

    public Customer updateCustomer(String fname,int id);

    List<CustomerCityJoin> getCustomerFromAnyCity(String city);
}
