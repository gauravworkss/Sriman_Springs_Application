package com.service.beans;

import com.business.beans.AccountInfo;

public class BalService {
	public AccountInfo getBalance(AccountInfo info) {
		if (info != null) {
			if (info.getAccountno() == 1) {
				info.setBal(24.34f);
			} else if (info.getAccountno() == 2) {
				info.setBal(35.35f);
			} else {
				info.setBal(100f);
			}
		}
		return info;
	}
}
