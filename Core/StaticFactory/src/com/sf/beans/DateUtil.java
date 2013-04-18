package com.sf.beans;

import java.util.Date;

public class DateUtil {
	private static DateUtil instance;

	private DateUtil() {

	}

	public synchronized static DateUtil getInstance() {
		if (instance == null) {
			instance = new DateUtil();
		}
		return instance;
	}

	public int getDays(Date d1, Date d2) {
		return 12;
	}
}
