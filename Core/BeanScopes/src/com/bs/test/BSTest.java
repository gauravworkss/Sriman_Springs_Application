package com.bs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bs.beans.DateConverter;

public class BSTest {
	public static void main(String args[]) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bs/common/application-context.xml"));

		DateConverter dc1 = factory.getBean("dc", DateConverter.class);
		DateConverter dc2 = factory.getBean("dc", DateConverter.class);
		System.out.println(dc1.hashCode() == dc2.hashCode());
	}
}
