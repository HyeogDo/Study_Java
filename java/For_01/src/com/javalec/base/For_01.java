package com.javalec.base;

import java.util.Scanner;

/*
 * date : 2022/02/23
 * name : HyeogDo
 * purpose : study for
 */

public class For_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
//		
//		for ( int i = 1; i <= 100; i++) {
//			System.out.println(i);
//		}
//		
//		// 1부터 10까지의 수중 홀수만 출력하기
//		for ( int i = 1; i <= 10; i++ ) {
//			if (i % 2 == 1) {
//				System.out.println(i);
//			}
//		}
//		
//		// 이게 더 나음
//		for (int i = 1; i <= 10; i += 2) {
//			System.out.println(i);
//		}
		
//		// 1부터 10까지의 수들의 합계 구하기
//		int sum = 0; // 누적변수
//		for (int i = 1; i <= 100; i+=2) {
//			sum += i;
//		}
//		System.out.println("1부터 10까지의 홀수의 합은 " + sum + "입니다.");
//		
//	}
//		int sum_odd = 0;
//		int sum_even = 0;
//		for (int i = 1; i <= 100; i++) {
//			if ( i % 2 == 0) {
//				sum_even += i;
//			} else {
//				sum_odd += i;
//			}
//		}
//		System.out.println("1부터 100까지의 수 중 홀수의 합은 " + sum_odd + "이고, 짝수의 합은 " + sum_even + "입니다.");
//		
//	
		
		//환경변수 정의
		Scanner scanner = new Scanner(System.in);
		int firstNumber = 0; // 첫번째 숫자
		int endNumber = 0; // 마지막 숫자
		int sum = 0; // 누적 변수
		
		// 사용자로 부터 입력값 받기
		System.out.print("Start Number : ");
		firstNumber = scanner.nextInt();
		
		System.out.print("End Number : ");
		endNumber = scanner.nextInt();
		
		// 처리하기
		for (int i = firstNumber; i <= endNumber; i++) {
			sum += i;
		}
		
		// 출력하기
		System.out.println(firstNumber + " 부터 " + endNumber + " 까지의 합은 " + sum + " 입니다.");
		
		scanner.close();
		
		
		
	}
		
		
}
