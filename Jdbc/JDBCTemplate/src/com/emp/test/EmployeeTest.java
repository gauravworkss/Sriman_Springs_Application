package com.emp.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emp.business.Employee;
import com.emp.dao.EmployeeDao;

public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/emp/common/persistence-beans.xml");
		EmployeeDao employeeDao = context.getBean("employeeDao",
				EmployeeDao.class);
		System.out.println("No of employees : "
				+ employeeDao.getEmployeeCount());

		System.out.println("Employee Name : " + employeeDao.findEmployee(1));

		Employee e = employeeDao.getEmployeeDetails(1);
		System.out.println("Employee Information");
		System.out.println("id : " + e.getEmpId());
		System.out.println("Name : " + e.getEmpName());
		System.out.println("Salary : " + e.getSalary());

		List<String> empNames = employeeDao.getAllEmployeeNames();
		System.out.println("Employee Names : ");
		for (String s : empNames) {
			System.out.println(s);
		}

		List employees = employeeDao.getAllEmployees();
		System.out.println("All employee information");

		for (Object emp : employees) {
			System.out.println("Id : " + ((Employee) emp).getEmpId());
		}

		List<Employee> matchEmployees = employeeDao.getEmployeesByName("%e%");
		System.out.println("Matching Employees");
		for (Employee e1 : matchEmployees) {
			System.out.println("Id : " + e1.getEmpId());
		}

		/*
		 * employeeDao.insert(new Employee(34, "Pop34", 2424.24f));
		 * System.out.println("Inserted Employee"); Employee e2 =
		 * employeeDao.getEmployeeDetails(33); System.out.println("Emp name : "
		 * + e2.getEmpName());
		 */

		employeeDao.update(new Employee(33, "pop33", 24242.23f));

		List<Employee> insertionEmployees = new ArrayList<Employee>();
		for (int i = 100; i < 1000; i++) {
			insertionEmployees.add(new Employee(i, "Insert Emloyee" + i,
					i * 100));
		}

		employeeDao.insert(insertionEmployees);

	}

}
