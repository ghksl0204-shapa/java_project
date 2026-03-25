package com.kh.chap03.run;

import com.kh.chap03.model.vo.KakaoWeptoon;
import com.kh.chap03.model.vo.NateWeptoon;
import com.kh.chap03.model.vo.NaverWeptoon;
import com.kh.chap03.model.vo.Weptoon;

public class Run {

	public static void main(String[] args) {

		Weptoon weptoon = new Weptoon("화산귀환", "LICO", "수요일");
		NaverWeptoon nw = new NaverWeptoon("전지적독자시점", "UMI", "수요일", "현금");
		KakaoWeptoon kw = new KakaoWeptoon("수린당성군전", "일링스", "수요일", true);
		
		System.out.println(weptoon.info());
		System.out.println(nw.info());
		System.out.println(kw.info());
		
		System.out.println(weptoon);
		System.out.println(weptoon.toString());
		// toString() : 해당 객체의 FullClassName @ 해당 객체의 주소값을 16진수 형태로 변환 : String
		// 모든 객체는 Object 클래스를 상속받고 있기 때문에
		// 모든 객체는 toString()를 호출할 수 있음
		
		NateWeptoon nwt = new NateWeptoon("재미있는 웹툰", "작가");
		System.out.println(nwt);
		
	}
}
