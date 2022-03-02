package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/02/28
* 최종 수정일 : 2022/02/28
* 목적 : 절차지향형 프로그램과 객체지향 프로그램의 비교 - 합 구하는 클래스
*/

public class Sum_1 {
	
	// Field (Property)
	
	// Constructor
	public Sum_1() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	// Method
	// 합계를 구하는 Method
	public int sumCalc(int startNum, int endNum) {
		int sum = 0;
		for (int i = startNum; i <= endNum; i++) {
			sum += i;
		}
		return sum;
	}
	

	
	

}
