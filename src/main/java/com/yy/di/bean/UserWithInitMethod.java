package com.yy.di.bean;
/*** XML 文件 进行 Bean 初始化 同时进行属性初始化 与初始化后的方法调用  
 ** @Author JosonLiu
 ** @Date 2016年9月11日
 ** @Version 1.0
 **/
public class UserWithInitMethod {
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
		return "UserWithInitMethod [uid=" + uid + ", userName=" + userName
				+ "]";
	}
	/**
	 * 输出当前对象
	 */
	public void print(){
		System.out.println(this);
	}
}

