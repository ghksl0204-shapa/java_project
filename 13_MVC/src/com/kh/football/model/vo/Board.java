package com.kh.football.model.vo;

import java.util.Date;
import java.util.Objects;

/**
 * 
 */
public class Board {

	private int boardNo;			
	private String boardTitle;		
	private String boardContent;	
	private String boardWriter;
	private String password;
	private String createDate;
	
	public Board(int boardNo, String boardTitle, String boardContent, String boardWriter, String password,
			String createDate) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.password = password;
		this.createDate = createDate;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public String getPassword() {
		return password;
	}

	public String getCreateDate() {
		return createDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(boardContent, boardNo, boardTitle, boardWriter, createDate, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		return Objects.equals(boardContent, other.boardContent) && boardNo == other.boardNo
				&& Objects.equals(boardTitle, other.boardTitle) && Objects.equals(boardWriter, other.boardWriter)
				&& Objects.equals(createDate, other.createDate) && Objects.equals(password, other.password);
	}
	
}
