package com.ijse.springintro.service;

import org.springframework.stereotype.Service;

import com.ijse.springintro.entity.User;

@Service
public interface UserService {
    User createUser(User user);
}
