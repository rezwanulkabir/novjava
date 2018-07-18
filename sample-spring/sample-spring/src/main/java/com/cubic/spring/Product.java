package com.cubic.spring;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {
	
	@NotBlank(message="Id cannot be empty")
	private String id;
	
	
	@NotNull(message="Produt name is required")
	@Size(min=4, max=10, message="Product name has to be between 4 and 10")
	
	private String productName;
	
	@NotNull
	@Min(value=100)
	@Max(value=500)
	private Integer quantity;
	
	@Min(value=500)
	@Max(value=1000)
	private Integer threshold;
	
	@Valid
	private ProdutOrder order;
	}
