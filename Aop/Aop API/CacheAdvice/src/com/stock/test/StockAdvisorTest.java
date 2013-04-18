package com.stock.test;

import org.springframework.aop.framework.ProxyFactory;

import com.stock.bean.StockCacheAdvisor;
import com.stock.bean.StockDelegate;
import com.stock.bean.StockViewer;

public class StockAdvisorTest {
	public static void main(String args[]) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new StockDelegate());
		pf.addAdvice(new StockCacheAdvisor());
		StockViewer view = new StockViewer();
		//view.setDelegate((StockDelegate) pf.getProxy());
		view.setDelegate(new StockDelegate());
		view.print("ICICIBAN");
		view.print("ICICIBAN");
	}
}
