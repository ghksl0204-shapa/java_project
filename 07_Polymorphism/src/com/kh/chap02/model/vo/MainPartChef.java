package com.kh.chap02.model.vo;

public class MainPartChef extends Chef{

	public MainPartChef(String name) {
		super(name);
	}
	@Override
	public void cooking() {
		System.out.println(getName() + "소고기 굽습니다~");
	}
}
