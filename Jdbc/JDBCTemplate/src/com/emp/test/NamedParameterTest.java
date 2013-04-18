package com.emp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emp.business.NamedEmployee;
import com.emp.dao.NamedParameterEmployeeDao;

public class NamedParameterTest {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/emp/common/persistence-beans.xml");
		NamedParameterEmployeeDao employeeDao = context.getBean("namedEmp",
				NamedParameterEmployeeDao.class);

		System.out.println(employeeDao.getCountByName("%e%"));

		// employeeDao.update(33, "John33", 2222.22f);
		employeeDao.insert(new NamedEmployee(1000, "1000th emp", 424.24f));
	}
}
