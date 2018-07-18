package com.cubic.spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Customer {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String version;
	
	private Address home;
	private Address office;
	public Customer() {
		
	}
	

	public void init() {
		System.out.println("initialisation called");
		this.id = new Long(300);
	}
	public void cleanUp() {
		System.out.println("clean up called");
		this.id= null;
	}


	public Customer(Long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Customer(Long id, String lastName) {
		super();
		this.id = id;
		this.lastName = lastName;
	}
}
