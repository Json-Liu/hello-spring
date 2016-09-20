package com.yy.di.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/***
 ** @Author JosonLiu
 ** @Date 2016年9月20日
 ** @Version 1.0
 **/
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/appContext.xml");
		InjectValueDemo bean = context.getBean(InjectValueDemo.class);
		bean.printName();
		bean.printAge();
	}
}

