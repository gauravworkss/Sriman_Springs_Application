package com.ew.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.ew.command.Employee;
import com.ew.service.EmployeeService;

public class EmployeeController extends SimpleFormController {
	private EmployeeService employeeService;	

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		Employee employee = (Employee) command;
		
		// need to call service to persist
		employeeService.insert(employee);
		
		return new ModelAndView("insertEmpSuccess");
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		return new Employee();
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
}
