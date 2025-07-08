package edu.icet.ecom.customerService;

import edu.icet.ecom.customerDto.CustomerDto;
import edu.icet.ecom.customerEntity.CustomerEntity;
import edu.icet.ecom.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService {
    @Autowired
    CustomerRepo customerRepo;
        public List<CustomerDto> getAll(){
            List<CustomerEntity> all = customerRepo.findAll();
            List<CustomerDto> customerDtos = new ArrayList<>();

            for (CustomerEntity customer: all){
                CustomerDto customerDto = new CustomerDto();
                customerDto.setIsbn(customer.getIsbn());
                customerDto.setTitle(customer.getAuthor());
                customerDto.setAuthor(customer.getAuthor());

                customerDtos.add(customerDto);
            }
            return customerDtos;
        }

      public  void addCustomer(CustomerDto customerDto){
//            ---------mapping----------
          CustomerEntity customerEntity = new CustomerEntity();
          customerEntity.setIsbn(customerDto.getIsbn());
          customerEntity.setTitle(customerDto.getTitle());
          customerEntity.setAuthor(customerDto.getAuthor());
//          ------------mapping ------------
          customerRepo.save(customerEntity);
      }
}
