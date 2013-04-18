package com.fb.beans;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class CalendarWrapper implements FactoryBean<Calendar>, InitializingBean {
	private Calendar calendar;
	private int month;
	private int day;
	private int year;

	public void afterPropertiesSet() throws Exception {
		// by now all injections are over
		calendar = Calendar.getInstance();
		calendar.set(month, day, year);
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Calendar getObject() throws Exception {
		return calendar;
	}

	public Class<?> getObjectType() {
		return Calendar.class;
	}

	public boolean isSingleton() {
		return true;
	}

}
