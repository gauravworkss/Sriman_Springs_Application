package com.aa.beans;

import org.aspectj.lang.ProceedingJoinPoint;

public class CalculatorAspect {
	public Object inspect(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Entered into inspect");
		Object ret = 0;
		Object[] args = null;
		Integer a = 0;
		Integer b = 0;

		args = pjp.getArgs();
		a = (Integer) args[0];
		b = (Integer) args[1];

		args[0] = ++a;
		args[1] = ++b;
		ret = pjp.proceed(args);

		ret = ((Integer) ret) + 2;

		return ret;
	}
}
