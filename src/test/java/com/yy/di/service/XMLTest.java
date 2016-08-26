package com.yy.di.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yy.di.dao.InitMethodDemo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class XMLTest {
	@Autowired
	private InitMethodDemo initMethodDemo;
	@Test
	public void test_Init_Method(){
		assertNotNull(initMethodDemo);
		initMethodDemo.print();
		//System.out.println("xxx.method compelete.");
	}
}
