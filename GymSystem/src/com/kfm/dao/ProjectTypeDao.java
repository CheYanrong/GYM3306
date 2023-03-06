package com.kfm.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.kfm.model.Dept;
import com.kfm.model.ProjectType;

public class ProjectTypeDao extends BaseDao implements IBaseDao<ProjectType, Integer> {

	@Override
	public boolean add(ProjectType obj) {
		
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(ProjectType obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProjectType get(Integer id) {
		String sql="SELECT pt_id,pt_name,pt_icon FROM projecttype"
				+ " WHERE pt_id=?";
		try {
			return query(sql, new BeanHandler<>(ProjectType.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ProjectType> get() {

		String sql="SELECT pt_id,pt_name,pt_icon FROM projecttype";
		try {
			return query(sql, new BeanListHandler<>(ProjectType.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
