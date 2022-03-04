package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/04
* 최종 수정일 : 2022/03/04
* 목적 : Static의 이해
*/
public class PrintIdPwd {
	// Field
	
	// Constructor
	public PrintIdPwd() {
		// TODO Auto-generated constructor stub
	}
		
		
	// Method
	public void printIdPwd() {
		System.out.println("귀하가 입력하신 ID는 " + SetIdPwd.id + "이고 암호는 " + SetIdPwd.pwd + "입니다.");
	}
	
}
