package com.kh.chap02.model.vo;

public class RpgGame extends Game {

	private int maxLevel;

	public RpgGame() {
		super();
	}

	public RpgGame(String gameName, String publisher, int maxLevel) {
		super(gameName, publisher);
		this.maxLevel = maxLevel;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}
	
	// 메소드를 상속받았는데 마음에 안듭니다! 발전을 시키고 싶음
	// 다시 쓸 수 있음 --> 재정의
	public String info() {
		return super.info() + ", 최대 레벨 : " + maxLevel;
		
	}
}
