package com.pointcut.bean;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class WeatherStationDynamicPointcut extends DynamicMethodMatcherPointcut {

	public boolean matches(Method method, Class<?> objectClass, Object[] args) {
		Integer zipCode = 0;

		if (method.getName().equals("getTemparature")
				&& objectClass == WeatherStation.class) {
			zipCode = (Integer) args[0];
			if (zipCode >= 10 && zipCode <= 100) {
				return true;
			}
		}
		return false;
	}

}
