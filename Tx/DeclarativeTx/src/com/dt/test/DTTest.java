package com.dt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dt.business.EmployeeBO;
import com.dt.business.EmployeeDepartmentBO;
import com.dt.service.ManageEmployeeService;

public class DTTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/dt/common/persistence-beans.xml");

		ManageEmployeeService service = context.getBean(
				"manageEmployeeService", ManageEmployeeService.class);

		EmployeeBO employeeInfo = new EmployeeBO(1012, "Axel", 353.3f);
		EmployeeDepartmentBO empDeptInfo = new EmployeeDepartmentBO(1013, 1);
		service.newJoinee(employeeInfo, empDeptInfo);
	}

}
