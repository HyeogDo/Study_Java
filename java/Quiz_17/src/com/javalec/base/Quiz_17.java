package com.javalec.base;

import java.util.Scanner;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/28
 * 최종 수정일 : 2022/02/28
 * 목적 : for문과 배열의 이해
 */
public class Quiz_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경 변수 선언
		Scanner scanner = new Scanner(System.in);
		int intNum = 0;
		int sum = 0;
		
		// 정수 입력 받기
		System.out.print("Enter an integer(0~9) : ");
		intNum = scanner.nextInt();
		
		// 위치별로 분류하기 & 합치기
		while (true) {
			sum += intNum % 10;
			intNum /= 10;
			//System.out.println(tmp + " " + intNum + " " + sum);
			if (intNum == 0 ) {
				break;
			}
		}
		
		
		// 출력하기
		System.out.println("Sum of digits = " + sum);
		
		scanner.close();
		

	}

}
