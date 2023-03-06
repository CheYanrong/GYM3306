package com.kfm.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.kfm.model.Dept;

public class DeptDao extends BaseDao implements IBaseDao<Dept, Integer> {

	@Override
	public boolean add(Dept obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Dept obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Dept get(Integer id) {
		String sql="SELECT deptno,dname,loc FROM dept"
				+ " WHERE deptno=?";
		try {
			return query(sql, new BeanHandler<>(Dept.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Dept> get() {
		String sql="SELECT deptno,dname,loc FROM dept"
				+ " order by deptno";
		try {
			return query(sql, new BeanListHandler<>(Dept.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Object getByScalar() {
		String sql="SELECT count(6) FROM dept";
		try {
			return query(sql, new ScalarHandler());//Long
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Object getByMapListHandler() {
		String sql="SELECT deptno,dname,loc FROM dept"
				+ " order by deptno";
		try {
			return (List<Map<String, Object>>)query(sql, new MapListHandler());//
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Object[] getByArrayHandler(Integer id) {
		String sql="SELECT deptno,dname,loc FROM dept"
				+ " WHERE deptno=?";
		try {
			return query(sql, new ArrayHandler(),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
