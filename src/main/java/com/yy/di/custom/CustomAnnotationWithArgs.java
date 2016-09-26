package com.yy.di.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*** 带参数的自定义注解
 ** @Author JosonLiu
 ** @Date 2016年9月26日
 ** @Version 1.0
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomAnnotationWithArgs {
	NumberType numberType();
}

