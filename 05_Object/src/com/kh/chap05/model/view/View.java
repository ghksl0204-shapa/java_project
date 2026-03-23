package com.kh.chap05.model.view;

import com.kh.chap05.model.vo.Member;

public class View {
	
	public void memberMenu() {
		
		Member member = new Member();
		System.out.println(member.info());
		// member.setUserPwd(1111);
		Member member1 = new Member("user01");
		System.out.println(member1.info());
		
		Member member2 = new Member("user02", "pass02");
		System.out.println(member2.info());
		
		Member member3 = new Member("user02", "pass02", "바보");
		System.out.println(member3.info());
	}

}
