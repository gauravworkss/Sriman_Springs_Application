package com.mba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.mba.beans.LoggingAdvice;
import com.mba.beans.SalaryCal;

public class SalaryBeforeTest {
	public static void main(String args[]) {
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new SalaryCal());
		factory.addAdvice(new LoggingAdvice());
		SalaryCal proxy = (SalaryCal) factory.getProxy();
		
		System.out.println("Salary Computed : " + proxy.computeSalary("EMP1001"));
	}
}
