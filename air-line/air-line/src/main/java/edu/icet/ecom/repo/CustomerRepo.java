package edu.icet.ecom.repo;

import edu.icet.ecom.customerEntity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer> {

}
