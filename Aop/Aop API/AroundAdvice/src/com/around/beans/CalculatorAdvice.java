package com.around.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CalculatorAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {		
		System.out.println("Method called : " + invocation.getMethod().getName());
		Object args[] = invocation.getArguments();
		Integer a = (Integer) args[0];
		Integer b = (Integer) args[1];
		// increment
		args[0] = a+1;
		args[1] = b+1;
		
		Object ret = invocation.proceed();
		System.out.println("Target class method returned : " + ret);
		
		ret = (Integer)ret + 2;
		return ret;
	}

}
