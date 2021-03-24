package com.rsc.srm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rsc.srm.mybean.Car;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		//Car c = new Car(); // instance 1
		//Car c1 = new Car(); // instance 2
		
		//IOC
		Car mycar =  (Car) ctx.getBean("mycar");
		
		System.out.println(mycar);
		
		Car mycar2 =  (Car) ctx.getBean("mycar3");
		//mycar2.setColor("Raddish Red");
		
		
		System.out.println(mycar2);
		
		ctx.registerShutdownHook();
		
	}

}
