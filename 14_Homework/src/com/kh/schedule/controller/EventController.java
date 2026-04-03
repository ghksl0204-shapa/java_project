package com.kh.schedule.controller;

import java.util.List;

import com.kh.schedule.model.service.EventService;
import com.kh.schedule.model.vo.Event;

public class EventController {

	private EventService es = new EventService();
	
	public List<Event> checkSchedule() {

		return es.chechSchedule();
		
	}

	public boolean addSchedule(int startTime, int endTime, String title, String place) {
		
		return es.addSchedule(startTime, endTime, title, place);
		
	}

}
