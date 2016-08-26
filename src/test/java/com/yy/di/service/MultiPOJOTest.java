package com.yy.di.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yy.di.bean.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class MultiPOJOTest {
	@Autowired
	private User user;
	@Test
	public void test_User(){
		System.out.println(user);
		Thread task = new Thread(new Task(user));
		Thread task2 = new Thread(new Task2(user));
		task.start();
		task2.start();
	}
	@Test
	public void test(){
		System.out.println(user);
	}
	class Task implements Runnable{
		private final User user;
		public Task(User user){
			this.user = user;
		}
		@Override
		public void run() {
			try {
				System.out.println("Task:"+user);
				user.setName("testName_Task");
				Thread.sleep(6000);
				System.out.println("Task DONE:"+user);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	class Task2 implements Runnable{
		private final User user;
		public Task2(User user){
			this.user = user;
		}
		@Override
		public void run() {
			try {
				System.out.println("Task2:"+user);
				Thread.sleep(1000);
				user.setName("testName_Task2");
				Thread.sleep(2000);
				System.out.println("Task2 DONE:"+user);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
