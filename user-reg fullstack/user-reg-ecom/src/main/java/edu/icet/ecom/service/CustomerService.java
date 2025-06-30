package edu.icet.ecom.service;

import edu.icet.ecom.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

   public Customer createCustomer(Customer customer){
            customer.getName();
            return customer;
    }

}
