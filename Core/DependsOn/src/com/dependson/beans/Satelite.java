package com.dependson.beans;

public class Satelite {
	private static int initialized;

	public static void startUp(int key) {
		initialized = key;
	}

	public static String getDirections(String source, String dest)
			throws Exception {
		if (initialized != 1)
			throw new Exception("UnAuthorized access");

		return "Some Direction";
	}
}
