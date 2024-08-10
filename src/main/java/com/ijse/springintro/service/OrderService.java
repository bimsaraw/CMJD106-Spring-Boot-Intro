package com.ijse.springintro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.springintro.entity.Order;

@Service
public interface OrderService {
    List<Order> getAllOrders();
    Order createOrder(Order order);
}
