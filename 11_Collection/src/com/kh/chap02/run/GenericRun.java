package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.Box;
import com.kh.chap02.model.vo.Plant;

public class GenericRun {
	
	public static void main(String[] args) {
	
		// List<String> list = new ArrayList();
		/*
		list.add("하하");
		list.add(123);
		list.add(true);

		// 꺼낼 떄 불편함
		String text = (String)list.get(0);
		String text2 = (String)list.get(1);
		*/
		// <제네릭> 타입을 지정해서 컴파일 시점에서 체크하는 것
		// list.add("하하");
		// list.add(123);
		// String str = list.get(0);
		/*
		StringBox sb = new StringBox();
		sb.set("하하");
		System.out.println(sb.get());
		
		IntegerBox ib = new IntegerBox();
		ib.setItem(123);
		System.out.println(ib.getItem());
		*/
		Box<String> sb = new Box();
		sb.setItem("하하");
		// sb.setItem(123);
		System.out.println(sb.getItem());
		
		Box<Integer> ib = new Box();
		ib.setItem(123);
		System.out.println(ib.getItem());
		
		Box<Plant> pb = new Box();
		pb.setItem(new Plant("개나리", "활엽수"));
		System.out.println(pb.getItem());
		
		new ArrayList().get(0);
		
		// 개발자들끼리의 암묵적인 약속
		// E -> Element --> 요소로 사용할 땐 E로 적자
		// T -> Type ==> 아무타입이나 OK
		// K -> Key ==> Map 의 Key 타입
		// V => Value --> Map 의 Value 값
		// N -> Number --> 숫자타입
		// R -> Return ==> 반환타입
		
		List<Plant> plants = new ArrayList();
		
		plants.add(new Plant("관엽", "폴리샤스"));
		plants.add(new Plant("관엽", "산세베리아"));
		
		Plant p = plants.get(0);
		
		for(Plant plant : plants) {
			System.out.println(plant);
		}
		// 1. 다룰 요소의 타입을 제한할 수 있음 => 실수를 줄일 수 있음, 무결성을 지킬 수 있음
		// 2. 매 번 형변환하는 절차를 없앨 수 있음 -> 코드 작성할 때 편함
		// Generic 사용권장 , 타입 2개 쓸 때 List 를 2개 쓰자
		
	}

}
