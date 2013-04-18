package com.ba.beans;

public class Bluedart implements ICourier {

	public void deliver(int zip) {
		System.out
				.println("Delivering your consignment through Bluedart to zip : "
						+ zip);
	}

}
