package com.yy.lombok;
import java.util.List;

import lombok.Data;
@Data
public class User {
	private String name;
	private Integer age;
	private List<String> schools;
}
