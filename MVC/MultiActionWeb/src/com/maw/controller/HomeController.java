package com.maw.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class HomeController extends MultiActionController {
	public ModelAndView search(HttpServletRequest request,
			HttpServletResponse response) {
		return new ModelAndView("search");
	}

	public ModelAndView list(HttpServletRequest request,
			HttpServletResponse response) {
		return new ModelAndView("list");
	}
}
