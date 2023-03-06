package com.kfm.web;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.kfm.dao.UsersDao;
import com.kfm.model.Users;

public class UsersAction extends JsonServlet {
	private UsersDao usersDao = new UsersDao();
	@Override
	public String dealInput(Map<String, String[]> input) {
		List<List<Users>> lists = new LinkedList<>();
		lists.add(usersDao.get());
		return JSON.toJSONString(usersDao.get());
	}
	
}
