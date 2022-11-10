package com.yim.biz.member;

import java.util.List;

public interface MemberService {
	public void insertMember(MemberDTO dto);
	public void updateMember(MemberDTO dto);
	public void deleteMember(MemberDTO dto);
	public MemberDTO selectOneMember(MemberDTO dto);
	public MemberDTO selectOneCheck(MemberDTO dto);
	public List<MemberDTO> selectAllMember(MemberDTO dto);
}
