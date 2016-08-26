package com.yy.aop.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience2 {//sayHello(String msg)
	@Pointcut("execution(** com.yy.aop.service.Performance.perform(..))")
	public void performance(){}
	@Pointcut("execution(** com.yy.aop.service.Performance.sayHello(String)) && args(msg)")
	public void sayHelloMsg(String msg){}
	@Pointcut("execution(** com.yy.aop.service.Performance.sayHello(..)) ")
	public void sayHello(){}
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp){
		try {
			System.out.println("Silencing cell phones.");
			System.out.println("Taking seats.");
			jp.proceed();
			System.out.println("Clap Clap Clap.");
		} catch (Throwable e) {
			System.out.println("Demanding refund..");
		}
	}
	@Before("sayHelloMsg(msg)")
	public void watchSayHello(String msg){
		System.out.println("Msg:"+msg);
	}
/*	@Around("sayHello()")
	public void aroundSayHello(ProceedingJoinPoint jp){
		try {
			System.out.println("around..");
			jp.proceed();
			System.out.println("kind:"+jp.getKind()+"args:"+jp.getArgs()+"class:"+jp.getClass()+"signature:"+jp.getSignature()+"sourceLocation"+jp.getSourceLocation());
			System.out.println("staticPart:"+jp.getStaticPart()+"target:"+jp.getTarget()+"this:"+jp.getThis());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}*/
}
