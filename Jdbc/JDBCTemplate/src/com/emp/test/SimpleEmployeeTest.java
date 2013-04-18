package com.emp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emp.business.NamedEmployee;
import com.emp.dao.EmployeeDao;
import com.emp.dao.SimpleEmployeeDao;

public class SimpleEmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/emp/common/persistence-beans.xml");
		SimpleEmployeeDao employeeDao = context.getBean("simpleEmployeeDao",
				SimpleEmployeeDao.class);

		employeeDao.insert(new NamedEmployee(1001, "1001 Employee", 242.34f));
	}

}
