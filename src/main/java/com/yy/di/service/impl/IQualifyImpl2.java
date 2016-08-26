package com.yy.di.service.impl;

import org.springframework.stereotype.Component;

import com.yy.di.service.IQualify;
@Component
public class IQualifyImpl2 implements IQualify {
	@Override
	public void sayHello(){
		System.out.println("This is the second implement..");
	}
}
