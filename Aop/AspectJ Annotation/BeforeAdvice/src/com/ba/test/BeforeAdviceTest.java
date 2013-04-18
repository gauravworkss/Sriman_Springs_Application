package com.ba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ba.beans.BankTrasact;

public class BeforeAdviceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ba/common/aop-beans.xml");
		
		BankTrasact bt = context.getBean("bankTransact", BankTrasact.class);
		System.out.println("Balance : " + bt.withdraw("35", 343.3f));
	}

}
