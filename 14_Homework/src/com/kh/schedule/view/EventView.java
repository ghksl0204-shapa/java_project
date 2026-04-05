package com.kh.schedule.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.schedule.controller.EventController;
import com.kh.schedule.model.dto.EventDto;
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
			case "3" : updateSchedule(); break;	
			case "4" : completeSchedule(); break;
			case "5" : deleteSchedule(); break;
			case "0" : System.out.println("\n프로그램을 종료합니다."); sc.close(); return;
			default : System.out.println("잘못된 번호를 입력하셨습니다.");
			}
		}
	}

	private void checkSchedule() { // 수정
		
		System.out.println();
		System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
		System.out.println("오늘의 일정");
		
		List<Event> events = ec.checkSchedule();
		if(events != null) {
			for(Event event : events) {
				System.out.println("일정번호 : " + event.getIdNo());
				System.out.println("시간 : " + event.getStartHour() + "시 " + event.getStartMin() + "분 ~ " + event.getEndHour() + "시 " + event.getEndMin() + "분");
				System.out.println("일정명 : " + event.getTitle());
				System.out.println("장소 : " + event.getPlace());
				if(!event.isDone()) {
					System.out.println("완료여부 : 미완료");
				} else {
					System.out.println("완료여부 : 완료");
				}
			}
		}
		System.out.println("▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
	}
	
	private void addSchedule() {
		
		System.out.println();
		System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
		System.out.println("★일정 정보를 입력해주세요★");
		boolean result = inputContent();
		
		if(result) {
			System.out.println("일정 저장에 성공하였습니다.");
			System.out.println();
			checkSchedule();
		} else {
			System.out.println("일정 저장에 실패했습니다.");
			return;
		}
	}
	
	private void updateSchedule() {
		
		System.out.println();
		checkSchedule();
		System.out.println();
		System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
		System.out.print("수정할 일정번호를 입력해주세요 > ");
		int num = 0;
		
		try {
			num = sc.nextInt();
			sc.nextLine();
			System.out.println(num + "번의 일정을 수정합니다.");
			inputContent(num);
		} catch(InputMismatchException e) {
			System.out.println("일정번호의 숫자를 입력해주세요.");
		}
		System.out.println("▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
		checkSchedule();
	}
	
	private boolean inputContent() {
		
		try {
			System.out.println("시작시간 시 : (0~24)");
			int startHour = sc.nextInt();
			sc.nextLine();
			System.out.println("시작시간 분 : (0~60)");
			int startMin = sc.nextInt();
			sc.nextLine();
			System.out.println("종료시간 시 : (0~24)");
			int endHour = sc.nextInt();
			sc.nextLine();
			System.out.println("종료시간 분 : (0~60)");
			int endMin = sc.nextInt();
			sc.nextLine();
			System.out.println("일정내용 : (2글자 이상)");
			String title = sc.nextLine();
			System.out.println("장소 : ");
			String place = sc.nextLine();
			return ec.addSchedule(new EventDto(startHour, startMin, endHour, endMin, title, place));
		} catch(InputMismatchException e) {
			System.out.println("시간과 분을 숫자로 입력해주세요");
			sc.nextLine();
		}
		return false;
	}
	
	private List<Event> inputContent(int idNo) {
		
		try {
			System.out.println("시작시간 시 : (0~24)");
			int startHour = sc.nextInt();
			sc.nextLine();
			System.out.println("시작시간 분 : (0~60)");
			int startMin = sc.nextInt();
			sc.nextLine();
			System.out.println("종료시간 시 : (0~24)");
			int endHour = sc.nextInt();
			sc.nextLine();
			System.out.println("종료시간 분 : (0~60)");
			int endMin = sc.nextInt();
			sc.nextLine();
			System.out.println("일정내용 : (2글자 이상)");
			String title = sc.nextLine();
			System.out.println("장소 : ");
			String place = sc.nextLine();
			
			return ec.addSchedule(idNo, new EventDto(startHour, startMin, endHour, endMin, title, place));
			 
		} catch(InputMismatchException e) {
			System.out.println("시간과 분을 숫자로 입력해주세요");
			sc.nextLine();
		}
		return null;
	}
	
	private void completeSchedule() {
		
		System.out.println();
		checkSchedule();
		System.out.println();
		System.out.println("완료할 일정을 선택해주세요");
		int selectNo = 0;
		try {
			selectNo = sc.nextInt();
			sc.nextLine();
			System.out.println(selectNo + "번 일정 선택하셨습니다.");
			
			int result = ec.completeSchedule(selectNo);
			
			if(result == 1) {
				System.out.println("일정완료하였습니다.");
			} else {
				System.out.println("일정번호를 다시 확인하세요.");
			}
			checkSchedule();
		} catch(InputMismatchException e) {
			System.out.println("일정번호를 숫자로 입력해주세요");
			sc.nextLine();
			return;
		}
	}
	
	private void deleteSchedule() {
		
		System.out.println();
		checkSchedule();
		System.out.println();
		System.out.println("삭제할 일정을 선택해주세요");
		int selectNo = 0;
		try {
			selectNo = sc.nextInt();
			sc.nextLine();
			System.out.println(selectNo + "번 일정 선택하셨습니다.");
			
			boolean result = ec.deleteSchedule(selectNo);
			
			if(result) {
				System.out.println(selectNo + "번의 일정을 삭제하였습니다.");
			} else {
				System.out.println("삭제에 실패했습니다.");
			}
			checkSchedule();
		} catch(InputMismatchException e) {
			System.out.println("일정번호를 숫자로 입력해주세요");
			sc.nextLine();
			return;
		}
	}
}
