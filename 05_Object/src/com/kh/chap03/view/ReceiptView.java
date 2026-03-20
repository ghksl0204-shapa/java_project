package com.kh.chap03.view;

import java.util.Scanner;

import com.kh.chap03.model.vo.Receipt;

// 화면 담당(입/출력)
public class ReceiptView {
	
	public void mainMenu() {
		// System.out.println("하하하하 안녕하세요~~");
		// 사용자에게 영수증 정보를 입력받고
		// 입력받은 영수증정보를 출력해주는 프로그램
		Scanner sc = new Scanner(System.in);
		
		Receipt receipt = new Receipt();
		// 1. 참조자료형
		// 클래스를 만든다는 행위 == 개발자가 자신에게 필요한 사용자 정의 자료형을 만들겠다.
		// 2. 여러 자료형에 각각 여러 개의 값을 보관가능 + 기능
		System.out.print("가게이름을 입력해주세요 > ");
		receipt.setStoreName(sc.nextLine());
		System.out.print("가격을 입력해주세요 > ");
		receipt.setPrice(sc.nextInt());
		sc.nextLine();
		System.out.print("결제수단을 입력해주세요 > ");
		receipt.setPayment(sc.nextLine());
		System.out.print("날짜를 입력해주세요 > ");
		receipt.setDate(sc.nextLine());
		
		System.out.println(receipt.info());
		
		sc.close();
	}

}
