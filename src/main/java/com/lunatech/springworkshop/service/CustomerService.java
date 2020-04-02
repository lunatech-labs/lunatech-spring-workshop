package com.lunatech.springworkshop.service;

import com.lunatech.springworkshop.model.Customer;
import com.lunatech.springworkshop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Optional<Customer> getById(Integer id) {
        return customerRepository.findById(id);
    }
}
