package com.dt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dt.business.EmployeeDepartmentBO;

public class EmployeeDepartmentDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(EmployeeDepartmentBO empDeptInfo) {
		final String sql = "insert into tblempdept(emp_id, dept_id) values(?,?)";

		jdbcTemplate.update(sql, new Object[] { empDeptInfo.getEmpId(),
				empDeptInfo.getDeptId() });
	}
}
