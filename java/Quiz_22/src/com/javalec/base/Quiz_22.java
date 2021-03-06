package com.javalec.base;

import java.util.Scanner;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/28
 * 최종 수정일 : 2022/02/28
 * 목적 : for문과 배열의 이해
 */
public class Quiz_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 환경 변수 선언
		Scanner scanner = new Scanner(System.in);
		int delNumLoc = 0;
		
		// 숫자 받아오기
		System.out.print("입력할 숫자의 개수? : ");
		int[] putNum = new int[scanner.nextInt()];
		
		System.out.println((putNum.length ) + "개의 숫자를 입력하세요!");
		for (int i = 0; i < (putNum.length); i++) {
			System.out.print((i+1) + "의 숫자 : ");
			putNum[i] = scanner.nextInt();
		}

		// 삭제할 위치 선택
		System.out.print("몇번째 숫자를 삭제하시겠습니까? : ");
		delNumLoc = scanner.nextInt();
		
		scanner.close();
		// 해당 위치의 숫자 삭제
		for (int i = delNumLoc; i < putNum.length; i++) {
			putNum[i-1] = putNum[i];
		}


		// 결과 출력
		System.out.println("======결과======");
		for (int i = 0; i < (putNum.length -1); i++) {
			System.out.println(putNum[i]);
		}

	}

}
