package com.yy.di.annotation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月12日
 ** @Version 1.0
 **/
@ContextConfiguration("classpath:spring/appContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserAnnotationTest {
	@Autowired
	private UserAnnotation userAnnotation;
	@Test
	public void test(){
		Assert.assertTrue(userAnnotation != null );
		userAnnotation.setName(" This is UserAnnotation demo ");
		userAnnotation.setAge(1);
		System.out.println(userAnnotation);
	}
}

