package com.martinsanguin.msscbrewery.services;

import com.martinsanguin.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    public CustomerDto getById(UUID id);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(UUID id, CustomerDto customerDto);

    void deleteCustomer(UUID id);
}
