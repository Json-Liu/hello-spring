package com.yy.di.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yy.di.config.SayHelloConfig;
import com.yy.di.dao.InitMethodDemo;
import com.yy.di.service.SayHello;
public class Main {
	private static Logger log = LoggerFactory.getLogger("stdout");
	private static Logger fileLogger = LoggerFactory.getLogger("file");
	public static void main(String[] args) {// for normal JAVA get Bean.
		log.debug("test");
		// first method.
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/appContext.xml");
		InitMethodDemo bean = (InitMethodDemo)applicationContext.getBean("initMethodDemo");
		bean.print();
		// second method.
		SayHelloConfig config = new SayHelloConfig();
		SayHello sayHello = config.randomSay();
		sayHello.say();
		fileLogger.debug("fileLog test..");
		log.debug("compelete");
	}
}
