package com.cubic.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cubic.spring.Customer;

public class SpringConstructorTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		final Customer c = context.getBean("customer5", Customer.class);
		final Customer c1 = context.getBean("customer4", Customer.class);
		final Customer c2 = context.getBean("customer3", Customer.class);
		final Customer c3 = context.getBean("customer2", Customer.class);
		final Customer c4 = context.getBean("customer", Customer.class);
		System.out.println("customer-"+c);
		System.out.println("customer-"+c1);
		System.out.println("customer-"+c2);
		System.out.println("customer-"+c3);
		System.out.println("customer-"+c4);
		context.close();
	}

}
