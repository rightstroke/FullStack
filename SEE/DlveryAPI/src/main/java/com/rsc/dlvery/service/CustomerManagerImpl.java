package com.rsc.dlvery.service;

import java.util.List;

import javax.transaction.Transactional;

import com.rsc.dlvery.entity.Customer;
import com.rsc.dlvery.repo.CustomerRepoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerManagerImpl implements CustomerManager {

    @Autowired
    private CustomerRepoImpl repo;

    @Override
    public Customer save(Customer cust) {
        repo.save(cust);
        List<Object[]> obj = repo.getCustomerById(cust.getCustid());
        
        // System.out.println(obj.size());
        // System.out.println(obj.get(0).length);
        // System.out.println((int) obj.get(0)[0]);
        // System.out.println((String) obj.get(0)[1]);
        // System.out.println((String) obj.get(0)[2]);
        Customer custRes = new Customer();
        custRes.setCustid((int) obj.get(0)[0]);
        custRes.setFname((String) obj.get(0)[1]);
        custRes.setEmail((String) obj.get(0)[2]);

        return custRes;
        
    }

    @Override
    public List<Customer> getAllCustomer() {
        return repo.getAllCustomer();
    }
    
}
 