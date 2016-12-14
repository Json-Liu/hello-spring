package com.yy.common.service.impl;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yy.common.service.CycleService1;
import com.yy.common.service.CycleService2;

/***
 ** @Author JosonLiu
 ** @Date 2016年12月14日
 ** @Version 1.0
 **/
@Service
public class CycleService2Impl implements CycleService2,InitializingBean {
	@Autowired
	private CycleService1 cycleService1;
	@Override
	public void print() {
		System.out.println("This is CycleService2.");
		System.out.println("CycleService2 going to invoke CycleService1 print.");
		cycleService1.print();
	}
/*	@PostConstruct
	public void init(){}*/
	@Override
	public void afterPropertiesSet() throws Exception {
		print() ;
		System.out.println("----------------------------------CycleService2Impl has property ready.");
	}
}

