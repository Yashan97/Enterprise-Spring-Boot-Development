package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Employe;
import edu.icet.ecom.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class employeController {

        @Autowired
         private  EmployeService employeService;

        @PostMapping("/create-employe")
        public Employe createEmplye(@RequestBody Employe employe){

            return employeService.createEmploye(employe);
        }
        @GetMapping("/get-employe")
        public List<Employe> getEmploye(){
           return employeService.getEmployeAll();

        }

        @PutMapping("/update-employ")
        public Employe updateEmploye(Employe employe){
            return  null;
        }
        @DeleteMapping("/delete-employe")
        public Employe deleteEmploye(Employe employe){

            return employe;
        }

}
