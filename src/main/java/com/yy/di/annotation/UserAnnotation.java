package com.yy.di.annotation;

import org.springframework.stereotype.Component;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月12日
 ** @Version 1.0
 **/
@Component
public class UserAnnotation {
	private String name ;
	private Integer age ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "UserAnnotation [name=" + name + ", age=" + age + "]";
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}

