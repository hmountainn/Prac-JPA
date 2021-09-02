package com.jpa.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa.web.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	List<User> findByName(String name);
	List<User> findByNameLike(String name);
	List<User> findByNameOrAddress(String name, String address);
	
	
	//쿼리 직접사용
	
	//JPQL사용
	@Query("from User where name = ?1 and address = ?2")
	List<User> findVipList(String value1, String value2);
	
	//nativeQuery
	@Query(value="select * from User where name = ?1 and address = ?2", nativeQuery = true)
	List<User> findVipList2(String value1, String value2);
}
