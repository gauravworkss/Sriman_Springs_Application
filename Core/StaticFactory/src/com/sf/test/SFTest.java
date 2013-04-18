package com.sf.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sf.beans.GenerateSalarySheet;

public class SFTest {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sf/common/application-context.xml");

		GenerateSalarySheet gss = context.getBean("generateSalary",
				GenerateSalarySheet.class);
		gss.compute();
	}
}
