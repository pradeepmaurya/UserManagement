package com.user.management.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.management.model.User;
import com.user.management.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	//Get User Data
	@GetMapping("/user")
	public List<User> getAllUser(){
		return service.getAllUser();
	}
	
	//Get User By Id
	@GetMapping("/user/{id}")
	public User findUserById(@PathVariable("id") int id) {
		return service.getUserById(id);
	}
	
	//Add User Data
	@PostMapping("/user")
	public User addUserData(@Valid @RequestBody User data) {
		return service.addUserData(data);
	}
	
	//Updating User details
	@PutMapping("/user")
	public User updateUser(@Valid @RequestBody User data) {
		return service.updateUserById(data);
	}
	
	//Delete User data
	@DeleteMapping("/user/{id}")
	public User deleteUserById(@Valid @PathVariable("id") int id) {
		return service.deleteUserById(id);
	}
}
