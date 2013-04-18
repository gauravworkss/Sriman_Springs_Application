package com.nbf.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nbf.beans.Rocket;

public class NBFTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory consumableFactory = new XmlBeanFactory(
				new ClassPathResource("com/nbf/common/consumable-beans.xml"));

		BeanFactory actionFactory = new XmlBeanFactory(new ClassPathResource(
				"com/nbf/common/action-beans.xml"), consumableFactory);
		
		Rocket r1 = actionFactory.getBean("rocket", Rocket.class);
		System.out.println("Fuel Type : " + r1.getFuel().getType());
	}

}
