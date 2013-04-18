package com.ba.beans;

public class Dtdc implements ICourier {

	public void deliver(int zip) {
		System.out.println("Delivering your consignment through DTDC to zip : "
				+ zip);
	}

}
