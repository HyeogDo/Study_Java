package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/04
* 최종 수정일 : 2022/03/04
* 목적 : Abstract의 이해
*/
public class StoreShop2 extends StoreHQ {
	// Field

	// Constructor
	public StoreShop2() {
		// TODO Auto-generated constructor stub
	}

	// Method

	@Override
	public void orderBu() {
		// TODO Auto-generated method stub
		System.out.println("부대찌개 : 5000원");
	}

	@Override
	public void orderBi() {
		// TODO Auto-generated method stub
		System.out.println("비빔밥 : 5000원");
	}
	
	@Override
	public void orderSoon() {
		// TODO Auto-generated method stub
		System.out.println("순대국 : 4000원");
	}
	
	@Override
	public void orderKong() {
		// TODO Auto-generated method stub
		System.out.println("공기밥 : 무료입니다.");
	}

	@Override
	public void orderKim() {
		// TODO Auto-generated method stub
		
	}
}