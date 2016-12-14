package com.yy.common.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yy.bean.User;
import com.yy.common.service.TransactionService;
import com.yy.dao.UserMapper;

/***
 ** @Author JosonLiu
 ** @Date 2016年11月19日
 ** @Version 1.0
 **/
@Service
@EnableRetry
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	private UserMapper userMapper;
	@Override
	@Transactional
	@Retryable(maxAttempts = 3,backoff=@Backoff( delay = 100,maxDelay=500))
	public void insertWithTransaction(User user) {
		System.out.println("trying...");
		insert(user);
		throw new RuntimeException("test transaction.");//方法中抛出异常 插入操作被回滚
	}
	private void insert(User user){
		int insertUser = userMapper.insert(user);
		System.out.println("insertUser: " + insertUser);
	}
}

