package com.krishna.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.krishna.document.Customer;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {

	Customer findByFirstName(String name);

}
