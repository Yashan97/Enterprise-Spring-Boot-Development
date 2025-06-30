package edu.icet.ecom.service;

import edu.icet.ecom.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service // create ioc bucket
public class ProductService {

    @Value("${app.company}")
    private String company;

    @Value("${app.taxValue}")
    private Double taxtValue;

   public Product createProduct(Product product){
        product.setPrice(250.0);
        return product;
    }
}
