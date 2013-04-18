package com.si.beans;

public class MessageWriter{
	private IProducer iproducer;

	public void write(String msg) {
		String out = iproducer.getFormattedMessage(msg);
		System.out.println(out);
	}

	public void setIproducer(IProducer iproducer) {
		this.iproducer = iproducer;
	}

	
}
