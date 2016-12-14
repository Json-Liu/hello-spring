package com.yy.common.service.impl;

import org.springframework.stereotype.Service;

import com.yy.common.service.PrintService;

/***
 ** @Author JosonLiu
 ** @Date 2016年12月14日
 ** @Version 1.0
 **/
@Service
public class PrintServiceImpl implements PrintService {

	@Override
	public void print() {
		System.out.println("[cmd=PrintService] done.");
	}

}

