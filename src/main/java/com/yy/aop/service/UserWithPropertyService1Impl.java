package com.yy.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yy.bean.User;

/***
 ** @Author JosonLiu
 ** @Date 2017年2月21日
 ** @Version 1.0
 **/
@Service
public class UserWithPropertyService1Impl implements UserWithPropertyService1 {
	@Autowired
	private User user ;
	@Override
	public User getUser() {
		user.setUserName("This is an user from UserWithPropertyService1");
		return user;
	}

}

