package com.yy.di.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月11日
 ** @Version 1.0
 **/
@ContextConfiguration("classpath:spring/appContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {
	@Autowired
	private UserService userService;
	@Test
	public void test_GetUserService(){
		userService.print();
	}
}

