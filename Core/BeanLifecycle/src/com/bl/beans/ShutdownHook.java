package com.bl.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class ShutdownHook implements Runnable, BeanFactoryAware {
	private BeanFactory beanFactory;

	public void run() {
		// when the jvm is going to terminate
		((ConfigurableListableBeanFactory) beanFactory).destroySingletons();
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

}
