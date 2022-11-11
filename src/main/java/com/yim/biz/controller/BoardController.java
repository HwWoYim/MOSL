package com.yim.biz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yim.biz.board.BoardDTO;
import com.yim.biz.board.BoardService;

@Controller
@SessionAttributes("data")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	// 모든 글 조회
	@RequestMapping(value="/board.do")
	public String board(BoardDTO bDTO, Model model) {
		List<BoardDTO> datas = boardService.selectAllBoard(bDTO);
		model.addAttribute("datas", datas);
		return "board.jsp";
	}
	
}
