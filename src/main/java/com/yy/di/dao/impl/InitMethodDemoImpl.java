package com.yy.di.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.yy.di.bean.User;
import com.yy.di.dao.InitMethodDemo;

public class InitMethodDemoImpl implements InitMethodDemo {
	private User user;
	@Autowired
	public void setUser(User user){
		this.user = user;
	}
	@Override
	public void print() {
		System.out.println(Thread.currentThread().getName()+" : "+user);
		user.setName(Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" : "+user);
	}

}
