package com.yy.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/***对自定义的日志注解做相关处理
 ** @Author JosonLiu
 ** @Date 2016年9月26日
 ** @Version 1.0
 **/
@Aspect
@Component
public class LogAnnotationAop {
	public static final Logger LOG = LoggerFactory.getLogger(LogAnnotationAop.class);
	@Pointcut("@annotation(com.yy.di.custom.CustomAnnotationForLog)")
	public void log(){}
	@Around("log()")
	public void recodeLog(ProceedingJoinPoint joinpoint){
		LOG.debug("start loging....methodName:{},args:{}",joinpoint.getStaticPart().getSignature().getName(),joinpoint.getArgs());
		try {
			joinpoint.proceed();//执行线程
		} catch (Throwable e) {
			LOG.error(" systen error...",e);
		}
	}
}

