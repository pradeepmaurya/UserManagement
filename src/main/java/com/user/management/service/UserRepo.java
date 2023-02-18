package com.user.management.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.management.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
