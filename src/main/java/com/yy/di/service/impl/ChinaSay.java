package com.yy.di.service.impl;

import org.springframework.stereotype.Component;

import com.yy.di.service.SayHello;
@Component
public class ChinaSay implements SayHello{
	@Override
	public void say() {
		System.out.println("您好");
	}

}
