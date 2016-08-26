package com.yy.aop.util;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(** com.yy.aop.service.Performance.perform(..))")
	public void performance(){}
	@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("Silencing cell phones.");
	}
	@Before("performance()")
	public void takeSeats(){
		System.out.println("Taking seats.");
	}
	@AfterReturning("performance()")
	public void applause(){
		System.out.println("Clap Clap Clap...");
	}
	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("Demanding a refund..");
	}
}
