package com.yim.biz.board;

import java.util.List;

public interface BoardService {
	public void insertBoard(BoardDTO bDTO); // 전달 인자
	public void updateBoard(BoardDTO bDTO);
	public void deleteBoard(BoardDTO bDTO);
	public BoardDTO selectOneBoard(BoardDTO bDTO);
	public List<BoardDTO> selectAllBoard(BoardDTO bDTO);
}
