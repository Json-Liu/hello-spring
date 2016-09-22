package com.yy.aop.introduce;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月23日
 ** @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class IntroduceAopTest {
	@Autowired
	private OriginServer originServer;
	@Test
	public void test_IntroduceAop(){
		originServer.sayHello();
		//因为 AOP 切面的处理，这里可以强转成新引进的接口，从而调用新的方法 
		IntroduceServer introduceServer = (IntroduceServer) originServer;
		introduceServer.sayHelloToSomebody("萧十一郞");
	}
}

