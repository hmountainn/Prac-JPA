package com.jpa.web.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.web.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	List<User> findByName(String name);
	List<User> findByNameLike(String name);
	List<User> findByNameOrAddress(String name, String address);
}
