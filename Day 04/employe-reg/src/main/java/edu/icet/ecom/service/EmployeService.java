package edu.icet.ecom.service;


import edu.icet.ecom.dto.Employe;
import edu.icet.ecom.entity.EmployeEntity;
import edu.icet.ecom.repo.EmployeRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EmployeService {

    @Autowired
    private EmployeRepo employeRepo;

    @Autowired
    private ModelMapper modelMapper;
    public Employe createEmploye(Employe employe){
         employeRepo.save(modelMapper.map(employe, Employe.class));
         return employe;
     }

     public List<Employe> getEmployeAll(){

        List<Employe> all = employeRepo.findAll();
        return modelMapper.map(all, new TypeToken<List<Employe>>(){}.getType());

    }
}
