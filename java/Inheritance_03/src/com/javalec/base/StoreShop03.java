package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/03
* 최종 수정일 : 2022/03/03
* 목적 : 상속의 이해
*/
public class StoreShop03 extends StoreHQ{
	
	// Field
	
	
	// Constuctor
	public StoreShop03() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	
	// 김치찌개 : 6000
	@Override
	public void orderKim() {
		// TODO Auto-generated method stub
		System.out.println("김치찌개(shop3) : 6000원");
	}
	// 부대찌개 : 5000원
	@Override
	public void orderBu() {
		// TODO Auto-generated method stub
		System.out.println("부대찌개(store3) : 5000원");
	}
	
	// 비빔밥 : 5000원
	@Override
	public void orderBi() {
		// TODO Auto-generated method stub
		System.out.println("비빔밥(store3) : 5000원");
	}
	
	// 순대국 : 4000원
	@Override
	public void orderSoon() {
		// TODO Auto-generated method stub
		System.out.println("순대국(store3) : 4000원");
	}
	
	
	
}
