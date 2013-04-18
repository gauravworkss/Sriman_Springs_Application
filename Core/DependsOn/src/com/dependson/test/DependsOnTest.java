package com.dependson.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dependson.beans.Rocket;

public class DependsOnTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/dependson/common/application-context.xml"));
		Rocket r = factory.getBean("rocket", Rocket.class);
		
		r.fly();
	}

}
