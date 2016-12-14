package com.yy.common.service.impl;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import com.yy.common.service.RetryService;
/***
 ** @Author JosonLiu
 ** @Date 2016年11月19日
 ** @Version 1.0
 **/
@Service
@EnableRetry
public class RetryServiceImpl implements RetryService {
	@Override
	@Retryable(maxAttempts=3,backoff=@Backoff(delay=100,maxDelay=500))
	public void retryTest() {
		System.out.println("this is a retry test.");
		System.out.println("is retrying...");
		throw new RuntimeException();
	}

}

