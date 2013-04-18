package com.an.beans;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named(value="motor")
public class Motor {
	@Inject
	@Resource(name="tank1")
	private Tank tank;

	public void load() {
		tank.refil();
	}

	public void print() {
		System.out.println("You are using a Motor...");
	}
	
	public void setTank(Tank tank) {
		this.tank = tank;
	}

}
