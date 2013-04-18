package com.ar.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ar.beans.KeyGenerator;

public class AfterReturningTest {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ar/common/aop-beans.xml");
		KeyGenerator kg = context.getBean("keyGenerator", KeyGenerator.class);
		System.out.println("Generated key : " + kg.generateKey(32));
		System.out.println("Generated key : " + kg.generateKey(32));
		System.out.println("Generated key : " + kg.generateKey(32));
		System.out.println("Generated key : " + kg.generateKey(32));
		System.out.println("Generated key : " + kg.generateKey(32));
	}
}
