package com.javalec.base;

import java.util.Scanner;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/28
 * 최종 수정일 : 2022/02/28
 * 목적 : for문과 배열의 이해
 */
public class Quiz_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경 변수 선언
		Scanner scanner = new Scanner(System.in);
		int inputNum = 0;
		boolean flag = true;
		
		// 숫자 받아오기
		System.out.print("입력할 숫자의 개수? : ");
		int[] putNum = new int[scanner.nextInt()];
		
		System.out.println(putNum.length + "개의 숫자를 입력하세요!");
		for (int i = 0; i < putNum.length; i++) {
			System.out.print((i+1) + "의 숫자 : ");
			putNum[i] = scanner.nextInt();
		}

		// 위치 검색 및 출력
		System.out.print("검색할 숫자는 ? : ");
		inputNum = scanner.nextInt();
		for(int i = 0; i < putNum.length; i++) {
			if ( inputNum == putNum[i]) {
				System.out.printf("%d의 위치는 %d번째 입니다.", putNum[i], i+1);
				flag = false;
			} 
		}
		if (flag == true) {
			System.out.println(inputNum + "는 존재하지 않습니다.");
		}
		scanner.close();
		
	}

}
