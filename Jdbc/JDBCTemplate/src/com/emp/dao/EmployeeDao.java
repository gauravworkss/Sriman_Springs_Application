package com.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;

import com.emp.business.Employee;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public EmployeeDao(DataSource dataSource) {
		super();
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int getEmployeeCount() {
		int count = 0;

		count = jdbcTemplate.queryForInt("select count(*) from tblemp");
		return count;
	}

	public String findEmployee(int id) {
		String name = null;

		name = jdbcTemplate.queryForObject(
		"select emp_name from tblemp where emp_id = ?",	new Object[] { id }, String.class);

		return name;
	}

	public Employee getEmployeeDetails(int id) {
		return jdbcTemplate.queryForObject(
				"select * from tblemp where emp_id = ?", new Object[] { id },
				new RowMapper<Employee>() {

					public Employee mapRow(ResultSet resultSet, int rowNumber)
							throws SQLException {
						Employee e = new Employee(resultSet.getInt("emp_id"),
												  resultSet.getString("emp_name"), 
												  resultSet.getFloat("salary"));

						return e;
					}
				});
	}

	public List<String> getAllEmployeeNames() {
		return jdbcTemplate.queryForList("select emp_name from tblemp",
				String.class);
	}

	public List getAllEmployees() {
		return jdbcTemplate.query("select * from tblemp",
				new RowMapper<Employee>() {
					public Employee mapRow(ResultSet resultSet, int rowNumber)
							throws SQLException {
						Employee e = new Employee(resultSet.getInt("emp_id"),
								resultSet.getString("emp_name"), resultSet
										.getFloat("salary"));
						return e;
					}
				});
	}

	public List<Employee> getEmployeesByName(final String empName) {
		PreparedStatementCreator creator = new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement("select * from tblemp where emp_name like ?");
				ps.setString(1, empName);
				return ps;
			}
		};

		PreparedStatementCallback<List<Employee>> callBack = new PreparedStatementCallback<List<Employee>>() {

			public List<Employee> doInPreparedStatement(
					PreparedStatement preparedStatement) throws SQLException,
					DataAccessException {
				List<Employee> employees = new ArrayList<Employee>();
				ResultSet rs = preparedStatement.executeQuery();
				while (rs.next()) {
					Employee e = new Employee(rs.getInt("emp_id"),
							rs.getString("emp_name"), rs.getFloat("salary"));
					employees.add(e);
				}

				return employees;
			}
		};
		return jdbcTemplate.execute(creator, callBack);
	}

	public void insert(Employee e) {
		int rowCount = jdbcTemplate.update(
				"insert into tblemp(emp_id,emp_name,salary) values(?,?,?)",
				new Object[] { e.getEmpId(), e.getEmpName(), e.getSalary() });
		System.out.println("No of Rows effected : " + rowCount);
	}

	public void update(Employee e) {
		jdbcTemplate.update(
				"update tblemp set emp_name = ?, salary = ? where emp_id = ?",
				new Object[] { e.getEmpName(), e.getSalary(), e.getEmpId() });
	}

	public void insert(final List<Employee> employees) {
		if (employees != null && employees.size() > 0) {
			jdbcTemplate
					.batchUpdate(
							"insert into tblemp(emp_id,emp_name, salary) values(?,?,?)",
							new BatchPreparedStatementSetter() {

																public void setValues(PreparedStatement ps,int index) throws SQLException {
																																				ps.setInt(1, employees.get(index)
																																						.getEmpId());
																																				ps.setString(2, employees.get(index)
																																						.getEmpName());
																																				ps.setFloat(3, employees.get(index)
																																						.getSalary());
																																		  }

																public int getBatchSize() {
																	return employees.size();
																}
							});
		}
	}
}
