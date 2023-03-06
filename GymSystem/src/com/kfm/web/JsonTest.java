package com.kfm.web;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.kfm.model.Dept;
import com.kfm.model.Emp;

public class JsonTest extends JsonServlet {

	@Override
	public String dealInput(Map<String, String[]> input) {
		Dept dept=new Dept(101, "工程软件开发事业部", "上海浦东新区张江软件园");
		Emp emp=new Emp(1011, "john", 0, dept);
		List<Emp> emps=new LinkedList<>();
		emps.add(emp);
		emp=new Emp(1012, "jackson", 0, dept);
		emps.add(emp);
		return JSON.toJSONString(emps);
	}

}
