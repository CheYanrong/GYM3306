package com.kfm.web;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.kfm.dao.MenuitemsDao;
import com.kfm.model.Menuitems;

public class MenuitemsAction extends JsonServlet{
	private MenuitemsDao menuitemsDao = new MenuitemsDao();
	@Override
	public String dealInput(Map<String, String[]> input) {
		List<List<Menuitems>> lists = new LinkedList<>();
		lists.add(menuitemsDao.get());
		return JSON.toJSONString(lists);
	}
	
}
