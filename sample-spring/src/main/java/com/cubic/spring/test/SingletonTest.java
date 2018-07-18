package com.cubic.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cubic.spring.Customer;

public class SingletonTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		final Customer customer1 = context.getBean(Customer.class);
		System.out.println(customer1);
		
		context.close();
	}

}
