package com.jpa.web.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.web.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
