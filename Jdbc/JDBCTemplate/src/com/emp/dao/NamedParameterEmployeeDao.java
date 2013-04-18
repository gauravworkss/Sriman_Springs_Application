package com.emp.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.emp.business.NamedEmployee;

public class NamedParameterEmployeeDao extends JdbcDaoSupport {
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	

	public void setNamedParameterJdbcTemplate(
			NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;		
	}

	public int getCountByName(String name) {
		SqlParameterSource paramSource = new MapSqlParameterSource("empName",
				name);
		return namedParameterJdbcTemplate.queryForInt(
				"select count(*) from tblemp where emp_name like :empName",
				paramSource);
	}

	public void update(int id, String name, float salary) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource("empId",
				id);
		paramSource.addValue("empName", name);
		paramSource.addValue("salary", salary);

		int count = namedParameterJdbcTemplate
				.update("update tblemp set emp_name=:empName, salary=:salary where emp_id = :empId",
						paramSource);

		System.out.println("Affected rows : " + count);
	}

	public void insert(NamedEmployee e) {
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(e);
		int count = namedParameterJdbcTemplate
				.update("insert into tblemp(emp_id, emp_name, salary) values(:emp_id, :emp_name, :salary)",
						paramSource);
		System.out.println("Affect count : " + count);
	}
}
