package edu.icet.ecom.service;

import edu.icet.ecom.entity.CustomerEntity;
import edu.icet.ecom.model.Customer;
import edu.icet.ecom.repo.CustomerRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private ModelMapper modelMapper;

   public Customer createCustomer(Customer customer){
       customerRepo.save(modelMapper.map(customer, CustomerEntity.class));
       return customer;
   }

}
