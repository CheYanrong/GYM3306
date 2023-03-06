package com.kfm.web;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.kfm.dao.DeptDao;
import com.kfm.model.ServiceItem;

public class AddrAction extends JsonServlet {
//	private DeptDao deptDao=new DeptDao();
	@Override
	public String dealInput(Map<String, String[]> input) {
		
		return JSON.toJSONString(null);
	}

}
