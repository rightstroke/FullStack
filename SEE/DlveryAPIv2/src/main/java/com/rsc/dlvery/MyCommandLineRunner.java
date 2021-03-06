package com.rsc.dlvery;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.rsc.dlvery.entity.Address;
import com.rsc.dlvery.entity.Animal;
import com.rsc.dlvery.entity.Bat;
import com.rsc.dlvery.entity.CamShaft;
import com.rsc.dlvery.entity.Cat;
import com.rsc.dlvery.entity.Customer;
import com.rsc.dlvery.entity.CustomerType;
import com.rsc.dlvery.entity.ElectronicOrder;
import com.rsc.dlvery.entity.GrocerryOrder;
import com.rsc.dlvery.entity.Order;
import com.rsc.dlvery.entity.Role;
import com.rsc.dlvery.entity.User;
import com.rsc.dlvery.entity.WindShield;
import com.rsc.dlvery.repo.AnimalRepository;
import com.rsc.dlvery.repo.AutoPartsRepository;
import com.rsc.dlvery.repo.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private AnimalRepository animalRepo;

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private AutoPartsRepository autoPartsRepo;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        List lstTemp =new ArrayList();

        GrocerryOrder gOrder = new GrocerryOrder();
        gOrder.setExpiry(new java.util.Date());
        gOrder.setIsFruits(true);
        gOrder.setOrderDate(new java.util.Date());
        gOrder.setOrderRefNumber("ORD12233245465");
        
        ElectronicOrder eOrder = new ElectronicOrder();
        eOrder.setCost(10000);
        eOrder.setManuf("MicroMax");
        eOrder.setOrderDate(new java.util.Date());
        eOrder.setOrderRefNumber("ORDELECMOBILE12432323");
        eOrder.setType("Mobile");

        orderRepo.save(eOrder);
        orderRepo.save(gOrder);

        System.out.println("==========Fetch Orders..");

        orderRepo.getOrders(19).forEach(System.out::println);


        System.out.println("RECORDS SAVE>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        Cat cat = new Cat();
        cat.setColor("brown");
        cat.setDob(new java.util.Date());
        cat.setIsMeatEater(true);
        cat.setIsPet(false);
        cat.setPrefFood("CurdRice");

        Bat bat = new Bat();
        bat.setCanStandStraight("false");
        bat.setDob(new java.util.Date());
        bat.setIsMeatEater(false);
        bat.setIsPet(false);
        bat.setWeight(12);

        animalRepo.save(cat);
        animalRepo.save(bat);

        List<Animal> animals = animalRepo.getAnimals();
        
        for(Animal a : animals) {
            if (a instanceof Cat) {
                Cat c = (Cat) a;
                System.out.println("[cat].." + c);
            } else {
                Bat b = (Bat) a;
                System.out.println("[bat].." + b);
            }
        }

        System.out.println("RECORDS SAVE>2>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        CamShaft cs = new CamShaft();
        cs.setNode(5);
        cs.setProdCode("BOSCH");
        cs.setType("4WCam");
        cs.setWeight(150);

        WindShield ws = new WindShield();
        ws.setProdCode("SAINTGOBAIN");
        ws.setType("3EAuto");
        ws.setTypeOfGlas("CATE1");

        autoPartsRepo.save(cs);
        autoPartsRepo.save(ws);

        System.out.println("RECORDS SAVE>3>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println(autoPartsRepo.getAutoPartsByid(35));

        System.out.println(autoPartsRepo.getAutoPartsByid2(42));

        for(int i=0;i<100000;i++) {
            WindShield ws1 = new WindShield();
            ws1.setProdCode("SAINTGOBAIN");
            ws1.setType("3EAuto");
            ws1.setTypeOfGlas("CATE1");
            Thread.sleep(10);
            System.out.println(ws1.toString());
            lstTemp.add(ws1);
        }

        // System.out.println("############### Many2Many Inserts Started");
        // User u1 = new User();
        // u1.setEmail("123@gmail.com");
        // u1.setUserid("rsc");
        // u1.setUsername("rightstroke");

        // User u2 = new User();
        // u2.setEmail("3214@gmail.com");
        // u2.setUserid("csr");
        // u2.setUsername("strokeright");

        // Role r1  = new Role();
        // r1.setRole("admin");
        // r1.setRoleDesc("admin role");

        // Role r2  = new Role();
        // r2.setRole("user");
        // r2.setRoleDesc("user role");

        // List<Role> roles1 = new ArrayList<>();
        // roles1.add(r1);
        // roles1.add(r2);

        // List<Role> roles2 = new ArrayList<>();
        // roles2.add(r2);
        

        // u1.setRoles(roles1);
        // u2.setRoles(roles2);

        // repo.save(u1);
        // repo.save(u2);

        // System.out.println("############### One2Many Inserts Started");
        
        // CustomerType cType = new CustomerType();
        // cType.setType("Priv 100C");

        // Address ad1 = new Address();
        // ad1.setAddr1("Line1");
        // ad1.setAddr2("Line2");
        // ad1.setCity("Chennai");
        // ad1.setCountry("India");
        // ad1.setPincode("1223232");

        // Address ad2 = new Address();
        // ad2.setAddr1("Line1");
        // ad2.setAddr2("Line2");
        // ad2.setCity("Chennai");
        // ad2.setCountry("India");
        // ad2.setPincode("1223232");

        // List<Address> addres = new ArrayList<>();
        // addres.add(ad1);
        // addres.add(ad2);
        
        // Customer cust = new Customer();
        // cust.setAddress(addres);
        // cust.setcType(cType);
        // cust.setDob(new java.util.Date());
        // cust.setEmail("123@gmail.com" + Math.random()*1000);
        // cust.setFname("finae");
        // cust.setLname("lname");

        // Address ad3 = new Address();
        // ad3.setAddr1("Line99");
        // ad3.setAddr2("Line77");
        // ad3.setCity("Atthipatti");
        // ad3.setCountry("India");
        // ad3.setPincode("454545");


        // CustomerType cType2 = new CustomerType();
        // cType2.setType("Priv 50C");

        // Customer cust2 = new Customer();
        // cust2.setAddress(addres);
        // cust2.setcType(cType2);
        // cust2.setDob(new java.util.Date());
        // cust2.setEmail("123@attipatti.com" + Math.random()*1000);
        // cust2.setFname("Super");
        // cust2.setLname("Star");

        // ad3.setCust(cust2);

        // repo.save(cust);

        // repo.save(ad3);
    }
    
}
