package com.kfm.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.kfm.model.Project;
import com.kfm.model.ProjectType;

public class ProjectDao extends BaseDao implements IBaseDao<Project, Integer>{

	@Override
	public boolean add(Project obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Project obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Project get(Integer id) {
		String sql="SELECT p_id,p_title,p_img,p_sale,"
				+ "p_price,p_count,p_message FROM project\r\n"
				+ "WHERE p_id = ?";
		try {
			return query(sql, new BeanHandler<>(Project.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public List<Project> get1(String type) {
		String sql="SELECT p_id,p_title,p_img,p_sale,"
				+ "p_price,p_count,p_message FROM project\r\n"
				+ "WHERE p_type = ?";
		try {
			return query(sql, new BeanListHandler<>(Project.class),type);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Project> get() {
		String sql="SELECT p_id,p_title,p_img,p_sale,"
				+ "p_price,p_count,p_message FROM project\r\n";
		try {
			return query(sql, new BeanListHandler<>(Project.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
