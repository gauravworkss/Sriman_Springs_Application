package com.inf.beans;

public class CloudServiceLocator {
	public Cloud getCloudInstance() {
		return new Cloud();
	}
}
