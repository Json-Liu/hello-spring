package com.yy.common.service;

import com.yy.bean.User;

/***
 ** @Author JosonLiu
 ** @Date 2016年11月19日
 ** @Version 1.0
 **/
public interface TransactionService {
	/**
	 * 事务操作
	 */
	void insertWithTransaction(User user ) ;
}

