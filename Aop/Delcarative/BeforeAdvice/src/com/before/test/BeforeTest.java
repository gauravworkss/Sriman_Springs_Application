package com.before.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.before.beans.Monitor;
import com.before.beans.StatementGenerator;

public class BeforeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/before/common/aop-beans.xml");

		StatementGenerator sg = context.getBean("statementGenerator",
				StatementGenerator.class);

		sg.generateStatement("ac2", 34, 24);
		sg.generateStatement("ac2", 34, 24);
		System.out.println("No of times generateStatement is called : "
				+ Monitor.getAccessCount("generateStatement"));
	}

}
