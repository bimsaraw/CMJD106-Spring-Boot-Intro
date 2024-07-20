package com.ijse.springintro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.springintro.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
