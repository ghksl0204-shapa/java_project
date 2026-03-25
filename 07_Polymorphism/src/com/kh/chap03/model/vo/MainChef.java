package com.kh.chap03.model.vo;

public class MainChef extends Chef {

	public MainChef(String name) {
		super(name);
	}

	@Override
	public void cooking() {
		System.out.println("메인 요리합니다~~");
	}

	@Override
	public void breakTime() {
		System.out.println("쉬는시간");
		super.breakTime();
	}
	
	

	
}
