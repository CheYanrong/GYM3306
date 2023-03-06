package com.kfm.web;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kfm.dao.ProjectTypeDao;
import com.kfm.model.ProjectType;
import com.kfm.model.ServiceItem;

public class ProjectTypeAction extends JsonServlet{
	private ProjectTypeDao projectTypeDao = new ProjectTypeDao();
	@Override
	public String dealInput(Map<String, String[]> input) {
		return JSON.toJSONString(projectTypeDao.get());
//		String[] array = {
//				
//				   "../../images/nav_icon_01.png", 
//				   "../../images/nav_icon_02.png",
//				   "../../images/nav_icon_03.png",
//				   "../../images/nav_icon_05.png",
//				   "../../images/nav_icon_06.png"
//			   };
//		return JSONObject.toJSONString(array);		
//		System.out.println(input);
//		int id=Integer.parseInt(input.get("pt_name")[1]);
//		if(id == -1) {
//			return JSON.toJSONString(projectTypeDao.get());
//		}
//		return JSON.toJSONString(projectTypeDao.get(id));
//		
//		List<List<ProjectType>> lists  =new LinkedList<>();
//		List<ProjectType> recommands=new LinkedList<>();
		//recommands.add(new ProjectType(1, "推荐", "../../images/nav_icon_01.png"));
		//recommands.add(new ProjectType(2, "体育", "../../images/nav_icon_02.png"));
//		recommands.add(projectTypeDao.get(1));
//		recommands.add(projectTypeDao.get(2));
//		recommands.add(projectTypeDao.get(3));
//		recommands.add(projectTypeDao.get(4));
//		recommands.add(projectTypeDao.get(5));
//		lists.add(recommands);
//		
//		List<ProjectType> meijias=new LinkedList<>();
//		meijias.add(new ProjectType(4, "爱丽克EircParisSalon",
//				"../../images/recommend_img_01.png", "我们追求的是没有最长只有更长！"));
//		lists.add(meijias);
//		return JSON.toJSONString(lists);
	}

}
