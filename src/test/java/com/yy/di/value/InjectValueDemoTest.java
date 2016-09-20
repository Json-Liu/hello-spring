package com.yy.di.value;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月20日
 ** @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class InjectValueDemoTest {
	@Autowired
	private InjectValueDemo injectValueDemo;
	@Test
	public void test(){
		injectValueDemo.printName();
		injectValueDemo.printAge();
	}

}

