package com.kh.chap07.model.vo;

public class Ticket {
	// 티켓을 세개까지 추가할 수 있음
	// 이용자는 추가되어있는 티켓을 발급받을 수 있음
	
	// 이코노미 티켓
	// 가격, 좌석번호, 서비스, 기내식
	
	// field
	private int price;
	private String seatNumber;
	private String service;
	private String meal;
	
	// constructor
	public Ticket() {}
	
	public Ticket(String meal, String service, String seatNumber, int price) {
		this.price = price;
		this.seatNumber = seatNumber;
		this.service = service;
		this.meal = meal;
	}
	
	// method
	
	public int getPrice() {
		return price;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public String getService() {
		return service;
	}
	public String getMeal() {
		return meal;
	}
	
	public String info() {
		String info = "기내식 : " + meal
					+ "\n서비스 : " + service
					+ "\n좌석 : " + seatNumber
					+ "\n비용 : " + price;
		return info;
	}
}
