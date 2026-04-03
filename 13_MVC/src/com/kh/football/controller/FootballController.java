package com.kh.football.controller;

import java.util.List;

import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.service.FootballService;
import com.kh.football.model.vo.FootballPlayer;

public class FootballController {
	
	private FootballService fs = new FootballService();
	// 뷰에서 축구선수들 값 출력하기 위해 호출하는 메소드
	public List<FootballPlayer> selectAll() {
		List<FootballPlayer> list = fs.selectAll();
		return list;
	}
	
	// 뷰에서 축구선수를 추가하고 싶을 때 호출하는 메소드
	public void insertPlayer(String name, String position, int backNumber) {
		// 귀찮음 이슈
		// 1. FootballPlayer VO 탈락 -> 생성자! 인자값 부족
		// 2. ArrayList O           -> 인덱스를 알아야함
		// 3. HashMap  O            -> <String, Object>
		// 4. Object[] O            -> 이거 쓸바엔 2번씀
		// fs.insertPlayer(name, position, backNumber);
	}
	
	public FootballPlayer insertPlayer(FootballPlayerDto fpd) {
		return fs.insertPlayer(fpd);
	}

	public boolean idCheck(int id) {
		return fs.idCheck(id);
	}

	public void updateFootballPlayer(int id, FootballPlayerDto fbp) {
		fs.updateFootballPlayer(id, fbp);
	}

	public String deleteFootballPlayer(int id) {
		return fs.deleteFootballPlayer(id);
	}
	
	public void outputFootballPayer() {
		fs.outputFootballPlayer();
	}

	public List<FootballPlayer> findByKeyword(String keyword) {
		return fs.findByKeyword(keyword);
	}

}
