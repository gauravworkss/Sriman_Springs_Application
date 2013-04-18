package com.cdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cdi.beans.University;

public class CollectionTest {
	public static void main(String args[]) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/cdi/common/application-context.xml"));

		University u = factory.getBean("university", University.class);
		System.out.println("List of subjects offered : ");
		for (String c : u.getCourses()) {
			System.out.println(c);
		}
		System.out.println("Faculty To Subjects class type : "
				+ u.getFacultyToSubjects().getClass());
		for (String faculty : u.getFacultyToSubjects().keySet()) {
			System.out.println("Faculty : " + faculty);
			System.out.println("Subject : "
					+ u.getFacultyToSubjects().get(faculty));
		}
		System.out.println("Subjects class : " + u.getSubjects().getClass());
		for (String s : u.getSubjects()) {
			System.out.println(s);
		}
		System.out.println("Standards : ");
		for(Object p : u.getStandards().keySet()) {
			System.out.println("Key : " + p);
			System.out.println("Value : " + u.getStandards().get(p));
		}
	}
}
