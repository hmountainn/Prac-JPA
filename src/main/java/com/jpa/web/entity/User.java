package com.jpa.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	int id;
	String name;
	String phone;
	@Column(length=1024)
	String address;
	
}

