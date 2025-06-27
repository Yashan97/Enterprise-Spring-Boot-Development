package edu.icet.ecom.service;

import edu.icet.ecom.module.Product;

import java.util.ArrayList;

public class ProductService {

    public ArrayList<Product> getProductList(){
        Product appleProduct = new Product();
        appleProduct.setName("appleeee");
        appleProduct.setDescription("good");
        appleProduct.setPrice(75.00);

        ArrayList <Product> productList = new ArrayList();
        productList.add(appleProduct);

        return  productList;

    }



}
