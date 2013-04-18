package com.stock.bean;

public class StockViewer {
	StockDelegate delegate;

	public void print(String qn) {
		System.out.println(delegate.viewStock(qn));
	}

	public void setDelegate(StockDelegate delegate) {
		this.delegate = delegate;
	}

}
