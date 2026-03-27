package com.kh.sw.util;

import com.kh.sw.exception.SwitchBoomException;
import com.kh.sw.model.vo.Switch;

public class SwitchUtilImpl implements SwitchUtil {

	@Override
	public boolean toggle(Switch s) {
		boom();
		s.setOn(!s.isOn());
		return s.isOn();
	}
	
	/**
	 * 이 메소드는 스위치를 눌렀을 때 폭발 확률을 계산하는 메소드로
	 * 10%확률로 SwitchBoomException 이 발생함
	 * 
	 * @author 종로 501 박경환
	 * @since 2026-03-27
	 */
	private void boom() {
		// 90%확률로 아무문제없음
		// 10%확률로 대폭발
		
		int rand = (int)(Math.random() * 100 + 1);
		
		if(rand < 11) { // throw 개발자가 직접 예외를 발생시키는 구문
			throw new SwitchBoomException("스위치가 폭발을 일으켰습니다.");
		} 
	}
}
