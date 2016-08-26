package com.yy.di.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	@Autowired
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
