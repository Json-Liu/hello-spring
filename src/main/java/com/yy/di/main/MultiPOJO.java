package com.yy.di.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yy.di.dao.InitMethodDemo;

public class MultiPOJO {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/appContext.xml");
		InitMethodDemo demo = (InitMethodDemo)applicationContext.getBean("initMethodDemo");
		Thread t1 = new Thread(new Task(demo),"Thread1");
		Thread t2 = new Thread(new Task(demo),"Thread2");
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}
	static class Task implements Runnable{
		private  final InitMethodDemo DEMO;
		public Task(InitMethodDemo demo){
			DEMO = demo;
		}
		@Override
		public void run(){
			DEMO.print();
		}
	}
}
