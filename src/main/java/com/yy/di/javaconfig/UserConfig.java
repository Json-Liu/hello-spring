package com.yy.di.javaconfig;
/*** 通过 JAVA class 文件 进行 JAVA 实例的注解
 ** @Author JosonLiu
 ** @Date 2016年9月11日
 ** @Version 1.0
 **/
public class UserConfig {
	private Integer uid ;
	private String userName ;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "UserConfig [uid=" + uid + ", userName=" + userName + "]";
	}
}

