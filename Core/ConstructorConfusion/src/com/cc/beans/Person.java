package com.cc.beans;

public class Person {
	private int ssn;
	private String name;

	public Person(int ssn) {
		this.ssn = ssn;
	}

	public Person(String name) {
		this.name = name;
	}
	
	public Person(int ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

}
