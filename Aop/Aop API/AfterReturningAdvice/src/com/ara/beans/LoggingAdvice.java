package com.ara.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LoggingAdvice implements AfterReturningAdvice {

	public void afterReturning(Object ret, Method method, Object[] args,
			Object target) throws Throwable {
		ret = Boolean.FALSE;
		System.out.println("Returning from method : " + method.getName()
				+ " with result as : " + ret);
	}

}
