package com.javalec.function;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/02
* 최종 수정일 : 2022/03/02
* 목적 : 객체지향 프로그래밍 연습
*/

public class MultiplicationTableArray {
	
	// Field
	int startNum;
	String[] table = new String[9];
	
	// Constructor
	public MultiplicationTableArray() {
		// TODO Auto-generated constructor stub
	}
	
	
	public MultiplicationTableArray(int startNum) {
		super();
		this.startNum = startNum;
	}
	
	// Method


	public String[] makeTable() {
		for (int i = 1; i <= 9; i++) {
			table[i-1] = (startNum + " X " + i + " = " + (startNum * i));
		}
		return table;
	}

}
