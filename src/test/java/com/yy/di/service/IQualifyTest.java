package com.yy.di.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class IQualifyTest {
	@Autowired
	@Qualifier("first")
	private IQualify first ;
	@Autowired
	@Qualifier("IQualifyImpl2")
	private IQualify second ;
	@Autowired
	private IQualify primary ;
	@Test
	public void test(){
		primary.sayHello();
		first.sayHello();
		second.sayHello();
	}
}
