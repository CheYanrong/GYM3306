package com.kfm.web;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.kfm.dao.DeptDao;

public class DeptAction extends JsonServlet {
	private DeptDao deptDao=new DeptDao();
	@Override
	public String dealInput(Map<String, String[]> input) {
		System.out.println(input);
		int id=Integer.parseInt(input.get("id")[0]);
		return JSON.toJSONString(deptDao.get(id));
	}

}
