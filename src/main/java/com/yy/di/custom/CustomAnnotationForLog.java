package com.yy.di.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*** 自定义 注解 用来做日志处理 
 ** @Author JosonLiu
 ** @Date 2016年9月24日
 ** @Version 1.0
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomAnnotationForLog {
}

