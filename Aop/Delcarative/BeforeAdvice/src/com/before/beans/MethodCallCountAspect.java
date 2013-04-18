package com.before.beans;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class MethodCallCountAspect {

	public void monitor(JoinPoint jp) {
		Signature sig = jp.getSignature();
		String method = sig.getName();
		System.out.println("Method name in Aspect : " + method);
		Monitor.increment(method);
	}
}