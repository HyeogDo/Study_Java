package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/04
* 최종 수정일 : 2022/03/04
* 목적 : Abstract의 이해
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("HQ------------------");
//		StoreHQ storeHQ = new StoreHQ();
//		storeHQ.orderKim();
//		storeHQ.orderBu();
//		storeHQ.orderBi();
//		storeHQ.orderSoon();
//		storeHQ.orderKong();
		
		System.out.println("Shop1------------------");
		StoreShop1 shop1 = new StoreShop1();
		shop1.orderKim();
		shop1.orderBu();
		shop1.orderBi();
		shop1.orderSoon();
		shop1.orderKong();
		
		System.out.println("Shop2------------------");
		StoreShop2 shop2  = new StoreShop2();
		shop2.orderKim();
		shop2.orderBu();
		shop2.orderBi();
		shop2.orderSoon();
		shop2.orderKong();
		

	}

}
