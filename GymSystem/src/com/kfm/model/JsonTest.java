package com.kfm.model;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class JsonTest {
//	下面是几个常用的 JSON 解析类库：
//
//	Gson: 谷歌开发的 JSON 库，功能十分全面。
//	FastJson: 阿里巴巴开发的 JSON 库，性能十分优秀。
//	Jackson: 社区十分活跃且更新速度很快。
	
	@Test
	public void test1() {
		Dept dept=new Dept(101, "工程软件开发事业部", "上海浦东新区张江软件园");
//		{
//			"deptno":101,
//			"dname":"工程软件开发事业部",
//			"loc":"上海浦东新区张江软件园"
//		}
		System.out.println(dept);
	}
	
	@Test
	public void test2() {
		Dept dept=new Dept(101, "工程软件开发事业部", "上海浦东新区张江软件园");
		System.out.println(JSON.toJSONString(dept));
	}
	
	@Test
	public void test3() {
		Dept dept=new Dept(101, "工程软件开发事业部", "上海浦东新区张江软件园");
		Emp emp=new Emp(1011, "john", 0, dept);
		System.out.println(JSON.toJSONString(emp));
	}
	
	@Test
	public void test4() {
		Dept dept=new Dept(101, "工程软件开发事业部", "上海浦东新区张江软件园");
		Emp emp=new Emp(1011, "john", 0, dept);
		List<Emp> emps=new LinkedList<>();
		emps.add(emp);
		emp=new Emp(1012, "jackson", 0, dept);
		emps.add(emp);
		System.out.println(JSON.toJSONString(emps));
	}

}
