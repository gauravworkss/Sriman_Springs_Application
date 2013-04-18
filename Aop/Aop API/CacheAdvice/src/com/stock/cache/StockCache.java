package com.stock.cache;

import java.util.HashMap;
import java.util.Map;

public class StockCache {
	private static StockCache instance;
	private Map<String, Float> dataMap;

	private StockCache() {
		dataMap = new HashMap<String, Float>();
	}

	public synchronized static StockCache getCache() {
		if (instance == null) {
			instance = new StockCache();
		}
		return instance;
	}

	public synchronized void put(String qn, float price) {
		dataMap.put(qn, price);
	}

	public synchronized Float get(String qn) {
		return dataMap.get(qn);
	}
}
