package com.yy.aop.transfer;

import org.springframework.stereotype.Component;

/***定义一个用来放歌的类
 ** @Author JosonLiu
 ** @Date 2016年9月22日
 ** @Version 1.0
 **/
@Component
public class TransferDemo {
	public void playSong(String songName ){
		System.out.println( songName + " is playing .please listening ...");
	}
}

