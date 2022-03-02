package com.javalec.base;

public class Base {

	public static void main(String[] args) {
		// 	연산자 종류별 출력
		int i = 10, j = 2, k = 5;
		
		// < 산술 연산자 >
		/*
		 * 덧셈 : 10 + 2 = 12
		 * 뺄셈 : 10 - 2 = 8
		 * 곱셈 : 10 * 2 = 20
		 * 나눗셈 : 10 / 2 = 5
		 * 나머지 : 10 % 2 = 0
		 * 
		 */
		
		System.out.println("<--- 산술 연산자 --->");
		System.out.println("덧셈 : " + i + " + " + j + " = " + (i+j));
		System.out.println("뺄셈 : " + i + " - " + j + " = " + (i-j));
		System.out.println("곱셈 : " + i + " * " + j + " = " + (i*j));
		System.out.println("나눗셈 : " + i + " / " + j + " = " + (i/j));
		System.out.println("나머지 : " + i + " % " + j + " = " + (i%j));
		
		
		System.out.println("<--- 자동 증감 연산자 --->");
		i++;
		System.out.println("증가 : " + i);
		i--;
		System.out.println("감소 : " + i);
		
		
		System.out.println("<--- 동등비교 관계 연산자 --->");
		System.out.println("i == j : " + (i == j));
		System.out.println("i != j : " + (i != j));
		System.out.println("i > j : " + (i > j));
		System.out.println("i < j : " + (i < j));
		System.out.println("i >= j : " + (i >= j));
		System.out.println("i <= j : " + (i <= j));
		
		System.out.println("<--- 논리 연산자 --->");
		System.out.println(i + " > " + j + " && " + j + " > " + k + " ; " + ((i>j)&&(j>k)));
		System.out.println(i + " > " + j + " || " + j + " > " + k + " ; " + ((i>j)||(j>k)));
		
		System.out.println("<--- 삼항 연산자 --->");
		System.out.println("삼항 연산 결과 (k == 5 ? 1 : 2) : " + (k == 5 ? "Good" : "Bad"));
		System.out.println("삼항 연산 결과 (k == 5 ? 1 : 2) : " + (k == 5 ? (k+=10) : "Bad"));
		
		
		System.out.println("<--- 줄여 쓰는 연산자 --->");
		System.out.println("i에 100을 더해주면 : " + (i+=100));
		
		
		// -----------------------
		int intNum1 = 24;
		
		// intNum1이 짝수인지 홀수인지 판단하여 짝수면
		// intNum1 : 짝수 로 표기하기
		
		System.out.println("intNum1 : " + (intNum1 % 2 == 0 ? "짝수" : "홀수"));
		
		// intNum1이 3의 배수인지 아닌지 포시하기
		System.out.println("intNum1 : " + (intNum1 % 3 == 0 ? "3의 배수가 맞다" : "3의 배수가 아니다"));
		
		// intNum1이 4의 배수도 되고 6의 배수도 되면 True 아니면 False
		System.out.println("intNum1 : " + ((intNum1 % 4 == 0) && (intNum1 % 6 == 0) ? "True" : "False"));
		
		

	}

}
