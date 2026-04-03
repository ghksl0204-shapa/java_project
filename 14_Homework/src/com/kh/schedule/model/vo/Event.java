package com.kh.schedule.model.vo;

import java.util.Objects;

public class Event {

	private int startHour;
	private int startMin;
	private int endHour;
	private int endMin;
	private String title;
	private String place;
	private boolean done;
	
	public Event(int startHour, int startMin, int endHour, int endMin, String title, String place) {
		super();
		this.startHour = startHour;
		this.startMin = startMin;
		this.endHour = endHour;
		this.endMin = endMin;
		this.title = title;
		this.place = place;
	}

	public int getStartHour() {
		return startHour;
	}

	public void setStartHour(int startHour) {
		this.startHour = startHour;
	}

	public int getStartMin() {
		return startMin;
	}

	public void setStartMin(int startMin) {
		this.startMin = startMin;
	}

	public int getEndHour() {
		return endHour;
	}

	public void setEndHour(int endHour) {
		this.endHour = endHour;
	}

	public int getEndMin() {
		return endMin;
	}

	public void setEndMin(int endMin) {
		this.endMin = endMin;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Event [startHour=" + startHour + ", startMin=" + startMin + ", endHour=" + endHour + ", endMin="
				+ endMin + ", title=" + title + ", place=" + place + ", done=" + done + "]";
	}
	
	
	
	
}
