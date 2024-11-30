package com.cjc.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Product;

@RestController
public class ProductController
{
	

	@PostMapping("/save")
	public ResponseEntity<Product> createProduct(@RequestBody Product product)
	{
		
		return new ResponseEntity<Product>(product,HttpStatus.CREATED);
	}
	
}
