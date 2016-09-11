package com.yy.di.service.impl;

import org.springframework.stereotype.Service;

import com.yy.di.service.UserService;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月11日
 ** @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
	@Override
	public void print() {
		System.out.println(" Service annotation success...");

	}

}

