package com.at.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.at.beans.DepartmentDao;

public class AfterThrowingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/at/common/aop-beans.xml");
		
		DepartmentDao dao = context.getBean("departmentDao", DepartmentDao.class);
		dao.insert(3);
	}

}
