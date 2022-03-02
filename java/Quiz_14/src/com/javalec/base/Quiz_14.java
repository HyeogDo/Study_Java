package com.javalec.base;

import java.util.Scanner;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/25
 * 최종 수정일 : 2022/02/25
 * 목적 : for문의 이해
 */
public class Quiz_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경변수 선언
		Scanner scanner = new Scanner(System.in);
		int decimalNum = 0;
		int factorialNum = 1;
		
		// 입력 받기
		while (true) {
			System.out.print("Input your decimal no. : " );
			decimalNum = scanner.nextInt();
			if (decimalNum <= 0) {
				System.out.println("양의 정수를 입력해 주세요");
			}else {
				break;
			}
		}
		
		// 팩토리얼 만들기
		for (int i = 1; i <= decimalNum; i++) {
			factorialNum *= i;
		}
		
		// 출력
		System.out.println(decimalNum + "'s factorial value = " + factorialNum);
		scanner.close();
	}
	
}
