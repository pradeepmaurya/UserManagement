package com.user.management.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.management.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
