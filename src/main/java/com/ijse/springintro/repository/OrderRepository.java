package com.ijse.springintro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.springintro.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
