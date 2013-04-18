package com.so.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import com.emp.business.Employee;

public class EmployeeOperations {
	private static String SQL = "select * from tblemp where emp_id = ?";
	private static String LIST_SQL = "select * from tblemp where emp_name like ?";
	private static String UPD_EMP_SQL = "update tblemp set emp_name = ?, salary = ? where emp_id = ?";
	private DataSource dataSource;

	public EmployeeOperations(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public Employee getEmployeeDetails(int id) {
		SelectEmployee se = new SelectEmployee(dataSource, SQL);
		se.declareParameter(new SqlParameter(Types.INTEGER));
		Employee e = se.findObject(id);
		return e;
	}

	public List<Employee> getAllEmployees(String name) {
		SelectEmployee se = new SelectEmployee(dataSource, LIST_SQL);
		se.declareParameter(new SqlParameter(Types.VARCHAR));
		return se.execute(name);
	}

	public void updateEmployee(Employee e) {
		UpdateEmployee ue = new UpdateEmployee(dataSource, UPD_EMP_SQL);
		ue.declareParameter(new SqlParameter("emp_name", Types.VARCHAR));
		ue.declareParameter(new SqlParameter("salary", Types.FLOAT));
		ue.declareParameter(new SqlParameter("emp_id", Types.INTEGER));
		ue.updateEmployee(e.getEmpId(), e.getEmpName(), e.getSalary());
	}

	// querying employee info
	private class SelectEmployee extends MappingSqlQuery<Employee> {
		public SelectEmployee(DataSource ds, String sql) {
			super(ds, sql);
		}

		@Override
		protected Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee e = new Employee(rs.getInt("emp_id"),
					rs.getString("emp_name"), rs.getFloat("salary"));
			return e;
		}
	}

	// update employee
	private class UpdateEmployee extends SqlUpdate {

		public UpdateEmployee(DataSource ds, String sql) {
			super(ds, sql);
		}

		public void updateEmployee(int id, String name, float salary) {
			update(name, salary, id);
		}

	}

}
