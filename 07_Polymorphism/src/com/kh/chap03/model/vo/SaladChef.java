package com.kh.chap03.model.vo;

public class SaladChef extends Chef {

	public SaladChef(String name) {
		super(name);
	}

	@Override
	public void cooking() {
		System.out.println("샐러드 요리함");
	}

	@Override
	public void breakTime() {
		System.out.println("샐러드 쉰다");
		super.breakTime();
	}
	
	

}
