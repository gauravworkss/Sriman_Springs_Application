package com.dt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dt.business.EmployeeBO;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(EmployeeBO employeeInfo) {
		final String sql = "insert into tblemp(emp_id, emp_name, salary) values(?,?,?)";
		jdbcTemplate.update(sql, new Object[] { employeeInfo.getId(),
				employeeInfo.getName(), employeeInfo.getSalary() });
	}
}
