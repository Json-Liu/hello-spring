package com.yy.aop.transfer;

import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.google.common.collect.Maps;

/***定义一个切面来纪录每首歌被播放的次数
 ** @Author JosonLiu
 ** @Date 2016年9月22日
 ** @Version 1.0
 **/
@Aspect
@Component
public class TransferDemoAop {
	/**
	 * 用来纪录每首歌的播放次数 
	 */
	private final Map<String, Integer> countMap = Maps.newHashMap();
	/**
	 * 指定的传递的参数类型与参数名称
	 * @param songName
	 */
	@Pointcut("execution(** com.yy.aop.transfer.TransferDemo.playSong(String)) && args(songName)")
	public void playSong(String songName){};
	/**
	 * 播放前计数
	 * @param songName
	 */
	@Before("playSong(songName)")
	public void countSong(String songName){
		countMap.put(songName, getPlayCount(songName)+1);//在原的的播放次数上加1
	}
	public Integer getPlayCount(String songName){
		return countMap.containsKey(songName)?countMap.get(songName):0;
	}
}

