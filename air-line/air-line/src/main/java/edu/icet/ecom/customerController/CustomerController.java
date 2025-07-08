package edu.icet.ecom.customerController;

import edu.icet.ecom.customerDto.CustomerDto;
import edu.icet.ecom.customerEntity.CustomerEntity;
import edu.icet.ecom.customerService.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService service;

    @GetMapping("/get-customer")
    public List<CustomerDto> getCustomer(){
        return service.getAll();
    }

    @PostMapping("/post-customer")
    public void addCustomer(@RequestBody CustomerDto customerDto){
          service.addCustomer(customerDto);
    }

}
