package edu.icet.ecom.service;

import edu.icet.ecom.model.Product;
import java.util.ArrayList;

public class ProductService {
   public ArrayList<Product> getProduct(){
        Product appleProduct = new Product();
        appleProduct.setName("apple");
        appleProduct.setDescription(" my favorite");
        appleProduct.setPrice(100.0);

        Product orangeProduct = new Product();
        orangeProduct.setName("orange");
        orangeProduct.setDescription("its better than apple");
        orangeProduct.setPrice(250.0);

        ArrayList<Product> productList = new ArrayList();
        productList.add(appleProduct);
        productList.add(orangeProduct);

        return productList;
    }
}
