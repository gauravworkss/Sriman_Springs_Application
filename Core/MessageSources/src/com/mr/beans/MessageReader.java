package com.mr.beans;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageReader {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mr/common/application-context.xml");
		System.out.println(context.getMessage("greeting.message", new Object[] { "Narayana" },
				Locale.getDefault()));
	}
}
