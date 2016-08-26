package com.yy.di.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class IPropertyDiTest {
	@Autowired
	private IPropertyDi testDi;
	@Test
	public void test_play(){
		assertNotNull(testDi);
		testDi.play();
	}
}
