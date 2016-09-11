package com.yy.di.javaconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*** 测试 JAVA 类文件进行 class 的注解
 ** @Author JosonLiu
 ** @Date 2016年9月11日
 ** @Version 1.0
 **/
@ContextConfiguration("classpath:spring/appContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserConfigTest {
	@Autowired
	private UserConfig userConfig ;
	@Test
	public void test_GetUserConfig(){
		userConfig.setUid(50075121);
		userConfig.setUserName("JosonLiu");
		System.out.println(userConfig);
	}
}

