package com.yy.di.service.impl;

import org.springframework.stereotype.Component;

import com.yy.di.service.SayHello;
@Component
public class AmericaSay implements SayHello {

	@Override
	public void say() {
		System.out.println(" Hello ..");
	}

}
