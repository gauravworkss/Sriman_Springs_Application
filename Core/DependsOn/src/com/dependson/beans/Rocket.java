package com.dependson.beans;

public class Rocket {
	public void fly() throws Exception {
		String directions = null;

		directions = Satelite.getDirections("ameerpet", "usa");
		System.out.println("Directions : " + directions);
	}
}
