package com.ta.beans;

public class Thrower {
	public void alwaysThrow() throws NullPointerException {
		throw new NullPointerException("Throwing exception simply");
	}
}
