package com.example.cicddemo.service;

import com.example.cicddemo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Mobile",35000.0));
        products.add(new Product(2,"Laptop",65000.0));
        products.add(new Product(3,"Tablet",45000.0));
        return products;
    }
}
