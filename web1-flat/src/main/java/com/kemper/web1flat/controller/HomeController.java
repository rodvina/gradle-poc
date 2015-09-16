package com.kemper.web1flat.controller;

import org.springframework.stereotype.Controller;

import com.kemper.spring.security.core.KemperHeaderAttribute;

@Controller
public class HomeController {

	public String home() {
		KemperHeaderAttribute attrb;
		
		
		return "home";
	}
}
