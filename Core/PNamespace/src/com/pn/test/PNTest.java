package com.pn.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pn.beans.Motor;

public class PNTest {
	public static void main(String args[]) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/pn/common/application-context.xml"));
		
		Motor m1 = factory.getBean("motor", Motor.class);
		System.out.println("Id : " + m1.getEngine().getClassType());
	}
}
