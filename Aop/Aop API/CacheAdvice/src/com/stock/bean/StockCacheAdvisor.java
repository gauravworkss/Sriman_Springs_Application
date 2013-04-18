package com.stock.bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.stock.cache.StockCache;

public class StockCacheAdvisor implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Float price = 0.0f;
		Object args[] = invocation.getArguments();
		String qn = (String) args[0];
		
		StockCache cache = StockCache.getCache();
		if(cache.get(qn) == null) {
			System.out.println("Calling Delegate to fetch value from service");
			price = (Float) invocation.proceed();
			cache.put(qn, price);
		} else {
			System.out.println("Returning from cache");
			price = cache.get(qn);
		}
		
		return price;
	}

}
