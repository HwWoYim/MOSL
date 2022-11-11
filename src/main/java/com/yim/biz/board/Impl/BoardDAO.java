package com.yim.biz.board.Impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yim.biz.board.BoardDTO;

// 해당 클래스를 root container에 빈(bean)객체로 생성해주는 어노테이션
// @Component를 사용해도 되지만 가속성을 위해 @Repository사용
	@Repository("boardDAO")
public class BoardDAO {
	// 필요한 의존 객체의 [타입]에 해당하는 빈을 찾아 주입한다. : 해당 클래스에서는 필드 주입을 하는 것
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// 글 추가하기
	public void insertBoard(BoardDTO bDTO) {
		mybatis.insert("BoardDAO.insertBoard", bDTO);
	}
	
	// 글 수정하기
	public void updateBoard(BoardDTO bDTO) {
		mybatis.update("BoardDAO.updateBoard", bDTO);
	}
	
	// 글 삭제하기
	public void deleteBoard(BoardDTO bDTO) {
		mybatis.delete("boardDAO.deleteBoard", bDTO);
	}
	
	// 글 상세 보기
	public BoardDTO selectOneBoard(BoardDTO bDTO) {
		return mybatis.selectOne("BoardDAO.selectOneBoard", bDTO);
	}
	
	// 글 목록 조회
	public List<BoardDTO> selectAllBoard(BoardDTO bDTO){
		return mybatis.selectList("BoardDAO.selectAllBoard", bDTO);
	}
}
