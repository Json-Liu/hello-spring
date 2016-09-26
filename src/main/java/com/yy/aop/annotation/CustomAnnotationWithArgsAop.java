package com.yy.aop.annotation;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
/***
 ** @Author JosonLiu
 ** @Date 2016年9月26日
 ** @Version 1.0
 **/
@Aspect
@Component
public class CustomAnnotationWithArgsAop {
	private static final Logger log = LoggerFactory.getLogger(CustomAnnotationWithArgsAop.class);
	@Pointcut("@annotation(com.yy.di.custom.CustomAnnotationWithArgs)")
	public void anno(){}
	@Before("anno()")
	public void beforeAction(){
		log.debug(" before action..");
	}
}

