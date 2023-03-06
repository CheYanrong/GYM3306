package com.kfm.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.kfm.model.CoachDetail;

public class CoachDetailDao extends BaseDao implements IBaseDao<CoachDetail, Integer>{

	@Override
	public boolean add(CoachDetail obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(CoachDetail obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CoachDetail get(Integer id) {
		String sql = "SELECT c_id,c_title,c_img,c_age,c_sale,c_price,c_age,"
				+ "c_phone,c_message,c_image,c_distance FROM coach\r\n"
				+ "WHERE c_id = ?";
		try {
			return query(sql, new BeanHandler<>(CoachDetail.class), id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<CoachDetail> get() {
		String sql = "SELECT c_id,c_title,c_img,c_age,c_sale,c_price,c_age,"
				+ "c_phone,c_message,c_image,c_distance FROM coach\r\n";
		try {
			return query(sql, new BeanListHandler<>(CoachDetail.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
