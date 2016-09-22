package com.yy.aop.transfer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月22日
 ** @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class TransferDemoTest {
	@Autowired
	private TransferDemo transferDemo;
	@Autowired
	private TransferDemoAop transferDemoAop;
	@Test
	public void test_aopTransArgs(){
		final String song1 = "情有独终";
		final String song2 = "不要对他说";
		final String song3 = "not play";
		transferDemo.playSong(song1);
		transferDemo.playSong(song2);
		transferDemo.playSong(song2);
		Assert.assertTrue(transferDemoAop.getPlayCount(song1) == 1 );
		Assert.assertTrue(transferDemoAop.getPlayCount(song2) == 2 );
		Assert.assertTrue(transferDemoAop.getPlayCount(song3) == 0 );
	}
}

