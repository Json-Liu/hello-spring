package com.yy.di.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/***
 ** @Author JosonLiu
 ** @Date 2016年8月16日
 ** @Version 1.0
 **/
@Component
@Configuration
@PropertySource("classpath:environment.properties")
public class GetValueFormPropertyDemo {
	@Autowired
	private Environment env ; 
	public void print(){
		String school = env.getProperty("school","NOT SCHOOL");
		String address = env.getProperty("address", "NOT ADDRESS");
		Integer year = env.getProperty("year", Integer.class);
		System.out.println(school+","+address+" , year:"+year);
	}
}

