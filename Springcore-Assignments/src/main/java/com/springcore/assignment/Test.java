package com.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		
		
		Customer customer=(Customer)  context.getBean("customer");
		customer.customerDetail();
		
		Customer customerCon=(Customer) context.getBean("customer");
		customerCon.customerDetail();
		
		
		
	}

}
