package com.kfm.web;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.kfm.dao.CoachDetailDao;
import com.kfm.model.CoachDetail;

public class CoachDetailAction extends JsonServlet{
	private CoachDetailDao coachDetailDao = new CoachDetailDao();

	@Override
	public String dealInput(Map<String, String[]> input) {
		System.out.println(input);
//		List<List<CoachDetail>> lists = new LinkedList<>();
//		List<CoachDetail> coachDetails = new LinkedList<>();
//		Collections.addAll(coachDetails,coachDetailDao.get(11),
//				coachDetailDao.get(22),coachDetailDao.get(33),coachDetailDao.get(44));
//		lists.add(coachDetails);
		int id=Integer.parseInt(input.get("id")[0]);
		return JSON.toJSONString(coachDetailDao.get(id));
	}
	
}
