package com.yy.dao;

import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yy.bean.User;


/***
 ** @Author JosonLiu
 ** @Date 2016年11月19日
 ** @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class UserMapperTest {
	@Autowired
	private UserMapper userMapper;
	@Test
	public void test_Insert(){
		User record = new User();
		record.setUserId(genUid());
		record.setUserName("JosonLiu");
		record.setUserSchool("华南师范");
		record.setUserAge(25);
		int insertUser = userMapper.insert(record);
		assertTrue(insertUser == 1);
	}
	private String genUid() {
		return UUID.randomUUID().toString();
	}
}

