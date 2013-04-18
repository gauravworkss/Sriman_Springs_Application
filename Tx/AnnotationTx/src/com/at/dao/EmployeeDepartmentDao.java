package com.at.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.at.business.EmployeeDepartmentBO;

@Repository("employeeDepartmentDao")
public class EmployeeDepartmentDao {
	@Autowired(required = true)
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
