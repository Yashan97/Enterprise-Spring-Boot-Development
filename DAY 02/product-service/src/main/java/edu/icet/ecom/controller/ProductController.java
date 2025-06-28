package edu.icet.ecom.controller;

import edu.icet.ecom.module.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ProductController {
    @PostMapping("/create-product")
    void createProduct(@RequestBody Product product){
        System.out.println(product);



    }
}
