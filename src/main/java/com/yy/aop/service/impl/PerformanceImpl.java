package com.yy.aop.service.impl;

import org.springframework.stereotype.Component;

import com.yy.aop.service.Performance;
@Component
public class PerformanceImpl implements Performance {

	@Override
	public void perform() {
		System.out.println("Hello,This is going to performan.");

	}

	@Override
	public void sayHello(String msg) {
		System.out.println(msg);
	}

}
