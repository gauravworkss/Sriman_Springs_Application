package com.pe.beans;

public class Calculator {
	private ComplexNumber cn;

	public void setCn(ComplexNumber cn) {
		this.cn = cn;
	}
	
	public void cal() {
		System.out.println(cn.getBase());
	}
}
