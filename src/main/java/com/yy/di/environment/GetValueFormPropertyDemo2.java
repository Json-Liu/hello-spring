package com.yy.di.environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/***
 ** @Author JosonLiu
 ** @Date 2016年8月16日
 ** @Version 1.0
 **/
@Component
/*@Configuration
@PropertySource("classpath:environment2.properties")*/
public class GetValueFormPropertyDemo2 {
	@Value("${s}")
	private String school;
	@Value("${a}")
	private String address;
	@Value("${y}")
	private String year;
	public void print(){
		System.out.println(school+","+address+" , year:"+year);
	}
}

