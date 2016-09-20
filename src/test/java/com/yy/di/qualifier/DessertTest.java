package com.yy.di.qualifier;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月20日
 ** @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class DessertTest {
	@Autowired
	@Qualifier("cake")
	private Dessert cake ;
	@Autowired
	@Qualifier("cookies")
	private Dessert cookies ;
	@Autowired
	@Qualifier("iceCream")
	private Dessert iceCream ;
	@Test
	public void test(){
		Assert.assertNotNull(cake);
		Assert.assertNotNull(cookies);
		Assert.assertNotNull(iceCream);
		cake.print();
		cookies.print();
		iceCream.print();
	}
}

