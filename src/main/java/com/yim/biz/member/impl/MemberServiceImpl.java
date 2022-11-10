package com.yim.biz.member.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yim.biz.member.MemberDTO;
import com.yim.biz.member.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDAO memberDAO;

	@Override
	public void insertMember(MemberDTO dto) {
		memberDAO.insertMember(dto);
	}

	@Override
	public void updateMember(MemberDTO dto) {
		memberDAO.updateMember(dto);
	}

	@Override
	public void deleteMember(MemberDTO dto) {
		memberDAO.deleteMember(dto);
	}

	@Override
	public MemberDTO selectOneMember(MemberDTO dto) {
		return memberDAO.selectOneMember(dto);
	}

	@Override
	public MemberDTO selectOneCheck(MemberDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<MemberDTO> selectAllMember(MemberDTO dto) {
		return memberDAO.selectAllMember(dto);
	}

	
	
}
