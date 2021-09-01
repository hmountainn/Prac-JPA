package com.jpa.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity //entity 명시
public class User {
	
	@Id //id명시
	@GeneratedValue // id 자동 생성
	int id;
	String name;
	String phone;
	@Column(length=1024) //column 크기 설정
	String address;
	
}

