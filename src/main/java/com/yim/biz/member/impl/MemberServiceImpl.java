package com.yim.biz.member.impl;

import java.util.List;

import com.yim.biz.member.MemberDTO;
import com.yim.biz.member.MemberService;

public class MemberServiceImpl implements MemberService{
	
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
	public List<MemberDTO> selectAllMember(MemberDTO dto) {
		return memberDAO.selectAllMember(dto);
	}
	
	
}
