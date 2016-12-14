package com.yy.common.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/***
 ** @Author JosonLiu
 ** @Date 2016年12月14日
 ** @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class CycleServiceTest {
	@Autowired
	private CycleService1 cycleService1;
	@Autowired
	private CycleService2 cycleService2;
	@Test
	public void test_cycleDependency(){
		//cycleService2.print();
	}
	
}

