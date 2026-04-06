package com.kh.operator.controller;

import java.util.Scanner;

public class OperatorController {

	public void arithmetic() {
		// 산술연산자 -> 이항연산자, 우선순위
		// +, -, *, /
		// % : 모듈러(Modular) -> 나눗셈에서의 나머지를 구하는 연산
		int num1 = 10;
		int num2 = 3;

		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		System.out.println("num1 + num2 : " + num1 + num2); //추후확인
		// "num1 + num2 : 10"
		// "num1 + num2 : 103"
		System.out.println("num1 + num2 : " + (num1 + num2));
		int sum = num1 + num2;
		System.out.println("num1 + num2 : " + sum);
		System.out.print("num1 + num2 : ");
		System.out.println(num1 + num2);
		System.out.printf("num1 + num2 : %d\n", num1 + num2);

		System.out.println("num1 - num2 : " + (num1 - num2));
		System.out.println("num1 X num2 : " + (num1 * num2));
		System.out.println("num1 나누기 num2 : " + (num1 / num2));
		System.out.println("num1 mod num2 : " + (num1 % num2));

		// 조심해야할 부분
		// System.out.println(10 / 0);

		// 사탕 개수 구하기 프로그램 구현하기!
		// 메소드 : presentToStudent()
		// 사용자에게 값을 입력받으세요. <-- Scanner
		// 1. 나눠줄 학생의 수 <-- nextInt();
		// 2. 사탕 개수 <-- nextInt();

		// 1인당 받을 수 있는 사탕의 개수 : 사탕 개수 / 학생 수 <-- 산술 연산자
		// 남은 사탕의 개수 : 사탕 개수 % 학생 수 <-- 산술 연산자

		// 출력형식
		// 학생 한 명당 받을 수 있는 사탕 개수 : X개
		// 남은 사탕 개수 : X개

	}

	public void presentToStudent() {
		Scanner scan = new Scanner(System.in);

		System.out.print("나눠줄 학생의 수를 입력하세요 > ");
		int numberOfStudent = scan.nextInt();
		// System.out.println("나눠줄 학생의 수는 " + numberOfStudent + "명 입니다.");

		System.out.print("나눠줄 사탕의 개수를 입력하세요 > ");
		int numberOfCandy = scan.nextInt();
		// System.out.println("나눠줄 사탕의 수는 " + numberOfCandy + "개 입니다.");

		System.out.println("학생 한명당 받을 수 있는 사탕 개수 : " + (numberOfCandy / numberOfStudent));
		System.out.println("남은 사탕 개수 : " + (numberOfCandy % numberOfStudent));

	}

	public void inDecrease() {

		/*
		 * 증감연산자 : 단항연산자로 한 번에 1증가하거나 / 1감소하는 연산을 함
		 * 
		 * [ 표현법 ] ++ : 값을 1증가 시킴 -- : 값을 1감소 시킴
		 * 
		 * -> 증감을 먼저 할건지, 아니면 나중에 할건지에 따라 연산자의 위치가 달라짐
		 * 
		 * 전위 연산 : ++값, --값 --> 먼저 값을 증가 또는 감소시키고 나서 작업을 처리 후위 연산 : 값++, 값-- --> 먼저 값을
		 * 처리하고 나서 증가하거나 감소
		 */

      	/*  
	    int num = 10;
		System.out.println(num);
		num++;
		System.out.println(num);
		num--;
		System.out.println(num);
		System.out.println(num++); 추후확인
		System.out.println(num++);
		System.out.println(num);
        */
		int num = 10;
		int number = num++;
		
		System.out.println(num);
		System.out.println(number);
		
		int a = 20;
		int b = a--;
		
		System.out.println(a);
		System.out.println(b);
		
		int c = 20;
		int d = c++ * 3;
		
		System.out.println(c);
		System.out.println(d);
		
		int e = 10;
		int f = ++e;

		System.out.println(e);
		System.out.println(f);
		
		int g = 20;
		int h = ++g * 3;
		
		System.out.println(g);
		System.out.println(h);
	}
	
	public void compound() {
		// = 대입연산자
		// 산술연산자에 대입연산자를 합친 연산자 : 복합대입연산자
		// 자기자신과 해당 산술연산을 수행한 후 그 결과를 자기자신에게 다시 대입하는 용도
		// +=, -=, *=, /=, %=
		
		int endDay = 128;
		System.out.println(endDay);
		endDay = endDay - 1;
		System.out.println(endDay);
		endDay -= 1;
		System.out.println(endDay);
		
		long veryBigNumberCount = 100000000000L;
		veryBigNumberCount = veryBigNumberCount + 1234;
		veryBigNumberCount += 1234;
		
	}
	
	public void logicalNagation() {
		
		/*  논리 부정 연산자 : 논리값(true, false)을 반대로 바꿔주는 연산자
		 *  !
		 */
		System.out.println(!!!true);
		
	}
	
