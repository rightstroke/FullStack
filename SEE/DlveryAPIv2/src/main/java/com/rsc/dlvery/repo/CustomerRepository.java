package com.rsc.dlvery.repo;

import java.util.List;

import javax.transaction.Transactional;

import com.rsc.dlvery.entity.Customer;
import com.rsc.dlvery.entity.custom.CustomerCityJoin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
    public Customer findByCustid(int id);

    public Customer findByEmail(String email);

    public List<Customer> findByEmailAndFname(String email,String fname);

    @Query("select c from Customer c where LOWER(c.fname)=LOWER(:fname)")
    public List<Customer> getCustomerData(String fname);

    @Modifying
    @Transactional
    @Query("Update Customer c set c.fname=:fname where c.custid=:id")
    public void updateCustomer(String fname,int id);

    @Query("select new com.rsc.dlvery.entity.custom.CustomerCityJoin(c.custid,c.fname,c.lname,c.email,a.country) from Customer c,Address a where a.city=:city")
    List<CustomerCityJoin> getCustomerFromAnyCity(String city);

    // @Query("Standard ANSI SQL HERE",nativeQuery=true)
    // List<Object[]> getNativeCustomerFromAnyCity(String city);
}
