package com.bna.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bna.beans.AccountProcessor;

public class BeanNameAwareTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bna/common/application-context.xml"));
		
		AccountProcessor ap = factory.getBean("accountProcessor", AccountProcessor.class);
		ap.computeLedgerBalance();
	}

}
