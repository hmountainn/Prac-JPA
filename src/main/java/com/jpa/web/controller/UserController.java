package com.jpa.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.web.dao.UserRepository;
import com.jpa.web.entity.User;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	//Create
	@PutMapping("/user")
	public User putUser(User user) {
		return repository.save(user);
	}
	
	//Read
	@GetMapping("/user")
	public User getUser(int id) {
		return repository.findById(id).orElse(null); //해당되는값 없으면 null반환
	}
	
	@GetMapping("/user/all")
	public List<User> getUserList(){
		return (List<User>) repository.findAll();
	}
	
	//Read 커스텀
	@GetMapping("/user/name")
	public List<User> getUserByName(String name){
		return repository.findByName(name);
	}
	
	@GetMapping("/user/search")
	public List<User> SearchUser(String name){
		return repository.findByNameLike("%"+name+"%");
	}
	
	//Update
	@PostMapping("/user")
	public User postUser(User user) {
		return repository.save(user);
	}
	
	//Delete
	@DeleteMapping("/user")
	public void DeleteUser(int id) {
		repository.deleteById(id);
	}
}
