package com.kfm.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;

import com.kfm.model.Detail;
import com.kfm.model.Project;

public class DetailDao extends BaseDao implements IBaseDao<Detail, Integer>{

	@Override
	public boolean add(Detail obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Detail obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Detail get(Integer id) { 
		String sql="SELECT p_id,p_title,p_img,p_sale,"
				+ "p_price,p_count,p_message,p_step,p_tip FROM project\r\n"
				+ "WHERE p_id = ? ";
		try {
			return query(sql, new BeanHandler<>(Detail.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Detail> get() {
		// TODO Auto-generated method stub
		return null;
	}

}
