package com.kh.chap03.model.vo;

public class Weptoon {
	
	private String title;
	private String author;
	private String day;
	
	public Weptoon() {
		super();
	}
	
	public Weptoon(String title, String author, String day) {
		super();
		this.title = title;
		this.author = author;
		this.day = day;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	public String info() {
		String info = "웹툰정보"
					+ "\n웹툰제목 : " + title
					+ "\n작가 : " + author
					+ "\n요일 : " + day;
		return info;
	}

	
	
}
