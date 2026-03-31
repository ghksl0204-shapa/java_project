package com.kh.chap04.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04.model.vo.Sandwich;

public class Run {

	public static void main(String[] args) {
		// Map
		// Key + Value 세트로 저장 
		
		// HashMap
		
		// key   -> 식별자      -> 샌드위치 이름
		// value -> 샌드위치 객체
		
		Map<String, Sandwich> subway = new HashMap();
		// 비어있는 맵에 요소를 추가해보기~~~
		
		// HashMap -> put()
		// key + value 함께 요소로 추가해야함
		
		// put(K key, V value) : Map에 Key + value 세트로 요소 추가하기
		
		subway.put("에그마요", new Sandwich("담백한 맛", "에그랑 마요"));
		subway.put("터키", new Sandwich("담백, 촉촉", "칠면조"));
		subway.put("참치", new Sandwich("담백, 퍽퍽", "참치"));
		// 순서보장 X
		
		System.out.println(subway);
		subway.put("매콤참치", new Sandwich("담백, 퍽퍽", "참치"));
		System.out.println(subway);
		// 중복저장을 허용함
		subway.put("매콤참치", new Sandwich("담, 퍽", "참치"));
		System.out.println(subway); // Key == 식별자 --> 중복이 발생하면 덮어씌움
		
		// 2. get(Object key) : Object
		// 인자로 전달된 key 값에 해당하는 value 값을 반환해주는 메소드
		// key 로 value 를 찾아옴
		
		System.out.println(subway.get("매콤참치"));
		System.out.println(subway.get("에그마요"));
		System.out.println(subway.get("없는거")); // 없는 key 값 전달 시 null 을 반환
		
		System.out.println(subway.size());
		System.out.println(subway.isEmpty());
		
		// replace(K key, V value) : Key로 요소를 찾아서 Value 값을 치환해줌
		subway.replace("에그마요", new Sandwich("아주 담백", "에그랑마요"));
		
		subway.replace("없는거", null);
		// 기존에 존재하지 않는 키값을 인자로 전달하면 추가하지 않음!! put 과의 차이점
		
		System.out.println(subway);
		
		// remove(Object key)
		subway.remove("터키");
		System.out.println(subway);
		System.out.println("========================================================");
		
		// Map 에 들어있는 모든 요소들에 순차적으로 접근해야 한다면??
		// addAll(Collection c) -> X
		// for loop 문 X, while X, Iterator X
		
		subway.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
		
		// ==============================================================================
		// ==============================================================================
		// Map 이 Key = Value 를 세트로 가지고 있음
		// Key 값들만 Set 으로 바꿔줘야함 -> Set 으로 바꾸면 Iterator 를 사용가능
		
		// 1) Map 의 Key 만들만 Set 으로 만들기
		Set<String> subSet = subway.keySet();
		// System.out.println(subSet);
		// 2) Set 을 Iterator 로 변경
		Iterator<String> itKey = subSet.iterator();
		// 3) 반복문 사용하기
		while(itKey.hasNext()) {
			String key = itKey.next();
			System.out.println(key + "===" + subway.get(key));
		}
		
		// entrySet()
		Set<Entry<String, Sandwich>> entrySet = subway.entrySet();
	}

}
