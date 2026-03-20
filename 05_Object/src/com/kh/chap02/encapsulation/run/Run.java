package com.kh.chap02.encapsulation.run;

import java.util.Scanner;

import com.kh.chap02.encapsulation.model.vo.AutoSellingMachine;

public class Run {
	// 캡슐화 (Encapsulation)
	// 속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는 것
	// 정보은닉(information hiding)
	

	public static void main(String[] args) {
		// 객체 생성(new 생성자) == 메모리(heap)에 적재 
		// new AutoSellingMachine().hi(); 일회용
		AutoSellingMachine asm = new AutoSellingMachine();
		// 변수 공간에 대입될 수 있는 값은 딱 9가지(null값 제외)
		// 기본자료형 리터럴값, 주소값 - 기본자료형값인가 주소값(객체다)인가
		/*
		asm.name = "삼양라면";
		System.out.println(asm.name);
		asm.price = 1100;
		System.out.println(asm.price);
		asm.amount = 3;
		System.out.println(asm.amount);
		*/
		// asm.openMachine();
		
		// 필드가 외부에서는 보이지 않아서 오류가 발생!
		// 접근제한자를 public에서 private로 변경했기 때문
		// 직접접근이 불가능 -> 간접적으로 접근할 수 있는 방법을 만들어주어야함
		
		// getter / setter라는 메소드 구현하기
		// 라면가격 1500원으로 세팅하고 싶음
		asm.setPrice(1500);
		         // argument, 인자값, 인수
		asm.setName("삼양라면");
		asm.setAmount(10);
		
		// new AutoSellingMachine();
		asm.getName();
//		System.out.println(asm.getName());
		String name = asm.getName();
		System.out.println(name);
//		Scanner sc = new Scanner(System.in);
//		sc.nextLine();
		int amount = asm.getAmount();
		System.out.println(amount);
		
		int price = asm.getPrice();
		System.out.println(price);
		
		// 한 번에 필드값을 전달하고 싶은데?
		// 함수 == BuiltInFunction
		String info = asm.info();
		System.out.println(info);
		
	}

}
