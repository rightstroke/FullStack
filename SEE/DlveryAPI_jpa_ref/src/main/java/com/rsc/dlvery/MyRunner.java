// package com.rsc.dlvery;

// import java.util.ArrayList;
// import java.util.List;

// import javax.transaction.Transactional;

// import com.rsc.dlvery.entity.Address;
// import com.rsc.dlvery.entity.Customer;
// import com.rsc.dlvery.entity.CustomerType;
// import com.rsc.dlvery.entity.DelivertItem;
// import com.rsc.dlvery.entity.DeliveryId;
// import com.rsc.dlvery.entity.Role;
// import com.rsc.dlvery.entity.User;
// //import com.rsc.dlvery.repo.GeneralRepo;
// import com.rsc.dlvery.repo.MyCustomerRepo;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;

// @Component
// public class MyRunner implements CommandLineRunner {

//     @Autowired
//     private MyCustomerRepo repo;

//     @Override
//     @Transactional
//     public void run(String... args) throws Exception {
//       //One2Many
//       Address addr1 = new Address();
//       addr1.setAddr1("Line 123");
//       addr1.setAddr2("Line 456");
//       addr1.setCity("Kottampatti");
//       addr1.setCountry("India");
//       addr1.setPincode("600087");

//       Address addr2 = new Address();
//       addr2.setAddr1("Line 223");
//       addr2.setAddr2("Line 556");
//       addr2.setCity("Atthipatti");
//       addr2.setCountry("Singapire");
//       addr2.setPincode("600056");

//       List<Address> addrs = new ArrayList<>();
//       addrs.add(addr1);
//       addrs.add(addr2);

//       CustomerType cType = new CustomerType();
//       cType.setDescription("Priv 100C");
//       //cType.setId(1);

//       Customer cust = new Customer();
//       //cust.setCustid(123);
//       cust.setDob(new java.util.Date());
//       cust.setEmail("abcd@test.com" + Math.random()*1000);
//       cust.setFname("Vellaingiri");
//       cust.setLname("Siva");
//       cust.setCustType(cType);
//       cust.setAddress(addrs);
//       repo.save(cust);
//       System.out.println("############Saving Customer");
//     }

    
    
    
// }
