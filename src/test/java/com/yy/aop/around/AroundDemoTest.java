package com.yy.aop.around;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yy.aop.around.AroundDemo;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月22日
 ** @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class AroundDemoTest {
	@Autowired
	private AroundDemo aroundDemo;
	@Test
	public void test_doWork_withoutArgs(){
		aroundDemo.doWork();
	}
	@Test
	public void test_doWork_withArgs(){
		aroundDemo.doWork(" Hello,Joson Liu.");
	}
	@Test
	public void test_doWork_withArgsAndReturn(){
		aroundDemo.doWork(" Hello nice to see you. ", "Joson Liu");
	}
}

