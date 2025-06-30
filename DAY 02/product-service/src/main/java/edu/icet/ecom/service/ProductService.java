package edu.icet.ecom.service;

import edu.icet.ecom.module.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
   public void createProduct(Product product){
        double txtAmount =(product.getPrice() /100)*20;
        double sellingPrice = product.getPrice()+txtAmount;

        //DB Insert here
    }
}
