package com.aw.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aw.beans.A;

public class AWTest {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/aw/common/application-context.xml");

		A a = context.getBean("a1", A.class);
	}
}
