package com.stock.bean;

public class StockDelegate {
	public float viewStock(String qn) {
		StockService service = new StockService();
		float price = 0.0f;
		
		price = service.getStockPrice(qn);
		return price;		
	}	
}
