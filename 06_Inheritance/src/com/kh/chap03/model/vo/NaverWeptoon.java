package com.kh.chap03.model.vo;

public class NaverWeptoon extends Weptoon {

	private String payment;

	public NaverWeptoon() {
		super();
	}

	public NaverWeptoon(String title, String author, String day, String payment) {
		super(title, author, day);
		this.payment = payment;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	
}
