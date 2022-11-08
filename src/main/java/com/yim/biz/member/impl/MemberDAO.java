package com.yim.biz.member.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yim.biz.member.MemberDTO;

// 해당 클래스를 root container에 빈(Bean)객체로 생성해주는 어노테이션
// @Component를 사용해도 되지만 가속성을 위해 @Repository사용
@Repository("memberDAO")
public class MemberDAO {
	// 필요한 의존 객체의 [타입]에 해당하는 빈을 찾아 주입 : 해당 클래스에서는 필드 주입
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertMember(MemberDTO dto) {
		mybatis.insert("MemberDAO.insertMember", dto);
	}
	
	public void updateMember(MemberDTO dto) {
		mybatis.update("MemberDAO.updateMember", dto);
	}
	
	public void deleteMember(MemberDTO dto) {
		mybatis.delete("MemberDAO.deleteMember", dto);
	}
	
	public MemberDTO selectOneMember(MemberDTO dto) {
		return mybatis.selectOne("MemberDAO.selectOneMember", dto);
	}
	
	public List<MemberDTO> selectAllMember(MemberDTO dto){
		return mybatis.selectList("MemberDAO.selectAllMember", dto);
	}
}
