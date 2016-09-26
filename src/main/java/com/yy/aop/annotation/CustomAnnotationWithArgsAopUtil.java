package com.yy.aop.annotation;

import java.util.Random;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.yy.di.custom.CustomAnnotationWithArgs;
import com.yy.di.custom.NumberType;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月26日
 ** @Version 1.0
 **/
@Aspect
@Component
public class CustomAnnotationWithArgsAopUtil {
	private static final Logger log = LoggerFactory.getLogger(CustomAnnotationWithArgsAopUtil.class);
	@Before(value="com.yy.aop.annotation.CustomAnnotationWithArgsAop.anno() && @annotation(customAnnotationWithArgs)",argNames="customAnnotationWithArgs") 
	public void checkAction(CustomAnnotationWithArgs customAnnotationWithArgs){
		NumberType args = customAnnotationWithArgs.numberType();
		int random = new Random().nextInt(2);
		if(args == NumberType.EVEN && random == 1 ){
			log.error(" you are not pass this time.try a latter.. random:{}",random);
			throw new RuntimeException(" you need a even number,but the random number is not.");
		}
		if(args == NumberType.ODD && random == 0 ){
			log.error(" you are not pass this time.try a latter.. random:{}",random);
			throw new RuntimeException(" you need a odd number ,but the random number is not.");
		}
		log.debug(" you are lucky~ args:{} random:{}",args,random);
	}
}

