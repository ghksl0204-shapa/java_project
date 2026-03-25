package com.kh.chap03.model.vo;

public class KakaoWeptoon extends Weptoon {

	private boolean Free;

	public KakaoWeptoon() {
		super();
	}

	public KakaoWeptoon(String title, String author, String day, boolean free) {
		super(title, author, day);
		Free = free;
	}

	public boolean isFree() {
		return Free;
	}

	public void setFree(boolean free) {
		Free = free;
	}
	
	
	
}
