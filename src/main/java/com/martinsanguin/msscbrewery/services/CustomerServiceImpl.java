package com.martinsanguin.msscbrewery.services;

import com.martinsanguin.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getById(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Martin")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void updateCustomer(UUID id, CustomerDto customerDto) {
        log.debug("Update customer..");
    }

    @Override
    public void deleteCustomer(UUID id) {
        log.debug("Delete customer..");
    }
}
