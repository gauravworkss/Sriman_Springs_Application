package com.before.beans;

import java.util.HashMap;
import java.util.Map;

public class Monitor {
	private static Map<String, Integer> methodMonitor = new HashMap<String, Integer>();

	public static void increment(String method) {
		if (method != null && !method.equals("")) {
			if (methodMonitor.containsKey(method)) {
				int count = methodMonitor.get(method);
				count++;
				methodMonitor.put(method, count);
			} else {
				methodMonitor.put(method, 1);
			}
		}
	}

	public static int getAccessCount(String method) {
		if (methodMonitor.containsKey(method)) {
			return methodMonitor.get(method);
		}
		return 0;
	}
}
