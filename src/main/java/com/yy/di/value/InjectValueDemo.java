package com.yy.di.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月20日
 ** @Version 1.0
 **/
@Component
public class InjectValueDemo {
	@Value("${name}")
	private String name ;
	@Value("${age}")
	private Integer age;
	public void printName(){
		System.out.println("name : " + name);
	}
	public void printAge(){
		System.out.println("age : " + age);
	}
}

