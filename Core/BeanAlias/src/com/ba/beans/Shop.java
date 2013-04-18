package com.ba.beans;

public class Shop {
	private ICourier bd;
	private ICourier dtdc;

	public Shop(ICourier bd, ICourier dtdc) {
		this.bd = bd;
		this.dtdc = dtdc;
	}

	public void purchase(int zip) {
		if (zip >= 1000 && zip <= 1999) {
			dtdc.deliver(zip);
		} else {
			bd.deliver(zip);
		}
	}

}
