package com.sf.beans;

import java.util.Date;

public class GenerateSalarySheet {
	private DateUtil dateUtil;

	public void setDateUtil(DateUtil dateUtil) {
		this.dateUtil = dateUtil;
	}

	public void compute() {
		System.out.println("computing using difference "
				+ dateUtil.getDays(new Date(), new Date()));
	}
}
