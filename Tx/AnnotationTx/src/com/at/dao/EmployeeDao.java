package com.at.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.at.business.EmployeeBO;

@Repository("employeeDao")
public class EmployeeDao {
	@Autowired(required = true)
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
