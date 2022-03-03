package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/03
* 최종 수정일 : 2022/03/03
* 목적 : 상속의 이해
*/
public class Child extends Parents {
	
	// Field
	String cStr = "자식 class";
	
	
	// Constructor
	public Child() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void getMe() {
		System.out.println("홍XX");
	}
	
}
