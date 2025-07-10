package edu.icet.ecom.customerController;

import edu.icet.ecom.customerDto.CustomerDto;
import edu.icet.ecom.customerEntity.CustomerEntity;
import edu.icet.ecom.customerService.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService service;

    @GetMapping("/get-customer")
    public List<CustomerDto> getCustomer(){
        return service.getAll();
    }

    @PostMapping("/add-customer")
    public void addCustomer(@RequestBody CustomerDto customerDto){
          service.addCustomer(customerDto);
    }

    @DeleteMapping("/{isbn}")
    public void deleteCustomer(@PathVariable Integer isbn){

        service.deleteCustomer(isbn);
    }

    @PutMapping("/update-customer")
    public  void updateCustomer(@RequestBody   CustomerDto customerDto){
        service.update(customerDto);
    }

    @GetMapping("/{isbn}")
    public CustomerDto searchById(@PathVariable Integer isbn){

        return service.searchById(isbn);
    }

}
