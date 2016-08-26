package com.yy.aop.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class PerformanceTest {
	@Autowired
	private Performance performance;
	@Test
	public void test_Aop(){
		performance.perform();
	}
	@Test
	public void test_Aop_Args(){
		performance.sayHello("Just for test.");
	}
}
