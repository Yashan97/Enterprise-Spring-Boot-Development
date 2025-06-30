package edu.icet.ecom.controller;

import edu.icet.ecom.model.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @PostMapping("/create-customer")
    void createCustomer(@RequestBody Customer customer){
        System.out.println(customer);


    }
}
