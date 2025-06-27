package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class ProductController {
    @GetMapping("/get-products")
    ArrayList<Product> getProduct(){
        ProductService productService = new ProductService();
         ArrayList<Product> products = productService.getProduct();
        System.out.println(products);
        return products;
    }
}
