package com.kfm.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.kfm.model.Users;

public class UsersDao extends BaseDao implements IBaseDao<Users, Integer> {

	@Override
	public boolean add(Users obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Users obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Users get(Integer id) {
		String sql = "SELECT u_id,nickname,u_name,u_img,"
				+ "u_age,u_phone,u_province,u_city,u_address "
				+ "FROM users\r\n"
				+ "WHERE u_id = ?";
		try {
			return query(sql,new BeanHandler<>(Users.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Users> get() {
		String sql = "SELECT u_id,nickname,u_name,u_img,"
				+ "u_age,u_phone,u_province,u_city,u_address "
				+ "FROM users\r\n";
		try {
			return query(sql,new BeanListHandler<>(Users.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
