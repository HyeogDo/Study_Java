package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/04
* 최종 수정일 : 2022/03/04
* 목적 : ArrayList의 이해
*/
public class PrintResult {
	// Field
	
	// Constructor
	public PrintResult() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void printResult() {
		System.out.println("------결과------");
		for (int i = 0; i < PutNum.intList.size(); i++) {
			System.out.println(PutNum.intList.get(i));
		}
	}

}