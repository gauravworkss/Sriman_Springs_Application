package com.aa.beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CalculatorAspect {
	@Pointcut("execution(* com.aa.beans.Calculator.add(..))")
	public void myCalculatorPointCut() {}

	@Around("myCalculatorPointCut()")
	public Object inspect(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Called advice");
		return pjp.proceed();
	}
}
