package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/04
* 최종 수정일 : 2022/03/04
* 목적 : Abstract의 이해
*/
public abstract class StoreHQ {
	
	// Field
	
	// Constuctor
	public StoreHQ() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	
	public abstract void orderKim();
	public abstract void orderBu();
	public abstract void orderBi();
	public abstract void orderSoon();
	public abstract void orderKong();
	
//	public void orderKim() {
//		System.out.println("김치찌개(HQ) : 0원");
//	}
//	
//	public void orderBu() {
//		System.out.println("부대찌개(HQ) : 0원");
//	}
//	
//	public void orderBi() {
//		System.out.println("비빔밥(HQ) : 0원");
//	}
//	
//	public void orderSoon() {
//		System.out.println("순대국(HQ) : 0원");
//	}
//	
//	public void orderKong() {
//		System.out.println("공기밥(HQ) : 0원");
//	}
	
}
