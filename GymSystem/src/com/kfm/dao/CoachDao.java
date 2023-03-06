package com.kfm.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.alibaba.fastjson.JSON;
import com.kfm.model.Coach;
import com.kfm.model.Project;

public class CoachDao extends BaseDao implements IBaseDao<Coach, Integer>{

	@Override
	public boolean add(Coach obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Coach obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Coach get(Integer id) {
		String sql = "SELECT c_id,c_title,c_img,c_sale,"
				+ "c_price,c_message,c_distance FROM coach\r\n"
				+ "WHERE c_id = ?";
		try {
			return query(sql, new BeanHandler<>(Coach.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Coach> get() {
		String sql = "SELECT c_id,c_title,c_img,c_sale,"
				+ "c_price,c_message,c_distance FROM coach\r\n";
		try {
			return query(sql, new BeanListHandler<>(Coach.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}



}
