package com.yy.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yy.aop.service.UserWithPropertyService1;
import com.yy.aop.service.UserWithPropertyService2;
import com.yy.bean.User;

/***
 ** @Author JosonLiu
 ** @Date 2017年2月21日
 ** @Version 1.0
 **/
@ContextConfiguration("classpath:spring/appContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserWithPropertyServiceTest {
	@Autowired
	private UserWithPropertyService1 userWithPropertyService1;
	@Autowired
	private UserWithPropertyService2 userWithPropertyService2;
	@Test
	public void test(){
		User user = userWithPropertyService1.getUser();
		User user2 = userWithPropertyService2.getUser();
		System.out.println(user);
		System.out.println(user2);
		System.out.println(user.equals(user2));
	}
}

