package com.maw.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class HomeInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		if (Calendar.getInstance().get(Calendar.HOUR) < 8
				|| Calendar.getInstance().get(Calendar.HOUR) > 20) {
			response.sendRedirect("outOfHours.jsp");
			return false;
		}
		return true;
	}

}
