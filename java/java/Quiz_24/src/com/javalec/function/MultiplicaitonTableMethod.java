package com.javalec.function;


/*
* 작성자 : 권혁도
* 생성일 : 2022/03/02
* 최종 수정일 : 2022/03/02
* 목적 : 객체지향 프로그래밍 연습
*/
public class MultiplicaitonTableMethod {
	
	// Field
	
	// Constructor
	public MultiplicaitonTableMethod() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	
	public void makeTable(int startNum) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(startNum + " X " + i + " = " + (startNum * i));
		}
	}

}
