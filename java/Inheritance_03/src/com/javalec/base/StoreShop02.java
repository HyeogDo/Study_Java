package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/03
* 최종 수정일 : 2022/03/03
* 목적 : 상속의 이해
*/
public class StoreShop02 extends StoreHQ{
	
	// Field
	
	
	// Constructor
	public StoreShop02() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	
	// 부대찌개 : 5000원
	@Override
	public void orderBu() {
		// TODO Auto-generated method stub
		System.out.println("부대찌개(store2) : 5000원");
	}
	// 비빔밥 : 5000원
	@Override
	public void orderBi() {
		// TODO Auto-generated method stub
		System.out.println("비빔밥(store2) : 5000원");
	}
	// 순대국 : 4000원
	@Override
	public void orderSoon() {
		// TODO Auto-generated method stub
		System.out.println("순대국(HQ) : 5000원");
	}
	// 공기밥 : 무료입니다.
	@Override
	public void orderKong() {
		// TODO Auto-generated method stub
		System.out.println("무료입니다.");
	}
	
}
