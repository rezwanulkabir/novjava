package com.cubic.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cubic.spring.Customer;

public class SpringText1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		final Customer customer = context.getBean("customer", Customer.class);
		System.out.println(customer);
		context.close();
	}

}
