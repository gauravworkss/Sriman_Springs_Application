package com.ci.beans;

public class BiCycle {
	private Chain chain;

	public BiCycle(Chain chain) {
		this.chain = chain;
		System.out.println("Called constructor and injecting chain");
	}

	public void run() {
		System.out.println("Running.....");
	}

	public void printSpecification() {
		System.out.println("Chain Details :- ");
		System.out.println("Model : " + chain.getId());
		System.out.println("Type : " + chain.getType().toLowerCase());
	}

}
