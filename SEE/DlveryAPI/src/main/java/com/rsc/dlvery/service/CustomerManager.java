package com.rsc.dlvery.service;

import java.util.List;

import com.rsc.dlvery.entity.Customer;

public interface CustomerManager {
    public Customer save(Customer o) ;

    public List<Customer> getAllCustomer();
}
