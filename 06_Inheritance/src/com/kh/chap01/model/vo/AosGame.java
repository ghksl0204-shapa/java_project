package com.kh.chap01.model.vo;

public class AosGame {

	private String gameName;
	private String publisher;
	private int characterCount;
	
	// Alt + Shift + s > o > Alt + d > Alt + g
	public AosGame() {
	}
	// Alt + Shift + s > o > Alt + g
	public AosGame(String gameName, String publisher, int characterCount) {
		this.gameName = gameName;
		this.publisher = publisher;
		this.characterCount = characterCount;
	}
	
	// Alt + shift + s > r 
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getCharacterCount() {
		return characterCount;
	}
	public void setCharacterCount(int characterCount) {
		this.characterCount = characterCount;
	}
	
	public String info() {
		return "게임정보 [게임명 : " + gameName
				+ ", 운영사 : " + publisher
				+ ", 캐릭터 수 : " + characterCount + "]";
	}
}
