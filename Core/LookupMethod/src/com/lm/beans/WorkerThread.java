package com.lm.beans;

public class WorkerThread {
	private String data;

	public void setData(String data) {
		this.data = data;
	}

	public void execute() {
		System.out.println("Executing with data : " + data);
	}
}
