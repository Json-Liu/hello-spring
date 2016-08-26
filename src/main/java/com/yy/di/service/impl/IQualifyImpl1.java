package com.yy.di.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.yy.di.service.IQualify;
@Component
@Qualifier("first")
public class IQualifyImpl1 implements IQualify {
	@Override
	public void sayHello() {
		System.out.println("Hello this first implement..");
	}

}
