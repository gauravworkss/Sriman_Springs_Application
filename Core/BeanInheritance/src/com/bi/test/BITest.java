package com.bi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bi.beans.Calculator;

public class BITest {
	public static void main(String args[]) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bi/common/application-context.xml"));
		Calculator c = factory.getBean("simpleCalculator", Calculator.class);
		System.out.println("Pi : " + c.getPi());
	}
}
