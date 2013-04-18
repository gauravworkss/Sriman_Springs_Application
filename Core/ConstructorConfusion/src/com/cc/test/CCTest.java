package com.cc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cc.beans.Person;

public class CCTest {
	public static void main(String args[]) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/cc/common/application-context.xml"));
		
		Person p = factory.getBean("completePerson", Person.class);
		System.out.println("SSN : " + p.getSsn());
		System.out.println("Name : " + p.getName());
	}
}
