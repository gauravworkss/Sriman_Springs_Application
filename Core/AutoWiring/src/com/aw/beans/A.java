package com.aw.beans;

public class A {
	private B b;
	private B bType;
	private C c;

	public A(B b) {
		System.out.println("Called A(B b)");
		this.b = b;
	}

	public A(B b, C c) {
		System.out.println("Called A(B b, C c)");
		this.b = b;
		this.c = c;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		System.out.println("Called setB()");
		this.b = b;
	}

	public B getbType() {
		return bType;
	}

	public void setbType(B bType) {
		System.out.println("Called setbType()");
		this.bType = bType;
	}

}
