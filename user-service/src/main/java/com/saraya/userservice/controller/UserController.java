package com.saraya.userservice.controller;

import com.saraya.userservice.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserController extends JpaRepository <User, Long> {
 
    
}
