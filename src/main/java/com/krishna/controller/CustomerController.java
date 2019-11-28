package com.krishna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.document.Customer;
import com.krishna.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customers")
	public Iterable<Customer> saveAllCustomers(@RequestBody List<Customer> customers) {
		return customerService.saveCustomer(customers);
	}
	
	@PostMapping
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}
	
	@GetMapping
	public Iterable<Customer> findAllCustomers(){
		return customerService.findAll();
	}
	
	@GetMapping("/name/{name}")
	public Customer findByFirstName(@PathVariable String name) {
		return customerService.findByFirstName(name);
	}
	
	@GetMapping("/{id}")
	public Customer findById(@PathVariable String id) {
		return customerService.findById(id);
	}
	
}
