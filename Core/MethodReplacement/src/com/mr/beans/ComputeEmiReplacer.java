package com.mr.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ComputeEmiReplacer implements MethodReplacer {

	public Object reimplement(Object target, Method method, Object[] args)
			throws Throwable {
		Float p = null;
		Integer n = null;
		Float r = null;
		Float ret = null;
		// check whether it is the right method
		if (method.getName().equals("computeEmi") && args.length == 3) {
			p = (Float) args[0];
			n = (Integer) args[1];
			r = (Float) args[2];
			System.out.println("Principle : " + p);
			System.out.println("No of Years : " + n);
			System.out.println("Rate of Interest : " + r);
			// using these values write your new logic
			ret = new Float(1234.23f);
		}
		return ret;
	}

}
