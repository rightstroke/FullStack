package com.rsc.dlvery.service;

import java.util.List;

import javax.transaction.Transactional;

import com.rsc.dlvery.entity.Customer;
import com.rsc.dlvery.entity.custom.CustomerCityJoin;
import com.rsc.dlvery.repo.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerManagerImpl implements CustomerManager {

    @Autowired
    private CustomerRepository repo;

    @Override
    public Customer save(Customer cust) {
        repo.save(cust);
        
        
        
        //List<Object[]> obj = repo.getCustomerById(cust.getCustid());
        
        // System.out.println(obj.size());
        // System.out.println(obj.get(0).length);
        // System.out.println((int) obj.get(0)[0]);
        // System.out.println((String) obj.get(0)[1]);
        // System.out.println((String) obj.get(0)[2]);
        //Customer custRes = new Customer();
        //custRes.setCustid((int) obj.get(0)[0]);
        //custRes.setFname((String) obj.get(0)[1]);
        //custRes.setEmail((String) obj.get(0)[2]);

        return cust;
        
    }

    @Override
    public List<Customer> getAllCustomer() {
        return repo.findAll();
    }

    @Override
    public Customer findByCustId(int id) {
        return repo.findByCustid(id);
    }

    @Override
    public Customer findByEmail(String email) {
        return repo.findByEmail(email);
    }

    @Override
    public List<Customer> findByEmailAndFname(String email, String fname) {
        return repo.findByEmailAndFname(email, fname);
    }

    @Override
    public List<Customer> getCustomerData(String fname) {
        // TODO Auto-generated method stub
        return repo.getCustomerData(fname);
    }

    @Override
    public Customer updateCustomer(String fname, int id) {
       repo.updateCustomer(fname, id);
    
       return repo.findByCustid(id);
    }

    @Override
    public List<CustomerCityJoin> getCustomerFromAnyCity(String city) {
        return repo.getCustomerFromAnyCity(city);
    }

    // public void doSomething() {
    //     Customer cust = repo.action1(); //Insert Op, and No Exception

    //     repo.action2(cust.getAge()); //update , No Excepton

    //     Customer cust = repo.action1(); //Insert Op, and throws Exception
    // }


    
}
 