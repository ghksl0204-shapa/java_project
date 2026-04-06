package com.kh.schedule.model.vo;

import java.util.Objects;

public class Event {

	private int idNo;
	private int startHour;
	private int startMin;
	private int endHour;
	private int endMin;
	private String title;
	private String place;
	private boolean done;
	
	public Event(int idNo, int startHour, int startMin, int endHour, int endMin, String title, String place) {
		super();
		this.idNo = idNo;
		this.startHour = startHour;
		this.startMin = startMin;
		this.endHour = endHour;
		this.endMin = endMin;
		this.title = title;
		this.place = place;
	}
	
	public Event(int idNo, int startHour, int startMin, int endHour, int endMin, String title, String place,
			boolean done) {
		super();
		this.idNo = idNo;
		this.startHour = startHour;
		this.startMin = startMin;
		this.endHour = endHour;
		this.endMin = endMin;
		this.title = title;
		this.place = place;
		this.done = done;
	}

	public int getIdNo() {
		return idNo;
	}

	public int getStartHour() {
		return startHour;
	}

	public int getStartMin() {
		return startMin;
	}

	public int getEndHour() {
		return endHour;
	}

	public int getEndMin() {
		return endMin;
	}

	public String getTitle() {
		return title;
	}

	public String getPlace() {
		return place;
	}

	public boolean isDone() {
		return done;
	}

	@Override
	public String toString() {
		return "Event [idNo=" + idNo + ", startHour=" + startHour + ", startMin=" + startMin + ", endHour=" + endHour
				+ ", endMin=" + endMin + ", title=" + title + ", place=" + place + ", done=" + done + "]";
	}
}
