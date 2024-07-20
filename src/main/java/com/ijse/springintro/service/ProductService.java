package com.ijse.springintro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.springintro.entity.Product;

@Service
public interface ProductService {
    List<Product> getAllProducts();
    Product createProduct(Product product);
}
