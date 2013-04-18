package com.ep.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ep.beans.ReloadPublisher;

public class EPTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ep/common/application-context.xml");
		ReloadPublisher rp = context.getBean("reloadPublisher", ReloadPublisher.class);
		rp.publish();
	}

}
