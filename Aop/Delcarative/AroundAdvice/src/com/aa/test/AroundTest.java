package com.aa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.beans.Calculator;

public class AroundTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/aa/common/aop-beans.xml");

		Calculator cal = context.getBean("calculator", Calculator.class);
		System.out.println("Sum : " + cal.add(10, 20));
		System.out.println("Sum : " + cal.substract(10, 20));
	}

}
