package com.ar.beans;

import org.aspectj.lang.JoinPoint;

public class KeyCheckAspect {

	public void check(JoinPoint jp, int bitType, int retVal) throws Throwable {
		System.out.println("Bit Type : " + bitType);
		System.out.println("Return value returned by target method : " + retVal);

		/*if (retVal <= 5) {
			throw new IllegalAccessException("Weak key generated");
		}*/
	}
}
