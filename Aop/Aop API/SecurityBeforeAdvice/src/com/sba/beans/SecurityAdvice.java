package com.sba.beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.sba.sm.SecurityManager;

public class SecurityAdvice implements MethodBeforeAdvice {

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		if (!SecurityManager.isUserLoggedIn()) {
			throw new IllegalAccessException("Invalid Username/password");
		}
	}

}
