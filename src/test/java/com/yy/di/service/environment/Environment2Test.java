package com.yy.di.service.environment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yy.di.environment.GetValueFormPropertyDemo2;

/***
 ** @Author JosonLiu
 ** @Date 2016年8月16日
 ** @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class Environment2Test {
	@Autowired
	GetValueFormPropertyDemo2 demo;
	@Test
	public void test1(){
		demo.print();
	}
}

