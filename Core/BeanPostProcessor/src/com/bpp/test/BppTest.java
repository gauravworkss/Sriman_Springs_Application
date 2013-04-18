package com.bpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bpp.beans.CustomBeanIntrospector;

public class BppTest {
	public static void main(String args[]) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bpp/common/application-context.xml"));
		((ConfigurableListableBeanFactory) factory)
				.addBeanPostProcessor(factory.getBean("bpp",
						CustomBeanIntrospector.class));
		factory.getBean("a");
	}
}
