package com.ta.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ta.beans.ExceptionLogger;
import com.ta.beans.Thrower;

public class ThrowsTest {
	public static void main(String args[]) {
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new Thrower());
		factory.addAdvice(new ExceptionLogger());
		Thrower proxy = (Thrower) factory.getProxy();
		proxy.alwaysThrow();
	}
}
