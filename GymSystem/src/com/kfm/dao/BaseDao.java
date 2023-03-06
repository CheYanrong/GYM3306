package com.kfm.dao;

import java.io.FileReader;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class BaseDao extends QueryRunner {
	private static DataSource dataSource;
	static {
		try {
			Properties pros=new Properties();;
			pros.load(new FileReader("src/druid.properties"));
			dataSource=DruidDataSourceFactory.createDataSource(pros);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	protected BaseDao() {
		super(dataSource);
	}
}
