package com.kh.schedule.controller;

import java.util.List;

import com.kh.schedule.model.dto.EventDto;
import com.kh.schedule.model.service.EventService;
import com.kh.schedule.model.vo.Event;

public class EventController {

	private EventService es = new EventService();
	
	public List<Event> checkSchedule() {
		return es.chechSchedule();
	}

	public boolean addSchedule(EventDto eventdto) {
		return es.addSchedule(eventdto);
	}

	public List<Event> addSchedule(int idNo, EventDto eventdto) {
		return es.addSchedule(idNo, eventdto);
	}

	public int completeSchedule(int selectNo) {
		return es.completeSchedule(selectNo);
	}

	public boolean deleteSchedule(int selectNo) {
		return es.deleteSchedule(selectNo);
	}
	
}
