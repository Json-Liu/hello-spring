package com.yy.aop.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月26日
 ** @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class CustomAnnotationWithArgsAopTest {
	@Autowired
	private CustomAnnotationWithArgsDemo customAnnotationWithArgsDemo;
	@Test 
	public void test(){
		customAnnotationWithArgsDemo.print();
	}
}

