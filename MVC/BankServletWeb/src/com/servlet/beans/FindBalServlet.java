package com.servlet.beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import com.business.beans.AccountInfo;
import com.service.beans.BalService;

public class FindBalServlet implements HttpRequestHandler {
	private BalService balService;
	private AccountInfo accountInfo;

	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		accountInfo
				.setAccountno(Integer.parseInt(request.getParameter("accno")));

		try {
			if (accountInfo.getAccountno() == 1) {
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			// no op
		}
		accountInfo = balService.getBalance(accountInfo);
		PrintWriter out = response.getWriter();
		out.print("Balance : " + accountInfo.getBal());
	}

	public void setBalService(BalService balService) {
		this.balService = balService;
	}

	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}

}
