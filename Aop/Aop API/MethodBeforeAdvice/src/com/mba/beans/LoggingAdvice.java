package com.mba.beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggingAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		// logging
		// security check
		System.out.println("Entering method: " + method.getName() + "()"
				+ " Arguments : ");
		for (Object o : args) {
			System.out.println(o);
		}
		String empId = (String) args[0];
		empId = empId + "E";
		args[0] = empId;
	}

}
