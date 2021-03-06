package com.javalec.base;

/*
 * date : 2022/02/22
 * name : HyeogDo
 * purpose : Study Variable
 * 
 */

public class Variable_01 {
	
	
	// Method 
	public static void main(String[] args) {
		
		int intNum1 = 10; // 정수 테스트 값 
		char char01 = 'A'; // 문자 테스트 값 
		
		System.out.println(intNum1);
		System.out.println(char01);

		// intNum1의 값을 100으로 변경하여 출력하기
		
		intNum1 = 100; // 정수 값 변경하기
		
		System.out.println(intNum1);
		
		// 상수 변수 정의하기
		final int fixedNum = 100;
		System.out.println(fixedNum);
		
		// 실수 출력하기
		float floatNum1 = 3.14f;
		double doubleNum1 = 3.14;
		final double pi  = 3.141592;
		System.out.println(floatNum1);
		System.out.println(doubleNum1);
		System.out.println(pi);
		
		// 문자열 출력하기
		String str1 = "Good Morning!!";
		System.out.println(str1);
		
		// Boolean 출력하기
		boolean bool1 = true;
		
		System.out.println(bool1);
		
		
	}

	
}
