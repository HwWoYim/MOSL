package com.yim.biz.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.yim.biz.member.MemberDTO;
import com.yim.biz.member.MemberService;

@Controller
@SessionAttributes("member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	// 로그인
	@RequestMapping(value="/login.do", method = RequestMethod.GET)
	public String index() {
		return "login.jsp";
	}
	@RequestMapping(value="/login.do", method= RequestMethod.POST)
	public String selectOneMember(MemberDTO mDTO, Model model, HttpSession session) {
		mDTO = memberService.selectOneMember(mDTO);
		session.setAttribute("user", mDTO);
		if(mDTO == null) {
			return "login.jsp";
		} else {
			model.addAttribute("userID", mDTO.getMid());
			model.addAttribute("mrole", mDTO.getMrole());
			return "main.do";
		}
	}
	
	// 로그아웃
	@RequestMapping("/logout.do")
	public String logout(SessionStatus sessionStatus) {
		sessionStatus.setComplete();// attribute로 생성된 객체들을 제거해준다.
		return "redirect:main.do";
	}
	
	// 회원정보변경
	@RequestMapping("/update.do")
	public String updateMember(@ModelAttribute("member")MemberDTO mDTO, Model model) {
		memberService.updateMember(mDTO);
		return "main.do";
	}
	
	// 회원 탈퇴
	@RequestMapping("/delete.do")
	public String deleteMember(@ModelAttribute("member")MemberDTO mDTO, HttpSession session) {
		memberService.deleteMember(mDTO);
		return "main.do";
	}
}
