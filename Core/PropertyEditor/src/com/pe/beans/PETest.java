package com.pe.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PETest {
	public static void main(String args[]) {
		/*ApplicationContext factory = new ClassPathXmlApplicationContext(
				"com/pe/beans/application-context.xml");*/
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/pe/beans/application-context.xml"));
		Calculator cal = factory.getBean("cal", Calculator.class);
		cal.cal();
	}
}
