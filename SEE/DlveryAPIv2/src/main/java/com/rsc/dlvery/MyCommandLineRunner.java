// package com.rsc.dlvery;

// import java.util.ArrayList;
// import java.util.List;

// import javax.transaction.Transactional;

// import com.rsc.dlvery.entity.Address;
// import com.rsc.dlvery.entity.Customer;
// import com.rsc.dlvery.entity.CustomerType;
// import com.rsc.dlvery.entity.Role;
// import com.rsc.dlvery.entity.User;
// import com.rsc.dlvery.repo.MyGeneralRepo;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;

// @Component
// public class MyCommandLineRunner implements CommandLineRunner {

//     @Autowired
//     private MyGeneralRepo repo;

//     @Override
//     @Transactional
//     public void run(String... args) throws Exception {
//         System.out.println("############### Many2Many Inserts Started");
//         User u1 = new User();
//         u1.setEmail("123@gmail.com");
//         u1.setUserid("rsc");
//         u1.setUsername("rightstroke");

//         User u2 = new User();
//         u2.setEmail("3214@gmail.com");
//         u2.setUserid("csr");
//         u2.setUsername("strokeright");

//         Role r1  = new Role();
//         r1.setRole("admin");
//         r1.setRoleDesc("admin role");

//         Role r2  = new Role();
//         r2.setRole("user");
//         r2.setRoleDesc("user role");

//         List<Role> roles1 = new ArrayList<>();
//         roles1.add(r1);
//         roles1.add(r2);

//         List<Role> roles2 = new ArrayList<>();
//         roles2.add(r2);
        

//         u1.setRoles(roles1);
//         u2.setRoles(roles2);

//         repo.save(u1);
//         repo.save(u2);

//         System.out.println("############### One2Many Inserts Started");
        
//         CustomerType cType = new CustomerType();
//         cType.setType("Priv 100C");

//         Address ad1 = new Address();
//         ad1.setAddr1("Line1");
//         ad1.setAddr2("Line2");
//         ad1.setCity("Chennai");
//         ad1.setCountry("India");
//         ad1.setPincode("1223232");

//         Address ad2 = new Address();
//         ad2.setAddr1("Line1");
//         ad2.setAddr2("Line2");
//         ad2.setCity("Chennai");
//         ad2.setCountry("India");
//         ad2.setPincode("1223232");

//         List<Address> addres = new ArrayList<>();
//         addres.add(ad1);
//         addres.add(ad2);
        
//         Customer cust = new Customer();
//         cust.setAddress(addres);
//         cust.setcType(cType);
//         cust.setDob(new java.util.Date());
//         cust.setEmail("123@gmail.com" + Math.random()*1000);
//         cust.setFname("finae");
//         cust.setLname("lname");

//         Address ad3 = new Address();
//         ad3.setAddr1("Line99");
//         ad3.setAddr2("Line77");
//         ad3.setCity("Atthipatti");
//         ad3.setCountry("India");
//         ad3.setPincode("454545");


//         CustomerType cType2 = new CustomerType();
//         cType2.setType("Priv 50C");

//         Customer cust2 = new Customer();
//         cust2.setAddress(addres);
//         cust2.setcType(cType2);
//         cust2.setDob(new java.util.Date());
//         cust2.setEmail("123@attipatti.com" + Math.random()*1000);
//         cust2.setFname("Super");
//         cust2.setLname("Star");

//         ad3.setCust(cust2);

//         repo.save(cust);

//         repo.save(ad3);
//     }
    
// }
