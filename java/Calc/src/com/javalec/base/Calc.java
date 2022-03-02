package com.javalec.base;

public class Calc {
	
	public static void main(String[] args) {
		// 변수를 이용한 사칙연산
		
		// 데이터 선언 
		int intNum1 = 100;
		int intNum2 = 200;
		
		intNum1 = 10;
		intNum2 = 20;
		
		
		// 데이터 로직
		
		// 덧셈
		System.out.println(intNum1 + intNum2);
		// 뺄셈
		System.out.println(intNum2 - intNum1);
		// 곱셈
		System.out.println(intNum2 * intNum1);
		// 나누기 
		System.out.println(intNum2 / intNum1); //몫
		System.out.println(intNum2 % intNum1); //나머지
		
		// 문자와 계산값 출력하기
		System.out.println("덧셈 : " + (intNum1 + intNum2));
		
		
		System.out.println("덧셈 : " + intNum1 + " + " + intNum2 + " = " + (intNum1 + intNum2) );
		System.out.println("뺄셈 : " + intNum2 + " - " + intNum1 + " = " + (intNum2 - intNum1) );
		System.out.println("곱셈 : " + intNum1 + " X " + intNum2 + " = " + (intNum1 * intNum2) );
		System.out.println("나눗셈 : " + intNum2 + " / " + intNum1 + " = " + (intNum2 / intNum1) );
		
		
		
//		System.out.printf("덧셈 : %d + %d = %d\n", intNum1, intNum2, intNum1 + intNum2);
//		System.out.printf("뺄셈 : %d - %d = %d\n", intNum2, intNum1, intNum2 - intNum1);
//		System.out.printf("곱셈 : %d X %d = %d\n", intNum1, intNum2, intNum1 * intNum2);
//		System.out.printf("나눗셈 : %d / %d = %d\n", intNum2, intNum1, intNum2 / intNum1);
		
	}

}
