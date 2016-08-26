package com.yy.di.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yy.di.config.SayHelloConfig;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SayHelloConfig.class)
public class CDPlayerJavaTest {
	@Autowired
	private CompactDisc cd;
	@Autowired
	private SayHello sayHello;
	@Test
	public void test_Not_Null(){
		assertNotNull(cd);
		cd.play();
	}
	@Test
	public void test_SayHello(){
		assertNotNull(sayHello);
		sayHello.say();
	}
}
