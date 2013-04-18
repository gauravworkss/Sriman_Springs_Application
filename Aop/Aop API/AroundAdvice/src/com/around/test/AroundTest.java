package com.around.test;

import org.springframework.aop.framework.ProxyFactory;

import com.around.beans.Calculator;
import com.around.beans.CalculatorAdvice;

public class AroundTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvice(new CalculatorAdvice());
		Calculator proxy = (Calculator) pf.getProxy();
		int sum = proxy.add(10, 20);
		System.out.println("Addition : " + sum);
	}

}