	public void comparison() {
		
		/* 관계 연산자, 비교 연산자
		 * 두 개의 값을 가지고 비교하는, 이항 연산자
		 * 비교연산을 한 결과 -> true, false
		 * 특정 조건을 제시할 수 있는 조건문에서 조건식으로 사용할 것
		 * 
		 * 1. 동등비교 : 일치함을 비교
		 *    a == b : a와 b가 일치합니까?
		 *    a != b : a와 b가 일치하지 않습니까?
		 *    
		 * 2. 대소비교 : 크고 작음을 비교
		 *    a < b : a가 b보다 작습니까?
		 *    a > b : a가 b보다 큽니까?
		 *    a <= b : a가 b보다 작거나 같습니까?
		 *    a >= b : a가 b보다 크거나 같습니까?
		 *    
		 * 결과값은 true / false
		 *    
		 */
		
		int firstNumber = 10;
		int secondNumber = 25;
		
		System.out.println(firstNumber < secondNumber);
		System.out.println(firstNumber == secondNumber);
		
		System.out.println("firstNumber가 짝 수 입니까?");
		// true가 출력이 되도록 연산을 해야함
		// 무슨값을 가지고 연산을 해야하는가! -> firstNumber
		// 무슨 연산을 해야하는가!         -> 비교연산
		// 짝수 특 2의 배수
		System.out.println(firstNumber % 2 == 0);
	}
	
	public void logical() {
		
		/* 논리 연산자 : 두 개의 논리값을 연산하는 연산자
		 * 
		 * [표현법]
		 * 논리값 논리연산자 논리값 -> 논리값
		 * 
		 * 종류
		 * 1. AND 연산(&&) : 논리값 && 논리값
		 * 좌항과 우항의 값이 모두 true여야만 최종 결과값이 true
		 * 
		 * 2. OR 연산(||) : 논리값 || 논리값
		 * 좌항과 우항의 값이 하나라도 true일 경우 최종 결과값이 true
		 * 
		 */
		
		// 계획
		// 1. 사용자에게 한 개의 정수값을 입력받음
		// 2. 입력한 정수 값이 0보다 크면서 짝수인지 연산
		// 3. 그리고나서 결과를 출력
		
		System.out.println("정수를 입력하세요 > ");
		Scanner scan = new Scanner(System.in);
		int inputNo = scan.nextInt(); // 추후 확인
		boolean result = ((inputNo > 0) && ((inputNo % 2) == 0));
		System.out.println("입력값이 0보다 크면서 짝수인가요? > " + result);
		
	}
	
	public void andOper() {
		// 사용자에게 정수값을 하나 입력받아서
		// 입력받은 정수값을 변수에 대입한 뒤
		// 콘솔창에 출력해보세요
		System.out.println("정수를 입력하세요 > ");
		Scanner scan = new Scanner(System.in);
		int inputNo = scan.nextInt();
		System.out.println("입력한 정수 : " + inputNo);
		
		// 사용자가 입력한 정수가 1 ~ 10사이의 값인지 확인하기
		boolean result = (1 <= inputNo) && (inputNo <= 10);
		System.out.println("입력한 정수가 1 ~ 10사이의 값인가? " + result);
	}
	
	public void orOper() {
		// 사용자에게 한 글자를 입력 받아서
		// 입력받은 글자가 'A' 또는 'a'인지 확인해서 출력하기
		System.out.println("한 글자를 입력해주세요 > ");
		Scanner scan = new Scanner(System.in);
		char letter = scan.nextLine().charAt(0);
		System.out.println("입력한 글자 : " + letter);
		// index : 0부터 시작
		boolean result = (letter == 'A' || letter == 'a');
		System.out.println("사용자가 입력한 값이 에이인가요? > " + result);
		
		
	}
	
	public void tip() {
		
		int num = 10;
		
		boolean result = false && (num > 0);
		boolean result2 = num < 0 && num == 10;
		// 왼쪽에 거짓확률이 높을 확률을 배치
		
	}
	
//	public void 
	
	/*  삼항 연산자 : 피 연산자가 3개
	 *  -> 3개의 값과 1개의 연산자로 구성됨(조건문의 형식으로 쓰임)
	 *  
	 *  [표현식]
	 *  조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
	 *  
	 *  조건문 : 값에 따라 연산을 처리하는 방식
	 *         결과값이 true일 경우 첫 번째 문장을 처리
	 *         결과값이 false일 경우 두 번째 문장을 처리
	 */
	
	// 치킨
	public void triple() { // 추후확인(삼항연산자)
		System.out.println("깐부치킨에 오신것을 환영합니다!");
		System.out.println("1. 회장님의 입맛 그대로 AI치킨");
		System.out.println("2. 바삭한 식스팩 치킨");
		System.out.println("3. 치킨의 근본 후라이드 치킨");
		// Ctrl + Shift + o (import 자동완성)
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하실 메뉴번호를 입력해주세요 > ");
		
		int menuNo = sc.nextInt();
		
		// 계획
		// 사용자가 메뉴번호로
		// 1번을 입력하면 회장님의 입맛 그래도 AI치킨을 주문하셨습니다.
		// 2번을 입력하면 바삭한 식스팩 치킨을 주문하셨습니다.
		// 3번을 입력하면 치킨의 근본 후라이드 치킨을 주문하셨습니다.
		// 1번, 2번, 3번이 아니면 없는 메뉴를 주문하셨습니다.
		// System.out.println(menuNo);
		
		// 메뉴번호가 1번일 시 AI머시기 1번이 아닐 시 없는 메뉴입니다 라고 출력
		String selected = menuNo == 1 ? "회장님의 입맛 그대로 AI치킨을 주문하셨습니다." 
				        : menuNo == 2 ? "바삭한 식스팩 치킨을 주문하셨습니다."
				        : menuNo == 3 ? "치킨의 근본 후라이드 치킨을 주문하셨습니다."
				        : "없는 메뉴를 주문하셨습니다.";
		
		System.out.println(selected);
		
	}
}
