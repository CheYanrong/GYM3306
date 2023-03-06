package com.kfm.web;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.kfm.dao.CoachDao;
import com.kfm.model.Coach;

public class CoachAction extends JsonServlet{
	private CoachDao coachDao = new CoachDao();

	@Override
	public String dealInput(Map<String, String[]> input) {
		List<List<Coach>> lists = new LinkedList<>();
	//	List<Coach> parmes = new LinkedList<>();
		lists.add(coachDao.get());
		return JSON.toJSONString(lists);
	}
	
}
