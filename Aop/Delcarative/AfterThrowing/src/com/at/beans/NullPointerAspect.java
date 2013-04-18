package com.at.beans;

public class NullPointerAspect {
	
	public void handle(NullPointerException npe) {
		System.out.println("From handle() method");
		npe.printStackTrace();
	}
}
