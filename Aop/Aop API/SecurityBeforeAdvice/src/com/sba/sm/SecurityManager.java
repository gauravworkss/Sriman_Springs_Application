package com.sba.sm;

public class SecurityManager {
	private static ThreadLocal<UserInfo> data = new ThreadLocal<UserInfo>();

	public static void login(String username, String password) {
		UserInfo info = new UserInfo();
		info.setUsername(username);
		info.setPassword(password);
		data.set(info);
	}

	public static boolean isUserLoggedIn() {
		if (data.get() == null) {
			return false;
		}
		if (data.get().getUsername().equals("john")
				&& data.get().getPassword().equals("john")) {
			return true;
		}
		return false;
	}

}
