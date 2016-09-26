package com.yy.aop.annotation;

import org.springframework.stereotype.Component;

import com.yy.di.custom.CustomAnnotationWithArgs;
import com.yy.di.custom.NumberType;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月26日
 ** @Version 1.0
 **/
@Component
public class CustomAnnotationWithArgsDemo {
	@CustomAnnotationWithArgs(numberType = NumberType.EVEN)
	public void print(){
		System.out.println(" work is doing...");
	}
}

