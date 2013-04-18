package com.an.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.an.beans.Motor;

public class AnnotationTest {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/an/common/application-context.xml");
		
		Motor m = context.getBean("motor", Motor.class);
		m.load();
		m.print();
		
	}
}
