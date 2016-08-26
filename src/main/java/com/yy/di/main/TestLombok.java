package com.yy.di.main;

import java.util.Arrays;
import java.util.List;

import com.yy.lombok.User;

public class TestLombok {
	public static void main(String[] args) {
		User user = new User();
		user.setAge(24);
		user.setName("JosonLiu");
		List<String> schools = Arrays.asList("SCNU","SCNU2");
		user.setSchools(schools);
		System.out.println(user);
	}
}
