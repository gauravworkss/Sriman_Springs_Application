package com.ba.beans;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingBeforeAspect {

	@Pointcut("execution(* com.ba.beans.BankTrasact.withdraw(..)) && args(accno, amount))")
	public void loggingPointCut(String accno, float amount) {
	}

	@Before("loggingPointCut(accno,amount)")	
	public void log(JoinPoint jp, String accno, float amount) {
		System.out.println("Called : " + jp.getSignature().getName()
		 + " with parameters accno : " + accno + " amount : " + amount); 
	}

}
