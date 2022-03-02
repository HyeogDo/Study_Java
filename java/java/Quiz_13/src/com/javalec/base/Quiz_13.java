package com.javalec.base;

import java.util.Scanner;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/25
 * 최종 수정일 : 2022/02/25
 * 목적 : for문의 이해
 */

public class Quiz_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경 변수 선언
		Scanner scanner = new Scanner(System.in);
		int danStart = 0;
		
		// 숫자 입력받기
		System.out.print("숫자를 입력해 주세요 : ");
		danStart = scanner.nextInt();
		
		// 구구단 출력하기
//		for (int i = 1; i < 9; i++) {
//			for ( int j = danStart; j < danStart + 4; j++) {
//				System.out.print(j + " X " + i + " = " + (j*i) + "\t");
//			}
//			System.out.println();
//		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(danStart + " X " + i + " = " + (danStart*i) + "\t" 
					+ (danStart + 1) + " X " + i + " = " + ((danStart + 1)*i) + "\t"
					+ (danStart + 2) + " X " + i + " = " + ((danStart + 2)*i) + "\t"
					+ (danStart + 3) + " X " + i + " = " + ((danStart + 3)*i) + "\n");
		}
		
		scanner.close();
		
	}

}
