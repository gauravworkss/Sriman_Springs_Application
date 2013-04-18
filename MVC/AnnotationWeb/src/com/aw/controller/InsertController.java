package com.aw.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("insertController")
public class InsertController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(new EmployeeValidator());
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initialize() {
		return new ModelAndView("insert", "emp", new Employee());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView handlePost(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute @Valid Employee emp,
			BindingResult result) {
		if(result.hasErrors()) {
			return new ModelAndView("insert","emp",emp);
		}
		return new ModelAndView("detail", "id", emp.getId());
	}

}
