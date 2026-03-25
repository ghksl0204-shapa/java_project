package com.kh.chap03.controller;

public class Pasta extends Cooking {

	public Pasta() {
		super();
	}
	
	private void pastaCooking() {
		System.out.println("파스타 요리해야지~~");
	}
	
	@Override
	public void cooking() {
		pastaCooking();
	}
	
	

}
