package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerControler{
	
	@PostMapping("addcust")
	String addCustomer(@RequestBody Customer c)
	{
		
		CustomerService cs = new CustomerService();
		
		cs.saveCustomerinDb(c);
		return "Hellooooohiii";
	
		
	}
	
}
