package com.si.beans;

public class MessageProducer implements IProducer {

	public String getFormattedMessage(String in) {
		return "*****" + in +"*****";
	}

}
