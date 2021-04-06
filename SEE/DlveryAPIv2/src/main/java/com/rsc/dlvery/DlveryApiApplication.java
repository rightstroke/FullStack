package com.rsc.dlvery;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.rsc.dlvery.entity.Address;
import com.rsc.dlvery.entity.Customer;
import com.rsc.dlvery.entity.CustomerType;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.rsc.dlvery.repo")
public class DlveryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DlveryApiApplication.class, args);
		//getJSON();
	}

	private static void getJSON() {

		CustomerType cType = new CustomerType();
		cType.setType("Priv 100C");

		Address ad1 = new Address();
		ad1.setAddr1("Line1");
		ad1.setAddr2("Line2");
		ad1.setCity("Chennai");
		ad1.setCountry("India");
		ad1.setPincode("1223232");

		List<Address> addres = new ArrayList<>();
		addres.add(ad1);

		Customer cust = new Customer();
		cust.setAddress(addres);
		cust.setcType(cType);
		cust.setDob(new java.util.Date());
		cust.setEmail("123@gmail.com" + Math.random() * 1000);
		cust.setFname("finae");
		cust.setLname("lname");

		Gson gs = new Gson();
		System.out.println(gs.toJson(cust));
	}

}
