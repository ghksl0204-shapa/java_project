package com.kh.chap04.controller;

/*
 * Field == 멤버변수 == 인스턴스변수 == 속성
 * 
 * class 를 구성하는 요소 중 하나
 * data 를 저장하기 위한 역할(변수)
 * class block 안에 존재
 * 
 * field(멤버변수, 인스턴스 변수)
 * 
 * 생성시점 -> new 키워드를 사용해서 해당 객체를 생성하는 순간 heap 에 할당
 * 소멸시점 -> 객체가 소멸 될 때 -> GC 이 동작을 안하면 OOM(Out of Memory) 발생
 * 
 * static field(class 변수)
 * 
 * static 이라는 예약어가 붙어있는 필드
 *         -> ClassLoader
 * 생성시점 -> static 필드 호출 시점 MetaSpace(static)에 올라감
 * 소멸시점 -> 프로그램(block) 이 종료되면 소멸 -> ClassLoader 를 GC가 소멸시키는 시점
 * 
 * 지역변수
 * 
 * 생성시점 -> 특정 영역( {} ) 내부에서 선언되는 시점에 memory 영역에 할당 -> stack
 * 소멸시점 -> 특정 영역( {} )가 종료될 때 -> stack memory 에서 소멸되는 시점
 */

public class FieldController {

	public static String str = "static";
	// static 키워드는 공유의 목적이 강하다
	// 프로그램 구동 중 계속 값을 사용하기 위해 씀
	public static final String JAVA_VERSION = "21"; // public static final 세트
	// public final static  
	
	// static : 프로그램 전체에서 공유
	// final : 절대 못바꿈
	// 무조건 선언과 동시에 초기화를 진행 해야함!
	
	public int global; // field
	
	public void checkVariable(int parameter) {
		
		int local = 1; // 지역변수
		
		System.out.println(global);    // field
		System.out.println(local);     // local
		System.out.println(parameter); // parameter(local)
		
	}
	
}
