package com.kh.chap03.run;

import com.kh.chap03.controller.Controller;
import com.kh.chap03.controller.Cooking;
import com.kh.chap03.controller.Pasta;
import com.kh.chap03.model.vo.Chef;
import com.kh.chap03.model.vo.MainChef;
import com.kh.chap03.model.vo.SaladChef;

public class Run {

	public static void main(String[] args) {

		MainChef mc = new MainChef("이승철");
		mc.cooking();
		SaladChef sc = new SaladChef("고길동");
		sc.cooking();
		// Chef c = new Chef();
		//추상클래스로 선언되었기 때문에 객체생성이 불가능함
		
		Chef[] c = {mc, sc}; // 다형성 적용가능
		for(int i = 0; i < c.length; i++) {
			c[i].cooking();
		}
		
		Controller pc = new Controller();
		pc.pastaCooking();
		
		Cooking cook = new Pasta();
		cook.cooking(); // Cooking 클래스에 의존
		
		// 다형성 : 부모 타입자료형으로 여러 자식객체를 다룰 수 있음
		// 정보은닉하려고
		// 의존성주입할 때 처음부터 다시 설명해드리겠습니다.
		
		/*
		 * 소프트웨어 개발자들의 목표
		 * 
		 * 코드 수정이 쉬움, 기능 추가가 쉬움, 기능 교체도 쉬움
		 * 
		 * 객체지향언어
		 */
	}

}
