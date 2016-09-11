package com.yy.di.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*** 进行POJO类的注解
 ** @Author JosonLiu
 ** @Date 2016年9月11日
 ** @Version 1.0
 **/
@Configuration
public class BeanConfig {
	@Bean
	public UserConfig userConfig(){
		return new UserConfig();
	}
}

