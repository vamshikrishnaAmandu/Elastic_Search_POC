package com.krishna.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.document.Customer;
import com.krishna.exception.CustomerNotFoundException;
import com.krishna.repository.CustomerRepository;
import com.krishna.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Iterable<Customer> saveCustomer(List<Customer> customers) {

		return customerRepository.saveAll(customers);
	}

	@Override
	public Iterable<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findByFirstName(String name) {
		Customer customer = customerRepository.findByFirstName(name);
		if (customer != null) {
			return customer;
		}
		throw new CustomerNotFoundException(name);
	}

	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer findById(String id) {
		Optional<Customer> opt = customerRepository.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		throw new CustomerNotFoundException(id);
	}

}
