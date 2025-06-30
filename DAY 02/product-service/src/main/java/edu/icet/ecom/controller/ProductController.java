package edu.icet.ecom.controller;

import edu.icet.ecom.module.Product;
import edu.icet.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ProductController {
    @Autowired
    ProductService service;

    @PostMapping("/create-product")
    void createProduct(@RequestBody Product product){

        service.createProduct(product);




    }
}
