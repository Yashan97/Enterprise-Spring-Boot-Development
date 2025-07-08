package edu.icet.ecom.repo;

import edu.icet.ecom.dto.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface EmployeRepo extends JpaRepository <Employe, Integer>{


}
