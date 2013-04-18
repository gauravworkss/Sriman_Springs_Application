package com.ep.beans;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class ReloadPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;
	
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	public void publish() {
		ReloadEvent re = new ReloadEvent(this, "Static");
		publisher.publishEvent(re);
	}

}
