package com.pointcut.bean;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class WeatherStationPointcut extends StaticMethodMatcherPointcut {

	public boolean matches(Method method, Class<?> objectClass) {
		if (method.getName().equals("getTemparature")
				&& objectClass == WeatherStation.class) {
			return true;
		}
		return false;
	}

}
