package com.yy.aop.introduce.impl;

import org.springframework.stereotype.Service;

import com.yy.aop.introduce.OriginServer;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月23日
 ** @Version 1.0
 **/
@Service
public class OriginServerImpl implements OriginServer{
	@Override
	public void sayHello() {
		System.out.println("Hello,I'm Joson Liu.");
	}

}

