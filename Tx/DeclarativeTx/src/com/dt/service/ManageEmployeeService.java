package com.dt.service;

import com.dt.business.EmployeeBO;
import com.dt.business.EmployeeDepartmentBO;
import com.dt.dao.EmployeeDao;
import com.dt.dao.EmployeeDepartmentDao;

public class ManageEmployeeService {
	private EmployeeDao employeeDao;
	private EmployeeDepartmentDao employeeDepartmentDao;

	public void newJoinee(EmployeeBO employeeInfo,
			EmployeeDepartmentBO empDeptInfo) {
		employeeDao.insert(employeeInfo);
		employeeDepartmentDao.insert(empDeptInfo);
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void setEmployeeDepartmentDao(
			EmployeeDepartmentDao employeeDepartmentDao) {
		this.employeeDepartmentDao = employeeDepartmentDao;
	}

}
