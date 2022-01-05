package com.saraya.userservice.DTO;

import com.saraya.userservice.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDTO extends JpaRepository<User, Long> {
    User findByName(String userName);
}
