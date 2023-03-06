package com.kfm.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.kfm.model.Menuitems;

public class MenuitemsDao extends BaseDao implements IBaseDao<Menuitems, Integer>{

	@Override
	public boolean add(Menuitems obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Menuitems obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Menuitems get(Integer id) {
		String sql = "SELECT id,title,icon FROM menuitems\r\n"
				+ "WHERE id = ?";
		
		try {
			return query(sql, new BeanHandler<>(Menuitems.class), id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Menuitems> get() {
		String sql = "SELECT id,title,icon FROM menuitems";
		
		try {
			return query(sql, new BeanListHandler<>(Menuitems.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
