package com.yy.di.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	private Logger log = LoggerFactory.getLogger("STDOUT");
	@Autowired
	private  CompactDisc cd;
	@Test
	public void test_Not_Null(){
		log.debug("test log");
		assertNotNull(cd);
		cd.play();
	}
}
