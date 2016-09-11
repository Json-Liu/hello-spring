package com.yy.di.bean;

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
public class UserTest {
	@Autowired
	private User user;
	/**
	 * 测试 通过 XML 进行 Bean 注解   
	 */
	@Test
	public void test_GetUser(){
		user.setUid(50075120);
		user.setUserName("JosonLiu");
		System.out.println(user);
	}
}

