package com.yy.aop.base;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/**
 * 声明切面
 * @author JsonLiu
 * <br/>"@Aspect" 注解 表明当前POJO是一个切面 但切面除了注解和没有实际操作连接点方法外依然是一个POJO，也可以像其他JAVA类那样调用它的方法
 * <br/>"@Component"注解则会自动装配当前Bean
 */
@Aspect 
@Component
public class Audience {
	/**
	 * 定义并命名切点 所以有切点用 * 开头， 第二个 * 表明任意返回值 中间是方法路径  .. 表明任意参数都可以 
	 * <br> spring 只支持方法级别的连接点 但这已经能够胜任绝大部分场景 
	 */
	@Pointcut("execution(** com.yy.aop.base.Performance.perform(..))")
	public void performance(){
		System.out.println("This is a point cut represent.");
	}
	/**
	 * 方法调用前执行
	 */
	@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("Silencing cell phones.");
	}
	/**
	 * 方法调用后执行
	 */
	@Before("performance()")
	public void takeSeats(){
		System.out.println("Taking seats.");
	}
	/**
	 * 方法执行完毕后执行
	 */
	@AfterReturning("performance()")
	public void applause(){
		System.out.println("Clap Clap Clap...");
	}
	/**
	 * 方法执行出错后执行 
	 */
	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("Demanding a refund..");
	}
	public void print(){
		System.out.println("This is a point cut class.");
	}
}
