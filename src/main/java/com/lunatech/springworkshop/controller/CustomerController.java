package com.lunatech.springworkshop.controller;

import com.lunatech.springworkshop.dto.CustomerDto;
import com.lunatech.springworkshop.model.Customer;
import com.lunatech.springworkshop.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDto getCustomer(@PathVariable("id") Integer id) {

        log.info("Entering getCustomer");
        Optional<Customer> customerOptional = customerService.getById(id);
        if(customerOptional.isPresent()) {
            log.info(String.format("Customer exists with id %d", id));
            return customerOptional.map(customer -> {
                CustomerDto customerDto = new CustomerDto();
                customerDto.setAddress(customer.getAddressLine1().concat(
                        customer.getAddressLine2() == null ? "" : customer.getAddressLine2()));
                customerDto.setCity(customer.getCity());
                customerDto.setContactFullName(customer.getContactFirstName().concat(customer.getContactLastName()));
                customerDto.setCountry(customer.getCountry());
                customerDto.setCreditLimit(customer.getCreditLimit());
                customerDto.setCustomerId(String.valueOf(customer.getCustomerNumber()));
                customerDto.setName(customer.getCustomerName());
                customerDto.setPhone(customer.getPhone());
                customerDto.setPostalCode(customer.getPostalCode());
                return customerDto;
            }).get();
        } else {
            log.info(String.format("Customer doesn't exists with id %d", id));
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,  String.format("Customer id %d, not found", id));
        }
    }
}
