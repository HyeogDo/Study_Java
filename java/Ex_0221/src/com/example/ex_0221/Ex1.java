package com.example.ex_0221;

public class Ex1 {
	public static void main(String[] args) {
		
		
		int year = 2022;
		int month = 2;
		int day = 21;
		
		System.out.printf("오늘의 날짜는 %d년 %02d월 %02d일 입니다\n", year, month, day);
		
		System.out.println("오늘의 날짜는 " + year + "년 " + month + "월 " + day + "일 입니다");
		
		int intNum1 = 10;
		int intNum2 = 20;
		int intNum3 = 30;
		
		
		System.out.println("사칙 연산 연습");
		System.out.println("1. 덧셈");
		System.out.println(intNum1 + " + " + intNum2 + " + " + intNum3 + " = " + (intNum1 + intNum2 + intNum3));
		System.out.println("2. 뺄셈");
		System.out.println(intNum1 + " - " + intNum2 + " - " + intNum3 + " = " + (intNum1 - intNum2 - intNum3));
		System.out.println("3. 곱셈");
		System.out.println(intNum1 + " X " + intNum2 + " X " + intNum3 + " = " + (intNum1 * intNum2 * intNum3));
		System.out.println("4. 나눗셈 - 몫");
		System.out.println(intNum1 + " / " + intNum2 + " / " + intNum3 + " = " + (intNum1 / intNum2 / intNum3));
		System.out.println("5. 나눗셈 - 나머지");
		System.out.println(intNum1 + " % " + intNum2 + " % " + intNum3 + " = " + (intNum1 % intNum2 % intNum3));
		
		
		
	}

}
