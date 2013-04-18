package com.ag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.ag.business.DepartmentBO;

public class DepartmentDao {
	private JdbcTemplate jdbcTempate;

	public void setJdbcTempate(JdbcTemplate jdbcTempate) {
		this.jdbcTempate = jdbcTempate;
	}

	public int insert(final DepartmentBO departmentBO) {
		final String sql = "insert into tbldept(dept_nm, location) values(?,?)";
		KeyHolder kh = new GeneratedKeyHolder();

		int affectedRows = jdbcTempate.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, departmentBO.getDeptName());
				ps.setString(2, departmentBO.getLocation());
				return ps;
			}
		}, kh);
		System.out.println("Affected rows : " + affectedRows);
		return kh.getKey().intValue();
	}

}
