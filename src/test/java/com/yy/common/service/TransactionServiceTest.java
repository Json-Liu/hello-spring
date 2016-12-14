package com.yy.common.service;

import java.util.UUID;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yy.bean.User;
import com.yy.dao.UserMapper;

/***
 ** @Author JosonLiu
 ** @Date 2016年11月19日
 ** @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class TransactionServiceTest {
	@Autowired
	private TransactionService transactionService;
	@Autowired
	private UserMapper userMapper;
	@Test
	public void test_InsertWithTransaction(){
		User record = new User();
		final int id = 999;
		userMapper.deleteByPrimaryKey(id);
		record.setId(id);
		record.setUserId(UUID.randomUUID().toString());
		record.setUserName("JosonLiu");
		record.setUserSchool("华南师范");
		record.setUserAge(25);
		try {
			transactionService.insertWithTransaction(record);
		} catch (Exception e) {
			System.out.println("insertWithTransaction fail.");
		}
		User dbResult = userMapper.selectByPrimaryKey(id);
		assertTrue(dbResult == null );
	}
}

