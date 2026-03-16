package com.kh.variable;

public class Variable {
	// 깃깃
	// git add .
	// git commit -m "adads"
	// git push origin main

	
	// 변수 : Memory 97/100 (RAM)에 값을 저장하기 위한 "공간"

	public void 바지를저장하는기능() {
		String 옷장 = "긴바지";
		String 행거 = "반바지";
		System.out.println(행거);
	}

	// 변수를 사용했을 때 장점!
	
	// 점심메뉴 출력 프로그램(키오스크)
	public void findLunchMenu() {
		
		// 1. 메뉴들을 출력(메뉴명, 가격)
		// 2. 메뉴판을 보고 주문을 했다고 가정
		// 3. 내야할 금액을 출력
		
		System.out.println("--- 변수를 사용하기 전 ---");
		System.out.println("메뉴판 > ");
		System.out.println("1. 트리플 치즈버거 세트(15000)");
		System.out.println("2. 빅맥 세트(8397)");
		System.out.println("3. 슈슈버거 세트(9210)");
		
		// 1. 트리플치즈버거   4명
		// 2. 빅맥          9명
		// 3. 1955         4명
		
		System.out.println("----------------------");
		System.out.println("트리플치즈버거 4개 주문");
		System.out.println((15000 * 4) + "원 입니다.");
		System.out.println("빅맥 9개 주문");
		System.out.println((8397 * 9) + "원 입니다.");
		System.out.println("슈슈버거 4개 주문");
		System.out.println((9210 * 4) + "원 입니다.");
		System.out.println("----------------------");
		
		System.out.println("===========================");
		//System.out.println("변수를 사용해 봅시다!");
		
		// 메뉴명과 가격이라는 값을 담을 공간
		// 변수를 선언하고 변수공간에 값을 대입해서 사용!
		
		String setOne = "KH아카데미표 슈슈버거 세트";
		int setOnePrice = 9800;
		
		String setTwo = "KH아카데미표 비크매크 세트";
		int setTwoPrice = 8800;
		
		System.out.println("메뉴판 > ");
		System.out.println(setOne + ", 가격 : " + setOnePrice);
		System.out.println(setTwo + ", 가격 : " + setTwoPrice);
		
		System.out.println(setOne + ", 총 금액 : " + (setOnePrice * 10));
		System.out.println(setTwo + ", 총 금액 : " + (setTwoPrice * 5));
		
		// 변수를 사용해 봤더니
		// 재사용성이 높아짐
		// 동일한 값을 수정해야 할 때 한번만 수정하됨 - 실수확률이 줄어듬
		// 값의 의미를 부여할 수 있음 - 추후 유지보수에 좋음, 가독성이 좋음
	}
	
