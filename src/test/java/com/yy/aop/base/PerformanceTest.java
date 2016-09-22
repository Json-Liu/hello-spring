package com.yy.aop.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yy.aop.base.Audience;
import com.yy.aop.base.Performance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class PerformanceTest {
	@Autowired
	private Performance performance;
	@Autowired
	private Audience audience;
	@Test
	public void test_Aop(){
		performance.perform();
		audience.performance();
		audience.print();
	}
	@Test
	public void test_Aop_Args(){
		performance.sayHello("Just for test.");
	}
}
