package com.rsc.dlvery;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.rsc.dlvery.entity.Address;
import com.rsc.dlvery.entity.Customer;
import com.rsc.dlvery.entity.CustomerType;
import com.rsc.dlvery.entity.DelivertItem;
import com.rsc.dlvery.entity.DeliveryId;
import com.rsc.dlvery.entity.Role;
import com.rsc.dlvery.entity.User;
import com.rsc.dlvery.repo.GeneralRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private GeneralRepo repo;
    

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        //System.out.println(repo.getCustomers());
        System.out.println("=======================");
        //repo.getCustomersByID(6).forEach(System.out::println);
        //System.out.println(repo.getCustomersByID(6));
        List<Object[]> datas = repo.getCustomersByID(6);
        
        for(int i=0;i<datas.size();i++) {
            Object[] obj = datas.get(i);
            System.out.println(obj[0] + "," + obj[1] + "," + obj[2]);
        }
    }

    
    @Transactional
    public void run1(String... args) throws Exception {

        //M2M
        Role role1 = new Role();
		role1.setRole("Admin");
		role1.setRole_desc("Super Admin");

		Role role2 = new Role();
		role2.setRole("ITAdmin");
		role2.setRole_desc("Super IT Admin");

		List<Role> roles = new ArrayList<>();
		roles.add(role1);
		roles.add(role2);
		
		User user = new User();
		user.setEmail("abcd@gmail.com");
		user.setUserid("rsc4567");
		user.setUsername("Siva Kumar");
		user.setRoles(roles);

        repo.save(user);
        System.out.println("############Saving User");

        //One2Many
        Address addr1 = new Address();
        addr1.setAddr1("Line 123");
        addr1.setAddr2("Line 456");
        addr1.setCity("Kottampatti");
        addr1.setCountry("India");
        addr1.setPincode("600087");

        Address addr2 = new Address();
        addr2.setAddr1("Line 223");
        addr2.setAddr2("Line 556");
        addr2.setCity("Atthipatti");
        addr2.setCountry("Singapire");
        addr2.setPincode("600056");

        List<Address> addrs = new ArrayList<>();
        addrs.add(addr1);
        addrs.add(addr2);

        CustomerType cType = new CustomerType();
        cType.setDescription("Priv 100C");
        //cType.setId(1);

        Customer cust = new Customer();
        //cust.setCustid(123);
        cust.setDob(new java.util.Date());
        cust.setEmail("abcd@test.com" + Math.random()*1000);
        cust.setFname("Vellaingiri");
        cust.setLname("Siva");
        cust.setCustType(cType);
        cust.setAddress(addrs);
        
        repo.save(cust);

        DeliveryId dId = new DeliveryId("234"+Math.random()*100, "ORD123");

        DelivertItem dItem = new DelivertItem();
        dItem.setId(dId);
        dItem.setName("BashaBhai");

        repo.save(dItem);


        Address addr3 = new Address();
        addr3.setAddr1("Line 1253");
        addr3.setAddr2("Line 4556");
        addr3.setCity("Kottampatti2");
        addr3.setCountry("Indonesha");
        addr3.setPincode("0087");

        Address addr4 = new Address();
        addr4.setAddr1("Line 1223");
        addr4.setAddr2("Line 1556");
        addr4.setCity("Kovilpatti");
        addr4.setCountry("Thailand");
        addr4.setPincode("56");

        CustomerType cType1 = new CustomerType();
        cType1.setDescription("Priv 200C");

        Customer cust3 = new Customer();
        cust3.setCustType(cType1);
        cust3.setDob(new java.util.Date());
        cust3.setEmail("1232@dsdsds.com" + Math.random()*100);
        cust3.setFname("fname");
        cust3.setLname("lname");

        addr3.setCust(cust3);
        addr4.setCust(cust3);

        repo.save(addr3);
        //repo.save(addr4);
    }
    
}
