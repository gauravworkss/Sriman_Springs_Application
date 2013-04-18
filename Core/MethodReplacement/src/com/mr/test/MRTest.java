package com.mr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mr.beans.LoanApprover;

public class MRTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/mr/common/application-context.xml"));
		
		LoanApprover la = factory.getBean("loanApprover", LoanApprover.class);
		float emi = la.computeEmi(123454.43f, 2, 11);
		System.out.println("Emi calculated : " + emi);
	}

}