	// 변수를 사용하는 방법
	public void declareVariable() {
		
/*		변수 선언 방법
		 int price;
		 자료형(DataType) 변수 식별자;
*/		
		int price; // 변수 선언
		int a, b, c; // 권장하지 않는 방법
		/* 변수를 선언하고 난 뒤 처음 값을 대입하는 과정을 초기화(Initialzation)라고 함 : 준비과정
		   초기화를 통해 대입한 값을 초기값이라고 함
		   변수는 자신이 선언된 {Block} 에서만 사용 할 수 있음
		   local variable (지역변수)
		   
		   식별자(Identifier) : 클래스명, 메소드명, 변수명 등 개발자가 만들어서 이용하는 고유의 이름
		   
		   1. keyword(예약어)는 식별자로 사용할 수 없음
		   2. 공백은 포함할 수 없음
		   3. 대, 소문자를 구분하고 길이제한은 없음
		   4. 숫자, 특수문자($_) 사용 // 숫자 먼저 불가능
		   
		   - 개발자들끼리의 암묵적인 약속
		   영어만 사용
		   
		   1. 클래스 / 인터페이스 명명 규칙
		   - 첫 글자는 대문자
		   - 연결된 단어들의 첫 글자도 대문자로 표기
		   - 명사, 형용사를 서술적으로 연결해서 사용
		   -> WelcomToJavaWorld
		   
		   2. 변수 명명규칙
		   - 명사적 의미를 갖게 만들어 줌
		   - 첫 글자를 소문자로 표기, 연결된 단어들의 첫글자를 대문자로 표기
		   -> phoneNumber
		   
		   3. 메소드 명명 규칙
		   - 동사적 의미를 갖게 만들어줌
		   - 첫 글자를 소문자로 표기, 연결된 단어들의 첫글자를 대문자로 표기
		   - 메소드 식별자의 경우 식별자 뒤에 반드시 한 쌍의 "()"를 붙임
		   - 메소드에는 일반적으로 _를 사용하지 않음
		   -> join, signUp
		   
		   4. 상수 명명 규칙
		   - 모든 문자를 대문자로 표기
		   - 단어와 단어 사이를 _를 사용해서 구분하다.
		   -> LOGIN_OK
		   
		 */
		
		// 변수에 값을 대입하고 출력하기 위해서는 선언 및 초기화 작업이 필요함!!
		
		// 변수의 자료형
		// Java의 기본자료형, 원시자료형(Primitive Type)
		/*
		 * 1. 논리자료형(논리 값 : true / false )
		 * 변수선언 : 자료형 변수식별자;
		 * boolean isTrue;
		 * 지역변수(local variable)는 초기화를 하지 않으면 사용할 수 없음
		 * 
		 */
		boolean isTrue;
		//System.out.println(isTrue);
		isTrue = true; // 초기화
		System.out.println(isTrue);
		isTrue = false; // 변수에 값을 대입
		System.out.println(isTrue);

		/*
		 * 2. 숫자 자료형
		 * 
		 * 정수형(4가지)
		 * byte, short, int(기본형), long 형이 있음
		 * int 형 쓰세요
		 * long 형 사용할 때는 대입할 숫자뒤에 "L"을 붙임
		 * 
		 * 실수형
		 * float, double(기본형) 형이 있음
		 * float 형 사용하기 위해서는 할당할 숫자 뒤에 "F"를 붙여야함
		 * 
		 */
		
		// 2_1. 정수형
		byte byteNumber = 1;    // 1Byte
		short shortNumber = 2;  // 2Byte
		int intNumber = 3;      // 4Byte
		long longNumber = 4L;    // 8Byte
		
		// 2_2. 실수형
		float floatNumber = 2.22F;   // 4Byte
		double doubleNumber = 3.33;  // 8Byte
		
		// 선언과 동시에 초기화
		
		// 3. (단일)문자형
		char money = '돈';           // 2Byte
		
		// 4. 문자열 : 참조자료형
		String str = "문자열";
		
		System.out.println("논리 자료형 : " + isTrue);
		System.out.println("정수 자료형 : " + byteNumber);
		System.out.println("정수 자료형 : " + shortNumber);
		System.out.println("정수 자료형 : " + intNumber);
		System.out.println("정수 자료형 : " + longNumber);
		System.out.println("실수 자료형 : " + floatNumber);
		System.out.println("실수 자료형 : " + doubleNumber);
		System.out.println("문자 자료형 : " + money);
		System.out.println("문자열 자료형 : " + str);
		
		// System.out.print();
		// System.out.println();
		// System.out.printf();
		
		System.out.printf("논리 자료형 : %b \n정수 자료형 : %d \n", isTrue, intNumber );
		// %b : 논리 타입
		// %d : 정수 타입
		// %f : 실수 타입
		// %c, %C : (단일)문자 타입
		// %s, %S : 문자열

		System.out.printf("doubleNumber 값 : %.1f\n" , doubleNumber);
		System.out.println("===================================================");
		
		// 상수 -> 프로그래밍 언어
		// 값을 변경하지 않을 변수 공간
		
		final int START_YEAR = 1998;
		
	}
}
