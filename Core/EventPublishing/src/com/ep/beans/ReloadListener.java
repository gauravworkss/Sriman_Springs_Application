package com.ep.beans;

import org.springframework.context.ApplicationListener;

public class ReloadListener implements ApplicationListener<ReloadEvent>{

	public void onApplicationEvent(ReloadEvent re) {
		System.out.println("Recieved : " + re.getType());
	}

}
