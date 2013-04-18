package com.so.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emp.business.Employee;
import com.so.dao.EmployeeOperations;

public class OperationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/so/common/persistence-beans.xml");
		EmployeeOperations eo = context.getBean("employeeOperations",
				EmployeeOperations.class);

		eo.updateEmployee(new Employee(33, "Mark Hud", 111.11f));

		Employee e = eo.getEmployeeDetails(33);
		System.out.println(e.getEmpName());

		List<Employee> employees = eo.getAllEmployees("%e%");
		System.out.println(employees.size());

	}

}
