package com.yy.di.bean;

import java.util.List;

/*** 通过 XML 文件的  bean 进行类的注解 包含属性初始化  
 ** @Author JosonLiu
 ** @Date 2016年9月11日
 ** @Version 1.0
 **/
public class UserWithProperty {
	@Override
	public String toString() {
		return "UserWithProperty [uid=" + uid + ", userName=" + userName
				+ ", schoolList=" + schoolList + "]";
	}
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
	private String userName;
	private List<String> schoolList ;//学校列表
	public List<String> getSchoolList() {
		return schoolList;
	}
	public void setSchoolList(List<String> schoolList) {
		this.schoolList = schoolList;
	} 
}

