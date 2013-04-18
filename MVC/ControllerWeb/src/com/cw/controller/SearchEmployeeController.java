package com.cw.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.cw.beans.Employee;
import com.cw.beans.SearchCriteria;

public class SearchEmployeeController extends AbstractCommandController {

	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object command,
			BindException bindingException) throws Exception {
		if(bindingException.hasErrors()) {
			return new ModelAndView("empSearch");
		}
		SearchCriteria criteria = (SearchCriteria) command;
		System.out.println("Id : " + criteria.getId());

		// using searchCriteria call service
		Employee employee = new Employee(1, "Mark", 24254.24f);

		return new ModelAndView("empInfo", "emp", employee);
	}

}
