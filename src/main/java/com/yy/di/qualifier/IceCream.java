package com.yy.di.qualifier;

import org.springframework.stereotype.Service;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月20日
 ** @Version 1.0
 **/
@Service
public class IceCream implements Dessert {

	@Override
	public void print() {
		System.out.println("this is a iceCream.");

	}

}

