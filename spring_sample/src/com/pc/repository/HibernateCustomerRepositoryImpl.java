package com.pc.repository;

import java.util.ArrayList;
import java.util.List;

import com.pc.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Pradeep");
		customer.setLastName("Chand");
		
		customers.add(customer);
		
		return customers;
	}

}
