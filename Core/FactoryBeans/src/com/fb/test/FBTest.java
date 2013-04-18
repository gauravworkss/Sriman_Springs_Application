package com.fb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fb.beans.Alarm;

public class FBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/fb/common/application-context.xml");

		Alarm alarm = context.getBean("alarm", Alarm.class);
		alarm.ring();
	}

}
