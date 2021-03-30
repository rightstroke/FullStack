package com.rsc.dlvery.repo;

import java.util.List;

import javax.transaction.Transactional;

import com.rsc.dlvery.entity.Customer;
import com.rsc.dlvery.entity.CustomerJoin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MyCustomerRepo extends JpaRepository<Customer,Long> {
    Customer findByCustid(int id);

    Customer findByEmail(String email);

    List<Customer> findByEmailAndFname(String email,String fname);
    
    @Query("Select c from Customer c where LOWER(c.fname)=LOWER(:name)")
    List<Customer> getMyOwnData(String name);

    @Modifying
    @Transactional
    @Query("UPDATE Customer c SET c.fname=:fname WHERE c.custid=:id")
    void updateCustomer(String fname,int id);

    @Query("Select new com.rsc.dlvery.entity.CustomerJoin(C.custid,A.addr1,A.addr2,A.city) from Customer C, Address A where C.custid=A.cust.custid")
    List<CustomerJoin> getMyJoinData();
    
}
