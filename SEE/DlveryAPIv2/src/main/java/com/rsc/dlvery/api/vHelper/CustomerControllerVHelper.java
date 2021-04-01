package com.rsc.dlvery.api.vHelper;

import com.rsc.dlvery.entity.Customer;
import com.rsc.dlvery.entity.custom.CustomerCityJoin;
import com.rsc.dlvery.model.CustomerByNameAndEmailResponse;
import com.rsc.dlvery.model.CustomerGetByCityResponse;

import java.util.ArrayList;
import java.util.List;

public class CustomerControllerVHelper {

    private static CustomerControllerVHelper custVhelper = null;

    private CustomerControllerVHelper() {
        // None
    }

    public static CustomerControllerVHelper getInstance() {
        if (custVhelper == null) {
            custVhelper = new CustomerControllerVHelper();
        }

        return custVhelper;
    }

    public List<CustomerByNameAndEmailResponse> getCustomerFERes(List<Customer> custs) {
        List<CustomerByNameAndEmailResponse> lstResonse = new ArrayList<>();
        System.out.println("Size of response.." + custs.size());
        for (Customer cust : custs) {
            CustomerByNameAndEmailResponse res = new CustomerByNameAndEmailResponse();
            res.setAddress(cust.getAddress());
            res.setCustid(cust.getCustid());
            res.setEmail(cust.getEmail());
            res.setFname(cust.getFname());
            System.out.println("===" + res);
            lstResonse.add(res);
        }
        return lstResonse;
    }


    public List<CustomerGetByCityResponse> getCustomerByCity(List<CustomerCityJoin> custs) {
        List<CustomerGetByCityResponse> lstResonse = new ArrayList<>();
        System.out.println("Size of response.." + custs.size());
        for (CustomerCityJoin cust : custs) {
            CustomerGetByCityResponse res = new CustomerGetByCityResponse();
            res.setCountry(cust.getCountry());
            res.setCustid(cust.getCustid());
            res.setEmail(cust.getEmail());
            res.setFname(cust.getFname());
            res.setLname(cust.getLname());
            System.out.println("===" + res);
            lstResonse.add(res);
        }
        return lstResonse;
    }
}
