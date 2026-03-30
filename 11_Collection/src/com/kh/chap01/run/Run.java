package com.kh.chap01.run;

import com.kh.chap01.Integers;

public class Run {

	public static void main(String[] args) {

		// 정수값을 여러 개 다루고 싶음
		// 몇 개를 쓸지 모르겠음 그냥 많이 쓰고싶음
		/*
		int num1 = 10;
		int[] intergers = new int[??];
		*/
		Integers i = new Integers();
		i.add(3);
		i.add(5);
		i.add(6);
		i.add(8);
		i.add(45);
		i.add(50);
		i.add(60);
		
		System.out.println(i.get(3));
		System.out.println(i.get(6));
		System.out.println(i.get(4));
		System.out.println(i.get(2));
		
		
		
	}

}
