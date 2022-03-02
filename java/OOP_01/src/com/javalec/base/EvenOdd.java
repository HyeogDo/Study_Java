package com.javalec.base;
/*
* 작성자 : 권혁도
* 생성일 : 2022/02/28
* 최종 수정일 : 2022/02/28
* 목적 : 절차지향형 프로그램과 객체지향 프로그램의 비교 - 홀짝 구분하는 클래스
*/
public class EvenOdd {
	
	// 홀짝 판단하는 Method
	public String evenOdd(int sum) {
		int checkNum = sum % 2;
		String str = "";
		if (checkNum == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		
		return str;
	}

}
