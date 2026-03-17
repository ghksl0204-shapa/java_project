package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionIf {
	
	/* (단일) if문
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식(t/f)) {
	 *   조건식이 true일 경우 실행하고자 하는 코드;
	 * }
	 * 
	 * -> 조건식의 결과값이 true일 경우 : if문 Scope 안의 코드가 수행
	 * -> 조건식의 결과값이 false일 경우 : if문 Scope를 건너뜀!
	 * 
	 */

	public void method1() {
		// System.out.println("run 확인");
		
		if(0 < 1) {
			System.out.println("0이 1보다 작습니다.");
		}
		
		// if문의 조건식 자리에는 결론적으로 true아니면 false값이 들어가도록 만들어야함!
		if(true) { //조건검사
			System.out.println("이 코드는 if문을 만나면 무조건 수행되는 코드");
		}
		
		if(false) {
			System.out.println("이 코드는 if문을 만나면 절대 동작하지 않는 코드");
		}
	}
	
	public void quiz() {
		// 문제를 출력해준 뒤
		// 사용자에게 o 또는 x 를 입력받아서
		// 정답입니다~ / 오답입니다~를 출력해주는 quiz 프로그램
		int correctCount = 0;
		int wrongCount = 0;

		
		System.out.println("문제 : 고양이는 호랑이과 일까요?");
		Scanner sc = new Scanner(System.in);
		System.out.println("정답을 o 또는 x로 입력해주세요 > ");
		char answer = sc.nextLine().charAt(0);  // o / x
		// 1. 무슨 값을 가지고
		// 2. 무슨 연산을 하지
		// 1절 소문자로 체크하기 -> 대문자로 입력해도 정답 오답 처리해주세요
		// 2절 사용자가 입력한 값 == answer / 'X', 'O'
		// 무슨 연산? -> ==
		// -> 피드백 -> 정답인데.... 너무 안신난다, 오답인데 너무 신난다 (코드중복은 유지보수를 어렵게함)
		// -> o랑 x랑 이거 두개만 입력해야하는데 넷 다 아니면 메시지를 띄워주는 ~~~~
		if(answer == 'x' || answer == 'X') { //answer == 'x' || 'X' 안됨 *추후확인*
			System.out.println("정답입니다~!!!");
			correctCount++;
		}
		if(answer == 'o' || answer == 'O') {
			System.out.println("오답입니다~ㅠㅠ");
			wrongCount++;
		}
		if(answer != 'x' && answer != 'X' && answer != 'o' && answer !='O') {
			System.out.println("O 또는 X를 입력해주세요.");
		}
		
		System.out.println("문제 : 여우는 개과일까요?");
		System.out.println("정답을 o / x로 입력해주세요 > ");
		answer = sc.nextLine().charAt(0);
		
		if(answer == 'o' || answer == 'O') {
			System.out.println("정답입니다 ☆");
			correctCount++;
		}
		if(answer == 'x' || answer == 'X') {
			System.out.println("오답입니다 ★");
			wrongCount++;
		}
		if(answer != 'x' && answer != 'X' && answer != 'o' && answer !='O') { //*전체 부정가능*
			System.out.println("O 또는 X를 입력해주세요.");
		}
		// 경우의 수 사용자가 입력한 값이 x, X, o, O일 경우 --> 빠짐
		// 1. 무슨 값을 가지고? answer / xXoO 
		// 2. 무슨 연산? != 
		// 총 몇 문제 풀었고 -> 정답은 몇 개 -> 오답은 몇개
		// 저장 -> 출력
		System.out.printf("퀴즈 끝 ~ 정답 %d개, 오답 %d개 입니다!", correctCount, wrongCount);
  	}
}
