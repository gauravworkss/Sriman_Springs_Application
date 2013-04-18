package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Shop;

public class BeanAliasTest {
	public static void main(String args[]) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/ba/common/application-context.xml"));
		
		Shop shop = factory.getBean("shop", Shop.class);
		System.out.println("First Purchase----");
		shop.purchase(1001);
		System.out.println("Second Purchase----");
		shop.purchase(2001);
	}
}
