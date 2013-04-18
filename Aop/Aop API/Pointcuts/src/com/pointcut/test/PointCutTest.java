package com.pointcut.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

import com.pointcut.bean.WeatherStation;
import com.pointcut.bean.WeatherStationAdvice;
import com.pointcut.bean.WeatherStationDynamicPointcut;
import com.pointcut.bean.WeatherStationPointcut;

public class PointCutTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new WeatherStation());
		/*
		 * pf.addAdvisor(new DefaultPointcutAdvisor(new
		 * WeatherStationPointcut(), new WeatherStationAdvice()));
		 */
		/*
		 * pf.addAdvisor(new DefaultPointcutAdvisor(new
		 * WeatherStationDynamicPointcut(), new WeatherStationAdvice()));
		 */
		NameMatchMethodPointcut nmp = new NameMatchMethodPointcut();
		nmp.addMethodName("getTemparature");
		pf.addAdvisor(new DefaultPointcutAdvisor(nmp,
				new WeatherStationAdvice()));
		WeatherStation proxy = (WeatherStation) pf.getProxy();
		System.out.println("Tempature : " + proxy.getTemparature(353));
		System.out.println("Will rain : " + proxy.willRaininAnHour(353));
	}

}
