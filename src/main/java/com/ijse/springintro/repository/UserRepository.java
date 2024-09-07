package com.ijse.springintro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.springintro.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //to find user by username
    Optional<User> findByUsername(String username);
}
