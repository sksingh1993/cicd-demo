package com.example.cicddemo.service;

import com.example.cicddemo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private static List<Product> products = Arrays.asList(
            new Product(1,"Mobile",35000.0),
            new Product(2,"Laptop",65000.0),
            new Product(3,"Tablet",45000.0)

    );
    public List<Product> getAllProducts(){

        return products;
    }
    public Product getProducts(Integer id){
        return products.stream().filter(p->p.getProductId().equals(id)).findFirst().get();
    }
}
