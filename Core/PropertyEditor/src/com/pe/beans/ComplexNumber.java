package com.pe.beans;

public class ComplexNumber {
	private int base;
	private int expo;

	public ComplexNumber(int base, int expo) {
		this.base = base;
		this.expo = expo;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getExpo() {
		return expo;
	}

	public void setExpo(int expo) {
		this.expo = expo;
	}

}
