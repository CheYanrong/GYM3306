package com.kfm.web;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.kfm.dao.DeptDao;
import com.kfm.model.ServiceItem;

public class ServiceItemAction extends JsonServlet {
//	private DeptDao deptDao=new DeptDao();
	@Override
	public String dealInput(Map<String, String[]> input) {
		List<List<ServiceItem>> lists  =new LinkedList<>();
		List<ServiceItem> recommands=new LinkedList<>();
		recommands.add(new ServiceItem(1, "秋季自然特价美甲", "../../images/recommend_img_01.png", "我们追求的是没有最长只有更长！"));
		recommands.add(new ServiceItem(2, "秋季自然特价美甲", "../../images/recommend_img_01.png", "我们追求的是没有最长只有更长！"));
		recommands.add(new ServiceItem(3, "秋季自然特价美甲", "../../images/recommend_img_01.png", "我们追求的是没有最长只有更长！"));
		lists.add(recommands);
		List<ServiceItem> meijias=new LinkedList<>();
		meijias.add(new ServiceItem(4, "爱丽克EircParisSalon",
				"../../images/recommend_img_01.png", "我们追求的是没有最长只有更长！"));
		lists.add(meijias);
		return JSON.toJSONString(lists);
	}

}
