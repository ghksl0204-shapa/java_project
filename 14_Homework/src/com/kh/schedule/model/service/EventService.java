package com.kh.schedule.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.schedule.model.vo.Event;

public class EventService {
	
	List<Event> events = new ArrayList();
	{
		events.add(new Event(7, 0, 7, 30, "기상", "집"));
		events.add(new Event(9, 0, 12, 0, "수업", "종로"));
		events.add(new Event(13, 0, 14, 0, "점심약속", "을지로"));
	}
	public List<Event> chechSchedule() {
		
		return events;
		
	}
	public boolean addSchedule(int startTime, int endTime, String title, String place) {
		
		return events.add(new Event());
		
	}
}
