package com.kfm.web;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.kfm.dao.ProjectDao;
import com.kfm.model.Project;

public class ProjectAction extends JsonServlet{
	private ProjectDao projectDao = new ProjectDao();
	@Override
	public String dealInput(Map<String, String[]> input) {
		List<List<Project>> lists = new LinkedList<>();
//		List<Project> recommands = new LinkedList<>();
//		recommands.add(projectDao.get1("推荐"));
//		recommands.add(projectDao.get1("运动"));
//		recommands.add(projectDao.get1("拳击"));
//		recommands.add(projectDao.get1("静坐"));
//		recommands.add(projectDao.get1("瑜伽"));
//		lists.add(recommands);
		lists.add(projectDao.get1("推荐"));
		lists.add(projectDao.get1("运动"));
		lists.add(projectDao.get1("拳击"));
		lists.add(projectDao.get1("静坐"));
		lists.add(projectDao.get1("瑜伽"));
		return JSON.toJSONString(lists);
	}

}
