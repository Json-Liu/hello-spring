package com.yy.di.bean;
/*** 通过 XML 文件的  bean 进行类的注解 
 ** @Author JosonLiu
 ** @Date 2016年9月11日
 ** @Version 1.0
 **/
public class UserDemo {
	private Integer uid ;
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
		return "User [uid=" + uid + ", userName=" + userName + "]";
	}
	private String userName;
}

