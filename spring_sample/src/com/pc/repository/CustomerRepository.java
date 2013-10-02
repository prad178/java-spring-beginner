package com.pc.repository;

import java.util.List;

import com.pc.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}