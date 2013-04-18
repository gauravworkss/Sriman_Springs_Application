package com.ci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ci.beans.BiCycle;

public class BiCycleTest {
	public static void main(String args[]) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/ci/common/application-context.xml"));

		BiCycle biCycle = factory.getBean("biCycle", BiCycle.class);
		//biCycle.run();
		biCycle.printSpecification();
	}
}
