package com.sba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.sba.beans.LoanCalculator;
import com.sba.beans.SecurityAdvice;
import com.sba.sm.SecurityManager;

public class SecurityTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new LoanCalculator());
		factory.addAdvice(new SecurityAdvice());
		LoanCalculator proxy = (LoanCalculator) factory.getProxy();
		
		SecurityManager.login("john", "john1");
		System.out.println("Emi : " + proxy.computeEmi(24.24f, 24, 343.34f));
	}

}
