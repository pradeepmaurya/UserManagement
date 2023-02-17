package com.user.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.management.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	//Get User Data
	public List<User> getAllUser(){
		return repo.findAll();
	}
	
	//Get user by Id
	public User getUserById(int id) {
		Optional<User> findById = repo.findById(id);
		User user = findById.get();
		return user;
	}
	
	//Add User Data
	public User addUserData(User data) {
		return repo.save(data);
	}
	
	//Update User by id
	public User updateUserById(User data) {
		User user = repo.findById(data.getUserId()).get();
		user.setUserName(data.getUserName());
		user.setDateOfBirth(data.getDateOfBirth());
		user.setEmail(data.getEmail());
		user.setPhoneNumber(data.getPhoneNumber());
		user.setDate(data.getDate());
		user.setTime(data.getTime());
		repo.save(user);
		return user;
	}
	
	//Delete User by Id
	public User deleteUserById(int id) {
		User user = repo.findById(id).get();
		repo.delete(user);
		return user;
	}
}
