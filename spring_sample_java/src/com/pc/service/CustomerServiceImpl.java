package com.pc.service;

import java.util.List;

import com.pc.model.Customer;
import com.pc.repository.CustomerRepository;
import com.pc.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(){
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository){
		System.out.println("Using constructor injection.");
		this.customerRepository = customerRepository;
	}


	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}



	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
