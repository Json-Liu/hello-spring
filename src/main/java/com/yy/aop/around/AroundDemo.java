package com.yy.aop.around;

import org.springframework.stereotype.Component;

/***环绕切面 被切(代理)类
 ** @Author JosonLiu
 ** @Date 2016年9月22日
 ** @Version 1.0
 **/
@Component
public class AroundDemo {
	public void doWork(){
		System.out.println(getClass().getSimpleName() + " is do something..");
	}
	public void doWork(String msg){
		System.out.println(getClass().getSimpleName() + " received a msg : " + msg);
	}
	public String doWork(String msg,String name ){
		String result = " send a msg [ " + msg + " ] to [ " + name + " ] " ;
		System.out.println(result);
		return result;
	}
}

