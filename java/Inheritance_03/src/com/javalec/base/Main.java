package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/03
* 최종 수정일 : 2022/03/03
* 목적 : 상속의 이해
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StoreHQ storeHQ = new StoreHQ();
//		storeHQ.orderBi();
//		storeHQ.orderBu();
//		storeHQ.orderKim();
//		storeHQ.orderKong();
//		storeHQ.orderSoon();
//		
//		System.out.println("======================");
//		
//		StoreShop01 shop01 = new StoreShop01();
//		shop01.orderBi();
//		shop01.orderBu();
//		shop01.orderKim();
//		shop01.orderKong();
//		shop01.orderSoon();
//		
//		System.out.println("======================");
//		
//		StoreShop02 shop02 = new StoreShop02();
//		shop02.orderBi();
//		shop02.orderBu();
//		shop02.orderKim();
//		shop02.orderKong();
//		shop02.orderSoon();
//		
//		System.out.println("======================");
//		
//		StoreShop03 shop03 = new StoreShop03();
//		shop03.orderBi();
//		shop03.orderBu();
//		shop03.orderKim();
//		shop03.orderKong();
//		shop03.orderSoon();
		
		StoreHQ[] store = {new StoreHQ(), new StoreShop01(), new StoreShop02(), new StoreShop03()};
		for (int i = 0; i < store.length; i++) {
			store[i].orderBi();
			store[i].orderBu();
			store[i].orderKim();
			store[i].orderKong();
			store[i].orderSoon();
			System.out.println("======================"); 
		}
		

		
	}

}
