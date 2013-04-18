package com.stock.bean;

public class StockService {
	public float getStockPrice(String qn) {
		float price = 0.0f;
		if(qn != null) {
			// query db to get value
			if(qn.equals("ICICIBAN")) {
				price = 354.34f;
			} else if(qn.equals("CIPLA")) {
				price = 23.23f;
			}
		}
		return price;
	}
}
