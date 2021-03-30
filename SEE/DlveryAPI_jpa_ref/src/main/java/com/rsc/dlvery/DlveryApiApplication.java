package com.rsc.dlvery;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.rsc.dlvery.entity.Address;
import com.rsc.dlvery.entity.Customer;
import com.rsc.dlvery.entity.CustomerType;
import com.rsc.dlvery.entity.Role;
import com.rsc.dlvery.entity.User;
import com.rsc.dlvery.repo.MyCustomerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.rsc.dlvery.repo")
public class DlveryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DlveryApiApplication.class, args);
	}

	@Bean
	@Transactional
	public CommandLineRunner demo(MyCustomerRepo repository) {
		return (args) -> {
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


			repository.save(cust);
			System.out.println("1############");
			repository.findAll().forEach(System.out::println);
			System.out.println("2############");
			System.out.println(repository.findByCustid(13));
			System.out.println("3############");
			System.out.println(repository.findByEmail("abcd@test.com157.36619951666154"));
			System.out.println("4############");
			repository.getMyOwnData("Vellaingiri").forEach(System.out::println);
			System.out.println("5############");
			repository.updateCustomer("SuperStar", 13);
			System.out.println("6############");
			System.out.println(repository.findByEmailAndFname("abcd@test.com157.36619951666154","Vellaingiri"));
			System.out.println("7############");
			//System.out.println(repository.getMyJoinData());
			repository.getMyJoinData().forEach(System.out::println);
		};
	}

}

// @EnableJpaRepositories(basePackages = "com.rsc.dlvery.repo")
