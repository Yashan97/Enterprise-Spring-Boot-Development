package edu.icet.ecom.controller;

import edu.icet.ecom.module.Product;
import edu.icet.ecom.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProductController {
    @GetMapping("/get-new products")
   ArrayList<Product> getProduct(){
        ProductService productService = new ProductService();
        ArrayList<Product> productList = productService.getProductList();
        System.out.println(productList);
        return productList;
    }
}
