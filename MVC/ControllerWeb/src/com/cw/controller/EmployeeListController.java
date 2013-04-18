package com.cw.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.cw.beans.Employee;

public class EmployeeListController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// query the service
		// get emp list
		// bound to ModeAndView
		// set the logical view name

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Smith", 3423.3f));
		empList.add(new Employee(2, "Mark", 13423.3f));

		return new ModelAndView("empList", "empList", empList);
	}

}
