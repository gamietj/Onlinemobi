/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abdul.onlinemobi.services.Impl;

import com.abdul.onlinemobi.domain.Contact;
import com.abdul.onlinemobi.domain.Customer;
import com.abdul.onlinemobi.repository.CustomerRepository;
import com.abdul.onlinemobi.services.CustomerIdService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hashcode
 */
@Service
public class CustomerIdServiceImpl implements CustomerIdService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustId(Long id) {
        List<Customer> customer = new ArrayList<>();
        List<Customer> allCustomers = customerRepository.findAll();

        for (Customer customer : allCustomers) {
            if (customer.getId() > id) {
                customer.add(customer);
            }
        }
        return customer;
    }

}
