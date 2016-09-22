package com.yy.aop.introduce.impl;

import org.springframework.stereotype.Service;

import com.yy.aop.introduce.IntroduceServer;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月23日
 ** @Version 1.0
 **/
@Service
public class IntroduceServerImpl implements IntroduceServer {
	@Override
	public void sayHelloToSomebody(String name) {
		System.out.println("Hello, " + name);
	}

}

