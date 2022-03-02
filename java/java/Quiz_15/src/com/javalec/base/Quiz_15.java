package com.javalec.base;

import java.util.Scanner;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/25
 * 최종 수정일 : 2022/02/25
 * 목적 : for문의 이해
 */
public class Quiz_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경 변수 선언
		Scanner scanner = new Scanner(System.in);
		int intNum = 0;
		int sum = 0;
		
		// 입력받기 & 더하기
		System.out.print("몇개의 숫자를 더할까요? : ");
		intNum = scanner.nextInt(); 
		System.out.println(intNum + "개의 숫자를 입력하세요");
		for (int i = 0; i < intNum; i++) {
			sum += scanner.nextInt();
		}
		
		// 출력하기
		System.out.println("입력하신 숫자 " + intNum + "의 합은 " + sum + "입니다.");
		scanner.close();
	}

}
