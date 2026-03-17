package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionElse {
	
	/* if ~ else 
	 * 
	 * [표현법]
	 * if(조건식) {
	 *     조건식의 결과가 true일 경우 실행할 코드 - a
	 * } else {
	 *     조건식의 결과가 false일 경우 실행할 코드 - b
	 * }
	 * -> 조건식의 결과가 true일 경우 a를 실행
	 * -> 조건식의 결과가 false일 경우 b를 실행
	 */
	public void method1() {
		
		// 핸드폰 번호 뒷자리 입력받아서
		// 당첨자 번호랑 같으면 추카포카 아니면 다음기회에
		// 당첨 핸드폰 번호 뒷자리 -> 7777
		// 사용자에게 핸드폰 번호 뒷자리를 입력받아서
		// 당첨 핸드폰번호와 일치한다면 추카포카를 출력해주고
		// 일치하지 않는다면 다음기회에 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("핸드폰 번호 뒷부분 네자리를 입력해주세요 > ");
		String phoneNo = sc.nextLine();  // *0으로 시작하는 경우 int 안됨* , *문자열값을 비교하는 기능*
		// System.out.println(phoneNo);
		
		if(phoneNo.equals("7777")) { // 동등비교연산자의 경우 기본타입 자료형 8개끼리만 사용가능하기 때문에 
			                         // equals()라는 메소드를 호출해서 비교해주어야함
			                         // 문자열 값이 일치할 경우 true를 반환 일치하지 않을경우 false를 반환
			System.out.println("축하합니다 백만원 당첨입니다.");
		} else {
			System.out.println("다음기회에~~~");  // 조건검사를 한번만 한다
			// if문의 조건식 결과가 true일 경우 -> if  scope가 끝나면 else Scope를 건너뜀
			// if문의 조건식 결과가 false일 경우 -> if Scope를 건너뛰고 else Scope로 진입
			// 불필요한 연산이 줄어든다! -> 처리속도가 향상됨!
		}
		
		/* if ~ else if문
		 * [표현법]
		 * 
		 * if(조건식1) {
		 * 		조건식1이 true일 경우 실행할 코드;
		 * } else if(조건식2) {
		 * 		조건식2이 true일 경우 실행할 코드;
		 * } else if(조건식3) {
		 * 		조건식3이 true일 경우 실행할 코드;
		 * } else {
		 * 		모든 조건식 false일 경우 실행할 코드;
		 * }
		 * 
		 */
	}
	
	public void method2() {
		
		//핸드폰 뒷자리를 입력받아서 1등, 2등, 3등, 아쉽지만 미당첨 출력해주기
                           //7777, 1111, 9999 		
		// 당첨인데 너무 안신나는 것 같아요 조금 더 신나고 싶습니다.
		String message = "등 당첨 축하드려요 ☆★";
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 번호 뒷부분 네자리를 입력해주세요 > ");
		String phoneNo = sc.nextLine();
		// System.out.println("사용자가 입력한 번호 : " + phoneNo);
		
		if(phoneNo.equals("7777")) {
			System.out.println("1" + message);
		} else if(phoneNo.equals("1111")) {
			System.out.println("2" + message);
		} else if(phoneNo.equals("9999")) {
			System.out.println("3" + message);
		} else {
			System.out.println("아쉽지만 다음기회에~");
		}
	}

	public void ageCheck() {
		
		// 사용자에게 나이(정수)를 입력받고
		// 입력받은 나이에 따라서 각기 다른 내용을 출력해주세요.
		// 1~12 : 어린이입니다.
		// 13~17 : 청소년입니다.
		// 18 ~ : 성인입니다.
		// 0, - : 잘못입력하셨습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 > ");
		int age = sc.nextInt();
		// System.out.println("입력한 나이 : " + age);
		if(age < 1) {                              // 잘못, 성인, 어린이, 청소년 순
			System.out.println("잘못입력하셨습니다.");
		} else if(age < 13) { 
			System.out.println("어린이입니다.");
		} else if(age < 18) {
			System.out.println("청소년입니다.");
		} else {
			System.out.println("성인입니다.");
		}
		
		// 1. 어떤값을 사용할 것인가 (age) / 비교대상
		// 2. 어떤 연산을 할 것인가       / 대소비교(권장), 동등비교
		
		/*
		if(age < 1) {                              // 쓸데없는 연산의 숫자를 줄이고, 가독성을 높인다
			System.out.println("잘못입력하셨습니다.");
		} else if(age > 19) { 
			System.out.println("성인입니다.");
		} else if(age < 13) {
			System.out.println("어린이입니다.");
		} else {
			System.out.println("청소년입니다.");
		}
		*/
	}
}
