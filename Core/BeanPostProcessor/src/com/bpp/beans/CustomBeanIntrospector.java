package com.bpp.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanIntrospector implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object target, String name)
			throws BeansException {
		System.out.println("Called Post Process After : " + name);
		return target;
	}

	public Object postProcessBeforeInitialization(Object target, String name)
			throws BeansException {
		System.out.println("Called Post Process Before : " + name);
		return target;
	}

}
