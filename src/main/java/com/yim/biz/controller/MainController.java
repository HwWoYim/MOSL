package com.yim.biz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value="/main.do")
	public String index() {
		return "main.jsp";
	}
	
}
