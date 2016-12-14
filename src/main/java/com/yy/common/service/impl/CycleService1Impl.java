package com.yy.common.service.impl;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yy.common.service.CycleService1;
import com.yy.common.service.CycleService2;
import com.yy.common.service.PrintService;

/***
 ** @Author JosonLiu
 ** @Date 2016年12月14日
 ** @Version 1.0
 **/
@Service
public class CycleService1Impl implements CycleService1 ,InitializingBean {

	@Autowired
	private PrintService printService;

	@Autowired
	private CycleService2 cycleService2;
	
	@Override
	public void print() {
		System.out.println("This is CycleService1");
		System.out.println("printService: " + printService);
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("----------------------------------CycleService1Impl has property ready.");
		System.out.println("afterPropertiesSet printService: " + printService);
	}

}

