package com.at.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.at.business.EmployeeBO;
import com.at.business.EmployeeDepartmentBO;
import com.at.service.ManageEmployeeService;

public class AnnotationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/at/common/persistence-beans.xml");
		ManageEmployeeService service = context.getBean(
				"manageEmployeeService", ManageEmployeeService.class);

		EmployeeBO employeeInfo = new EmployeeBO(1012, "Axel", 353.3f);
		EmployeeDepartmentBO empDeptInfo = new EmployeeDepartmentBO(1013, 1);
		service.newJoinee(employeeInfo, empDeptInfo);
	}

}
