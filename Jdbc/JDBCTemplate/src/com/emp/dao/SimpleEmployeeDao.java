package com.emp.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.emp.business.NamedEmployee;

public class SimpleEmployeeDao {
	private SimpleJdbcInsert simpleEmployeeInsert;

	public SimpleEmployeeDao(DataSource dataSource) {
		super();
		simpleEmployeeInsert = new SimpleJdbcInsert(dataSource);
		simpleEmployeeInsert.setTableName("tblemp");
	}

	public void insert(NamedEmployee e) {
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(e);
		simpleEmployeeInsert.execute(paramSource);
	}

}
