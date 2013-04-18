package com.inf.beans;

public class Robot {
	private Cloud cloud;

	public void setCloud(Cloud cloud) {
		this.cloud = cloud;
	}

	public void greet(String name) {
		System.out.println(cloud.search(name));
	}
}
