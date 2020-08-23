package com.makemake.springmvc.services;

import com.makemake.springmvc.domain.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomers();

    Customer findCustomerById(Long id);

    Customer saveCustomer(Customer customer);
}
