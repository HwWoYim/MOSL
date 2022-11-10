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
		System.out.println("첫 번 째 회원정보 : " + mDTO);
		if(mDTO == null) {
			return "redirect:login.jsp";
		} else {
			session.setAttribute("member", mDTO);
			return "main.do";
		}
	}
	
	// 로그아웃
	@RequestMapping("/logout.do")
	public String logout(SessionStatus sessionStatus) {
		sessionStatus.setComplete();// attribute로 생성된 객체들을 제거해준다.
		return "redirect:main.do";
	}
	
	
	// 회원가입 페이지로의 이동
	@RequestMapping(value="/signup.do", method = RequestMethod.GET)
	public String signup() {
		return "signup.jsp";
	}
	// 회원가입 수행
	@RequestMapping(value="/signup.do", method = RequestMethod.POST)
	public String signup(MemberDTO mDTO) {
		memberService.insertMember(mDTO);
		return "redirect:login.do";
	}
	
	// 회원 정보출력
	@RequestMapping("/mypage.do")
	public String mypageselectOne(@ModelAttribute("member")MemberDTO mDTO, Model model, HttpSession session) {
		mDTO = memberService.selectOneMember(mDTO);
		System.out.println("회원정보 : " + mDTO);
		return "mypage.jsp";
	}
	
	// 회원정보변경
	@RequestMapping(value="/update.do", method = RequestMethod.POST)
	public String updateMember(@ModelAttribute("member")MemberDTO mDTO, Model model) {
		System.out.println("업데이트 : " + mDTO);
		memberService.updateMember(mDTO);
		return "main.do";
	}
	
	// 회원 탈퇴
	@RequestMapping(value="/delete.do", method = RequestMethod.POST)
	public String deleteMember(@ModelAttribute("member")MemberDTO mDTO, Model model, SessionStatus sessionStatus) {
		memberService.deleteMember(mDTO);
		sessionStatus.setComplete();
		return "redirect:main.do";
	}
}
