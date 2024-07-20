package com.ijse.springintro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.springintro.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
