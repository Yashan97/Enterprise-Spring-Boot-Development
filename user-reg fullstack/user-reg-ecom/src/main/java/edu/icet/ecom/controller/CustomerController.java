package edu.icet.ecom.controller;

import edu.icet.ecom.model.Customer;
import edu.icet.ecom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.PrivateKey;

@RestController

public class CustomerController {

    @Autowired
   private CustomerService customerService;

    @PostMapping("/create-customer")
    Customer createCustomer(@RequestBody Customer customer){

        return customerService.createCustomer(customer);

    }
}
