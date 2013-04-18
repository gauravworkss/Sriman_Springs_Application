package com.si.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.si.beans.HTMLMessageProducer;
import com.si.beans.IProducer;
import com.si.beans.MessageProducer;
import com.si.beans.MessageWriter;

public class MessageWriterTest {
	public static void main(String args[]) {
		// ioc container will gets created
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/si/common/application-context.xml"));

		MessageWriter writer = factory.getBean("messageWriter",
				MessageWriter.class);
		/*IProducer producer = factory.getBean("messageProducer",
				MessageProducer.class);*/
		//writer.setIproducer(producer);

		writer.write("Welcome to Spring");
	}
}
