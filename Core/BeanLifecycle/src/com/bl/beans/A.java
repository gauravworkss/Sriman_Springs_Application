package com.bl.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class A implements InitializingBean, DisposableBean {
	public void destroy() throws Exception {
		System.out.println("Called Destroy");
	}

	private String s1;
	private String s2;

	public A(String s1) {
		System.out.println("Constructor Called");
		this.s1 = s1;
	}
	
	public void init() {
		System.out.println("Called Init");
	}

	public void setS2(String s2) {
		System.out.println("Setter s2 called");
		this.s2 = s2;
	}

	public String getS1() {
		return s1;
	}

	public String getS2() {
		return s2;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Called afterPropertiesSet");
	}
	
	public void release() {
		System.out.println("Called Release");
	}

}
