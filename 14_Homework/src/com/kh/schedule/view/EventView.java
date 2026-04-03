package com.kh.schedule.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.schedule.controller.EventController;
import com.kh.schedule.model.vo.Event;

public class EventView {

	private Scanner sc = new Scanner(System.in);
	private EventController ec = new EventController();
	
	public void mainMenu() {
		
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("일정관리 프로그램");
		
		System.out.println("아무키나 눌러주세요");
		sc.nextLine();
		
		while(true) {
			System.out.println();
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 일정확인하기");
			System.out.println("2. 일정추가하기");
			System.out.println("3. 일정수정하기");
			System.out.println("4. 일정완료하기");
			System.out.println("5. 일정삭제하기");
			System.out.println("0. 프로그램종료");
			System.out.print("선택할 메뉴 > ");
			
			String menu;
			menu = sc.nextLine();
			switch(menu) {
			case "1" : checkSchedule(); break;
			case "2" : addSchedule(); break;
				
				
			case "0" : System.out.println("프로그램을 종료합니다."); sc.close(); return;
			}
		}
	}
		


	private void checkSchedule() { // 수정
		
		System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
		System.out.println("오늘의 일정");
		
		List<Event> events = ec.checkSchedule();
		
		for(Event event : events) {
			System.out.println("시간 : " + event.getStartHour() + "시 " + event.getStartMin() + "분 ~ " + event.getEndHour() + "시 " + event.getStartMin() + "분");
			System.out.println("일정명 : " + event.getTitle());
			System.out.println("장소 : " + event.getPlace());
			System.out.println("완료여부 : " + event.isDone());
		}
		System.out.println("▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
		
	}
	
	private void addSchedule() {
		
		System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
		System.out.println("★일정 정보를 입력해주세요★");
		try {
			System.out.print("시작시간 : ");
			int startTime = sc.nextInt();
			sc.nextLine();
			System.out.print("종료시간 : ");
			int endTime = sc.nextInt();
			sc.nextLine();
			System.out.print("일정내용 : ");
			String title = sc.nextLine();
			System.out.print("장소 : ");
			String place = sc.nextLine();
			System.out.println("▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
			
			boolean result = ec.addSchedule(startTime, endTime, title, place);
			if(result) {
				System.out.println("일정 저장에 성공하였습니다.");
			} else {
				System.out.println("일정 저장에 실패했습니다.");
				return;
			}
		} catch(InputMismatchException e) {
			System.out.println("잘못된 시간을 입력하셨습니다.");
			sc.nextLine();
		} return;
				
	}
	

}
