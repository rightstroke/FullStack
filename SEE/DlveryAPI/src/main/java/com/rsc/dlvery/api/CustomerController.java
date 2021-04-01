package com.rsc.dlvery.api;

import java.util.List;

import javax.validation.Valid;

import com.rsc.dlvery.entity.Customer;
import com.rsc.dlvery.service.CustomerManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CustomerController extends BaseController{
    @Autowired
    private CustomerManager service;

    @PostMapping(value = "/cust",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> addCustomer(@Valid @RequestBody Customer cust) {

        Customer custRes = service.save(cust);

        return new ResponseEntity<Customer>(custRes,HttpStatus.OK);
    }
    
}
