package com.at.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.at.business.EmployeeBO;
import com.at.business.EmployeeDepartmentBO;
import com.at.dao.EmployeeDao;
import com.at.dao.EmployeeDepartmentDao;

@Service("manageEmployeeService")
public class ManageEmployeeService {
	@Autowired(required = true)
	private EmployeeDao employeeDao;
	@Autowired(required = true)
	private EmployeeDepartmentDao employeeDepartmentDao;

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
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
