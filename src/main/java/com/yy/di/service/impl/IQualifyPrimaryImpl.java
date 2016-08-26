package com.yy.di.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.yy.di.service.IQualify;
@Component
@Primary
public class IQualifyPrimaryImpl implements IQualify {
	@Override
	public void sayHello() {
		System.out.println("Hello this is thr primary implement..");
	}

}
