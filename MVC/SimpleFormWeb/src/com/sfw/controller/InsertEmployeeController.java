package com.sfw.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.sfw.beans.Employee;

public class InsertEmployeeController extends SimpleFormController {

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		Employee emp = (Employee) command;
		
		// service with emp
		System.out.println("Id : " + emp.getId());
		return new ModelAndView("result");
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		Employee e = new Employee();
		e.setId(12);
		e.setName("Mark");
		e.setSalary(24.24f);
		return e;
	}

}
