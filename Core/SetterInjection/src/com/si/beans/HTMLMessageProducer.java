package com.si.beans;

public class HTMLMessageProducer implements IProducer {

	public String getFormattedMessage(String in) {
		return "<html><body><b>" + in + "</b></body></html>";
	}

}
