package com.kh.chap02.encapsulation.model.vo;

public class AutoSellingMachine { // 단 한개의 제품을 파는 자판기

	// Field
	/*
	 * 값을 담는 부분 = 변수필요
	 * 
	 * 필드 == 멤버변수
	 * 
	 * 객체들이 가져야할 공통적인 속성을 기술해 놓는 것
	 * 
	 * 접근제한자 자료형 필드식별자 
	 */
	
	// 자판기 == 제품이름, 제품가격, 수량
	private String name;
	private int price;
	private int amount;
	
	/*
	 * Dependency(의존) 관계 정말정말 중요 ★
	 * 
	 */
	private void checkAmount() {
		System.out.println("재고는 총 " + amount + "개 입니다.");
	}
	private void sellingProduct() {
		amount -= 1;
	}
	private void insert() {
		amount += 3;
	}
	
	public void openMachine() {  //결합도를 낮추다
		checkAmount();
		insert();
		sellingProduct();
		checkAmount();
		
	}
	
	// 객체의 속상 값을 기록 및 수정하는 기능의 메소드 : setter()
	
	/*
	 * VO -> ★★setter 메소드를 구현하지 않음★★
	 * DTO -> setter 를 구현해서
	 * 
	 *  DTO를 배우려면 한달 반정도는 더 수업을 해야함
	 *  그래서 DTO배울 때 까지만 VO에 setter 를 구현해서 사용하겠음
	 *  
	 *  setter 만들기 규칙
	 *  
	 *  1. setter 메소드는 외부에서 접근이 가능해야 하기 때문에 접근제한자 public 을 이용
	 *  2. set 필드명으로 식별자를 작성하며 낙타봉표기법(camelCase)를 꼭 지키도록한다!!!
	 *  void returnType
	 *  하나의 메소드는 하나의 기능만을 수행해야한다.
	 */
	                    // parameter, 매개변수
	public void setPrice(int price) {
		                // 매개변수는 메소드 호출 시 초기화가 강제됨 ★ 
		// System.out.println(price);
		// Scope 안에서는 해당 영역앉에 있는 지역변수가 식별자 우선권을 가진다.
		// System.out.println("내 주소가 뭐지 : " + this);
		// this : 해당 객체의 주소값을 가리키는 역할
		if(price > 0 ) {
			this.price = price;
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	// name 필드를 기록 및 수정할 수 있는 메소드
	
	public void setName(String name) {
		this.name = name;
	}
	
	// amount 필드를 기록 및 수정할 수 있는 메소드
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	/* 관례 위반 : 두 개 이상의 필드값을 변경하는 메소드 이름에 set 이 붙으면 안됨!!!
	public void setPriceAndAmount(int price, int amount) {
		setPrice(price);
		setAmount(amount);
	}
		*/ 
	
	// 데이터를 반환해주는 기능의 메소드 : getter() --> VO 에 꼭있어야함 !!!!!!!!
	/* 
	 * 규칙!
	 * 
	 * 1. getter()는 접근제한자 public 을 사용한다.
	 * 2. get 필드명으로 짓되, 낙타봉표기법(camelCase)를 사용한다.
	 * 3. VO 패키지안에 존재하는 클래스라면 getter 는 무조건 꼭 절대로 다 만드세요!!!!!!!!!!
	 * 
	 */
	
	// 메소드를 호출한 곳으로 name 필드값을 돌려주고 싶음
	public String getName() {
		return name;
	}
	
	// 가격을 반환해주는 메소드
	public int getPrice() {
		return price;
	}
	
	// 수량을 반환해주는 메소드
	public int getAmount() {
		return amount;
	}
	
	// 필드들의 접근제한자를 private 으로 변경한뒤
	// 각각의 필드들에 대한 getter() / setter() 를 구현하면
	// 캡슐화가 끝났다!!
	/*
	 * 1. 값을 숨긴다 -> 필드의 접근제한자를 private 으로 선언
	 * 2. 메소드를 통해 필드에 접근할 수 있게 만든다 -> getter() / setter() 구현
	 * 데이터를 숨김 -> 객체간의 결합도가 낮아짐 -> 책임을 분리시킴
	 */
	
	public String info() {
		String info = "자판기 = [제품명 : " + name + ", 가격 : " + price + ", 재고 : " + amount + "]";
		return info; 
	}
	
}


