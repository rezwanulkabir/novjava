package com.cubic.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cubic.spring.Customer;

public class SpringInheritanceTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		final Customer customer1 = context.getBean("myCustomer1", Customer.class);
		System.out.println(customer1);
		final Customer customer2 = context.getBean("myCustomer2", Customer.class);
		System.out.println(customer2);
		
		context.close();
	}

}
