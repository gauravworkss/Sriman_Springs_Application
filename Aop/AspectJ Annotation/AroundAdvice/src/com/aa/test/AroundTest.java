package com.aa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.beans.Calculator;

public class AroundTest {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/aa/common/aop-beans.xml");
		
		Calculator c = context.getBean("calculator", Calculator.class);
		System.out.println("Sum : " + c.add(12, 12));
	}
}
