package com.kh.football.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.football.model.dao.FootballplayerDao;
import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.vo.FootballPlayer;

public class FootballService {
	// 정석적으로 가려면 DAO클래스가 존재해야하지만 그러면 규모가 너무 커지기 때문에 Service 단에서 저장
	private List<FootballPlayer> list = new ArrayList();
	private int id;
	
	{
		list.add(new FootballPlayer(++id, "손흥민", "공격수", 7));
		list.add(new FootballPlayer(++id, "호날도", "공격수", 7));
		list.add(new FootballPlayer(++id, "메시", "미드필더", 10));
	}
	
	// 뷰가 축구선수들 정보를 출력하기 위해서 건너건너 옴
	public List<FootballPlayer> selectAll() {
		return list; 
	}

	public void insertPlayer(String name, String position, int backNumber) {
		list.add(new FootballPlayer(++id, name, position, backNumber));
		
	}

	public FootballPlayer insertPlayer(FootballPlayerDto fpd) {
		// 비지니스로직 == 의사결정코드
		// 1. 이름이 두 글자 이상
		// 2. 포지션은 공격수/미드필더/수비수/골키퍼
		// 3. 등번호는 0이상
		
//		if(fpd != null && fpd.getName().length() >= 2) {
//			
//			// 아하! fpd 가 정상적으로 돌아오지 못했다면
//			// NullPointerException 이 발생할 수 있겠구나!
//			if("공격수".equals(fpd.getPosition()) ||
//			   "미드필더".equals(fpd.getPosition()) ||
//			   "수비수".equals(fpd.getPosition()) ||
//			   "골키퍼".equals(fpd.getPosition())) {
//				
//				if(fpd.getBackNumber() >= 0) {
//					// 기능 구현 시
//					// 어떻게 써야 할지 모르겠어요.
//					// 뭘 써야 할 지 모르겠어요.
//					// 사지선다 : 출력문 / 변수 / 조건문 / 반복문
//					// 값에 대한 유효성검증 == validate
//					list.add(new FootballPlayer(++id, fpd.getName(), fpd.getPosition(), fpd.getBackNumber()));
//					
//					return list.get(list.size() - 1);
//				}
//			}
		if(validateFootballPlayer(fpd)) {
			list.add(new FootballPlayer(++id, fpd.getName(), fpd.getPosition(), fpd.getBackNumber())); 
			return list.get(list.size() - 1);
		}
		return null;
	}

	public boolean idCheck(int id) {
		// 첫 번째 요소 비교해봐야지
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return true;
			}
		}
		return false;
	}

	public void updateFootballPlayer(int id, FootballPlayerDto fbp) {
		// 리스트에서 일치하는 id 를 찾아서
		// 인덱스값을 추출한 뒤
		// DTO객체의 필드값으로 VO객체를 새로 생성하면서
//		int index = 0;
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getId() == id) {
//				index = i;
//				break;
//			}
//		}
		int index = indexOf(id);
		// 유효성검사
		boolean result = validateFootballPlayer(fbp);
		if(result) {
			list.set(index, new FootballPlayer(id, fbp.getName(), fbp.getPosition(), fbp.getBackNumber()));
		}
	}
	
	private boolean validateFootballPlayer(FootballPlayerDto fpd) {
		if(fpd != null && fpd.getName().length() >= 2) {
			if("공격수".equals(fpd.getPosition()) ||
			   "미드필더".equals(fpd.getPosition()) ||
			   "수비수".equals(fpd.getPosition()) ||
			   "골키퍼".equals(fpd.getPosition())) {
				if(fpd.getBackNumber() >= 0) {
					return true;
				}
			}
		}
		return false;
	}

	public String deleteFootballPlayer(int id) {
		int index = indexOf(id);
		if(index != -1) {
			return list.remove(index).getName();
			
		}
		return null;
	}
	
	private int indexOf(int id) {
		int index = -1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void outputFootballPlayer() {
		
		new FootballplayerDao().outputFootballPlayer(list);
		
	}

	public List<FootballPlayer> findByKeyword(String keyword) {
		// 검색 -> 찾아
		// 사용자가 입력한 keyword가 포함된 FootballPlayer의 name 필드값을
		// 하나하나 순회하면서 전부다 검사해서 만약에 name 필드값에
		// 사용자가 입력한 keyword 가 포함되어있다면 이 VO 객체의 주소값을
		// 전부다 View 로 반환 해주어야하는데
		// 이게 하나도 없을 수 있는데 엄청 많을 수도 있음
		
		// boolean result = list.get(0).getName().contains(keyword);
		// System.out.println(result);
		
		List<FootballPlayer> searched = new ArrayList();
		
		for(FootballPlayer player : list) {
			if(player.getName().contains(keyword)) {
				searched.add(player);
			}
		}
		return searched;
		
	}
}