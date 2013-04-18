package com.bl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bl.beans.A;
import com.bl.beans.ShutdownHook;

public class BLTest {
	public static void main(String args[]) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bl/common/application-context.xml"));
		ShutdownHook sh = factory.getBean("shutdownHook", ShutdownHook.class);
		Runtime.getRuntime().addShutdownHook(new Thread(sh));

		A a = factory.getBean("a", A.class);
		System.out.println(a.getS1());
		//((ConfigurableListableBeanFactory) factory).destroySingletons();
	}
}
