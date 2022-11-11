package com.yim.biz.board.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yim.biz.board.BoardDTO;
import com.yim.biz.board.BoardService;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDAO;

	// 글 추가하기
	@Override
	public void insertBoard(BoardDTO bDTO) {
		boardDAO.insertBoard(bDTO);
	}
	
	// 글 수정하기
	@Override
	public void updateBoard(BoardDTO bDTO) {
		boardDAO.updateBoard(bDTO);
	}

	// 글 삭제하기
	@Override
	public void deleteBoard(BoardDTO bDTO) {
		boardDAO.deleteBoard(bDTO);
	}

	// 글 상세보기
	@Override
	public BoardDTO selectOneBoard(BoardDTO bDTO) {
		return boardDAO.selectOneBoard(bDTO);
	}

	// 글 목록 조회하기
	@Override
	public List<BoardDTO> selectAllBoard(BoardDTO bDTO) {
		return boardDAO.selectAllBoard(bDTO);
	}

	
	
}
