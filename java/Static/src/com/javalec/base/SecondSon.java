package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/04
* 최종 수정일 : 2022/03/04
* 목적 : Static의 이해
*/
public class SecondSon {
	
	// Field
	
	
	// Constructor
	public SecondSon() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void takeChoco() {
//		MamaBag bag = new MamaBag();
//		bag.choco = bag.choco - 1;
//		
//		if ( bag.choco < 0 ) {
//			System.out.println("둘째는 초코파이 먹고 싶어요!");
//		} else {
//			System.out.println("둘째는 맛있게 먹었어요!");
//		}
		
		
		MamaBag.choco--;
		if (MamaBag.choco < 0) {
			System.out.println("둘째는 초코파이 먹고 싶어요!");
		} else {
			System.out.println("둘째는 맛있게 먹었어요!");
		}
	}
}