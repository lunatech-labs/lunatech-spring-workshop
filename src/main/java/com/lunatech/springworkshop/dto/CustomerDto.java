package com.lunatech.springworkshop.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {

    private String customerId;
    private String name;
    private String contactFullName;
    private String phone;
    private String address;
    private String city;
    private String postalCode;
    private String country;
    private Number creditLimit;

}
