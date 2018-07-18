package com.cubic.spring.test;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.cubic.spring.Product;

public class ProductValidator {

	public static void main(String[] args) {
	ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
	Validator validator = factory.getValidator();
	Product product = Product.builder().id("123").productName("asdfasdfasdfasdfsdfsdfsdf").build();
	Product product2 = Product.builder().build();
	
 Set<ConstraintViolation<Product>> results =	validator.validate(product);
 
 for(ConstraintViolation<Product> constraints: results) {
	 System.out.println(constraints.getMessage());
	 
 }
 

	}

}
