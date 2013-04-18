package com.aw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/simple")
@Controller
public class SimpleController {

	@RequestMapping(method = RequestMethod.GET)
	public String detail(@RequestParam("name")String name,Model model) {
		
		model.addAttribute("id", name);
		return "detail";
	}
}
