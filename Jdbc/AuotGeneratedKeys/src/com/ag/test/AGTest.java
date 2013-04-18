package com.ag.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ag.business.DepartmentBO;
import com.ag.dao.DepartmentDao;

public class AGTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ag/common/persistence-beans.xml");
		DepartmentDao dao = context.getBean("departmentDao",
				DepartmentDao.class);
		int id = dao.insert(new DepartmentBO(0, "IT", "Hyderabad"));
		System.out.println("Id : " + id);
	}

}
