package com.rsc.dlvery;

import java.util.ArrayList;
import java.util.List;

import com.rsc.dlvery.entity.Role;
import com.rsc.dlvery.entity.User;
import com.rsc.dlvery.repo.GeneralRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude=HibernateJpaAutoConfiguration.class)
public class DlveryApiApplication {



    public static void main(String[] args) {
		SpringApplication.run(DlveryApiApplication.class, args);

		
	}

}
