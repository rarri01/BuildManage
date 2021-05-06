package com.web.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageController {

	@RequestMapping("/main")
	public String main() { 
		return "main";
	}
}
