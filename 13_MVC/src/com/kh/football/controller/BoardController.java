package com.kh.football.controller;

import java.util.List;

import com.kh.football.model.dto.BoardDto;
import com.kh.football.model.service.BoardService;
import com.kh.football.model.vo.Board;

public class BoardController {

	BoardService bs = new BoardService();

	public List<Board> findAll() {
		return bs.findAll();
	}

	public Board findById(int boardNo) {
		return bs.findById(boardNo);
	}

	public void saveBoard(BoardDto board) {
		bs.saveBoard(board);
	}

	public Board updateBoard(int boardNo, BoardDto board) {
		return bs.updateBoard(boardNo, board);
	}

	public int deletBoard(int boardNo) {
		return bs.deleteBoard(boardNo);
	}
	
}
