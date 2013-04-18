package com.ew.service;

import com.ew.command.Employee;
import com.ew.dao.EmployeeDao;
import com.ew.hlo.EmployeeHLO;

public class EmployeeService {
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void insert(Employee employee) {
		EmployeeHLO employeeHLO = new EmployeeHLO();
		employeeHLO.setId(employee.getId());
		employeeHLO.setName(employee.getName());
		employeeHLO.setSalary(employee.getSalary());
		employeeDao.insert(employeeHLO);
	}
}
