package com.kh.chap03.model.vo;

public class Receipt {

	// Field
	// 가격, 결제방법, 상점명, 날짜
	private int price;
	private String payment;
	private String storeName;
	private String date;
	
	// 생성자부
	
	// Method
	// getter() / setter() / info()
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String info() {
		String info = "가게이름 : " + storeName
				    + "\n금액 : " + price
				    + "\n결제수단 : " + payment
				    + "\n결제일시 : " + date;
		return info;
	}
	
	
	
}
