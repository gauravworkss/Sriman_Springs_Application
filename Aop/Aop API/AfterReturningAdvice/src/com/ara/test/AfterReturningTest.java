package com.ara.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ara.beans.EmployeeDAO;
import com.ara.beans.LoggingAdvice;

public class AfterReturningTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new EmployeeDAO());
		pf.addAdvice(new LoggingAdvice());
		EmployeeDAO emp = (EmployeeDAO) pf.getProxy();
		System.out.println("Insertion is : " + emp.insert("34", "Rama"));
	}

}
