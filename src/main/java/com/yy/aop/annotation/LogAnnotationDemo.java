package com.yy.aop.annotation;

import org.springframework.stereotype.Component;

import com.yy.di.custom.CustomAnnotationForLog;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月26日
 ** @Version 1.0
 **/
@Component
public class LogAnnotationDemo {
	@CustomAnnotationForLog
	public void print(){
		System.out.println(" printing something...");
	}
	@CustomAnnotationForLog
	public void sayHello(String name ){
		System.out.println(" Hello, "+name);
	}
}

