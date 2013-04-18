package com.lm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lm.beans.Container;

public class LMTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/lm/common/application-context.xml");
		
		Container c = context.getBean("container", Container.class);
		c.process("data1");
		c.process("data2");
	}

}
