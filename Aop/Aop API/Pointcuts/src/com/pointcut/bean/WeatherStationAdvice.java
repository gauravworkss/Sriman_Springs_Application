package com.pointcut.bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class WeatherStationAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		// i wont care about parameters
		System.out.println("Called invoke");
		Object ret = invocation.proceed();
		ret = ((Float) ret) + 0.5f;
		return ret;
	}

}
