package com.ta.beans;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionLogger implements ThrowsAdvice {
	
	public void afterThrowing(Exception npe) {
		System.out.println("Printing Stack Trace from exception : ");
		npe.printStackTrace();
	}
	
	public void afterThrowing(NullPointerException npe) {
		System.out.println("Printing Stack Trace: ");
		npe.printStackTrace();
	}
	
	public void afterThrowing(Method method, Object args[], Object target,NullPointerException npe) {
		System.out.println("Exception has been throwed by method : " + method.getName());
		npe.printStackTrace();
	}
}
