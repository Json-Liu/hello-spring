package com.yy.di.service.impl;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import com.yy.di.service.UserWithInitMethodService;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月11日
 ** @Version 1.0
 **/
@Service
public class UserWithInitMethodServiceImpl implements UserWithInitMethodService ,InitializingBean{
	@Override
	public void print() {
		System.out.println("[UserWithInitMethodService] printing ...");
	}
	/**
	 * 在对象初始化完成后调用的执行函数 
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("[UserWithInitMethodService] has been inited.");
		
	}

}

