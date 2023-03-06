package com.kfm.web;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.kfm.dao.DetailDao;
import com.kfm.model.Detail;

public class DetailAction extends JsonServlet{
	private DetailDao detailDao = new DetailDao();
	@Override
	public String dealInput(Map<String, String[]> input) {
//		System.out.println(input);
//		List<List<Detail>> lists = new LinkedList<>();
//		List<Detail> details = new LinkedList<>();
//		Collections.addAll(details,detailDao.get(101),detailDao.get(102),
//				detailDao.get(103),detailDao.get(104),detailDao.get(105));
//		lists.add(details);
//		return JSON.toJSONString(lists.get(0).get(id));
//		System.out.println(input);
		int id=Integer.parseInt(input.get("id")[0]);
		return JSON.toJSONString(detailDao.get(id));
	}

}
