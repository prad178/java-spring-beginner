package com.pc.service;

import java.util.List;

import com.pc.model.Customer;
import com.pc.repository.CustomerRepository;
import com.pc.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
