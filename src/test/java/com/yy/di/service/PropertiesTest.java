package com.yy.di.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class PropertiesTest {
	@Value("name")
	private String name ;
	@Value("age")
	private String age;
	@Test
	public void test(){
		System.out.println("Name: " + name+" Age: "+age);
	}
}
