package com.kh.schedule.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.schedule.model.dto.EventDto;
import com.kh.schedule.model.vo.Event;

public class EventService {
	
	List<Event> events = new ArrayList<Event>();
	private int id = 0;
	
	{
		events.add(new Event(++id, 7, 0, 7, 30, "기상", "집"));
		events.add(new Event(++id, 9, 0, 12, 0, "수업", "종로"));
		events.add(new Event(++id, 13, 0, 14, 0, "점심약속", "을지로"));
	}
	
	public List<Event> chechSchedule() {
		return events;
	}
	
	public boolean addSchedule(EventDto dto) {
		
		if(validate(dto) != null) {
			return true;
		}
		return false; 
	}
	
	private EventDto validate(EventDto dto) {
		
		if(0 <= dto.getStartHour() && dto.getStartHour() <= 24 && 0 <= dto.getEndHour() && dto.getEndHour() <= 24) {
			if(0 <= dto.getStartMin() && dto.getStartMin() <= 60 && 0 <= dto.getEndMin() && dto.getEndMin() <= 60) {
				if((dto.getStartHour() * 100) + dto.getStartMin() < (dto.getEndHour() * 100) + dto.getEndMin()) {
					if(dto.getTitle().length() >= 2) {
						if(dto != null) {
							events.add(new Event(++id, dto.getStartHour(), dto.getStartMin(), dto.getEndHour(), dto.getEndMin(), dto.getTitle(), dto.getPlace()));
							return dto;
						}
					}
				}
			}
		}
		return null;
	}
	
	public List<Event> addSchedule(int idNo, EventDto dto) {
		
		List<Event> events = validate(idNo, dto);
		if(events != null) {
			return events;	
		}
		return null;
		
	}
	
	private List<Event> validate(int idNo, EventDto dto) {
		
		for(Event e : events) {
			if(e.getIdNo() == idNo) {
				events.remove(idNo - 1);
				events.add(idNo - 1, new Event(idNo, dto.getStartHour(), dto.getStartMin(), dto.getEndHour(),dto.getEndMin(),dto.getTitle(), dto.getPlace()));
				return events;
			}
		}
		return null;
	}
	
	public int completeSchedule(int selectNo) {
		
		for(Event e : events) {
			if(e.getIdNo() == selectNo) {
				e.setDone(true);
				return 1;
			}
		}
		return 0;
	}
	
	public boolean deleteSchedule(int selectNo) {
		
		for(Event e : events) {
			if(e.getIdNo() == selectNo) {
				events.remove(selectNo - 1);
				return true;
			}
		}
		return false; 
	}
}
