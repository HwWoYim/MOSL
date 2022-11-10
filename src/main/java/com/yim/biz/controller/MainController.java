package com.yim.biz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yim.biz.member.MemberDTO;
import com.yim.biz.member.MemberService;

@Controller
public class MainController {

	@Autowired
	private MemberService memberservice;
	
	@RequestMapping(value="/main.do")
	public String main(MemberDTO mDTO) {
		return "main.jsp";
	}
	
}
