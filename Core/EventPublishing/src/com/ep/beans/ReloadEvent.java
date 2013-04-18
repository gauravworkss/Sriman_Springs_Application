package com.ep.beans;

import org.springframework.context.ApplicationEvent;

public class ReloadEvent extends ApplicationEvent {
	private String type;

	public ReloadEvent(Object source, String type) {
		super(source);
		this.type = type;
	}

	public String getType() {
		return type;
	}	
}
