package com.yy.di.config;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;

import com.yy.di.service.CompactDisc;
import com.yy.di.service.SayHello;
import com.yy.di.service.impl.AmericaSay;
import com.yy.di.service.impl.ChinaSay;
import com.yy.di.service.impl.SgtPeppers;

@ContextConfiguration
public class SayHelloConfig {
	@Bean
	public SayHello randomSay(){
		int choice = new Random().nextInt();
		if(choice % 2 == 0){
			return new AmericaSay();
		}else{
			return new ChinaSay();
		}
	}
	@Bean
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
}
