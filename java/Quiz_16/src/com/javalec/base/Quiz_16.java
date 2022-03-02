package com.javalec.base;

import java.util.Scanner;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/25
 * 최종 수정일 : 2022/02/25
 * 목적 : for문의 이해
 */
public class Quiz_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경변수 선언
		Scanner scanner = new Scanner(System.in);
		int putNum = 0;
		int maxNum = 0;
		int maxNumLoc = 0;
		// 숫자 입력받기
		System.out.print("입력할 숫자의 개수? (100개 미만) : ");
		putNum = scanner.nextInt();
		int[] putNum2 = new int[putNum];
		
		System.out.println(putNum + "개의 숫자를 입력하세요!");
		for (int i = 0; i < putNum; i++) {
			putNum2[i] = scanner.nextInt();
		}
		
		
		// 최대값 구하기
		maxNum = putNum2[0];
		
		
		for (int i = 1; i < putNum; i++) {
			if ( putNum2[i]  > maxNum ) {
				maxNum = putNum2[i];
				maxNumLoc = i+1;
			}
			
		}
		
		// 출력하기
		System.out.println("입력한 숫자 중 최대값은 " + maxNum + "이고 " + maxNumLoc + "번째 값입니다.");
		
		
//		Scanner scanner = new Scanner(System.in);
//		int putNum = 0;
//		int maxNum = 0;
//		int maxNumLoc = 0;
//		int k = 0;
//		// 숫자 입력받기
//		System.out.print("입력할 숫자의 개수? (100개 미만) : ");
//		putNum = scanner.nextInt();
//
//		
//		System.out.println(putNum + "개의 숫자를 입력하세요!");
//		for (int i = 0; i < putNum; i++) {
//			k = scanner.nextInt();
//			if ( maxNum < k) {
//				maxNum = k;
//				maxNumLoc = i+1;
//			}
//			
//		}
//		
//		
//	
//		
//		// 출력하기
//		System.out.println("입력한 숫자 중 최대값은 " + maxNum + "이고 " + maxNumLoc + "번째 값입니다.");
		
		scanner.close();
	}

}
