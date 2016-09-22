package com.yy.aop.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*** AroundDemo 的切面
 ** @Author JosonLiu
 ** @Date 2016年9月22日
 ** @Version 1.0
 **/
@Aspect
@Component
public class AroundDemoAop {
	@Pointcut("execution(** com.yy.aop.around.AroundDemo.doWork(..))")
	public void doWork(){};
	@Around("doWork()")
	public void watchDoWork(ProceedingJoinPoint joinPoint ){
		try {
			//执行方法前的操作
			System.out.println(" do something before work.Exp:singing.");
			System.out.println(" ready to working ");
			//执行真正的方法
			joinPoint.proceed();
			//执行方法后的操作
			System.out.println(" work has done. just to have a rest.");
		} catch (Throwable e) {
			System.out.println(" do work error.need to try again."); 
		}
	}
}

