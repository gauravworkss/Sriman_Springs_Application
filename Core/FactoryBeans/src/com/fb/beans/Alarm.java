package com.fb.beans;

import java.util.Calendar;

public class Alarm {
	private Calendar time;

	public void setTime(Calendar time) {
		this.time = time;
	}

	public void ring() {
		System.out.println("Ringing at : " + time.getTime());
	}
}
