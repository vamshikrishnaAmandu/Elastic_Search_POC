package com.krishna.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.krishna.document.Customer;

public interface CustomerService {

	public Iterable<Customer> saveCustomer(@RequestBody List<Customer> customers);

	public Iterable<Customer> findAll();

	public Customer findByFirstName(String name);

	public Customer createCustomer(Customer customer);

	public Customer findById(String id); 
}
