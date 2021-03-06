package com.javalec.base;

import java.util.Scanner;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/28
 * 최종 수정일 : 2022/02/28
 * 목적 : for문과 배열의 이해
 */
public class Quiz_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경 변수 선언
		Scanner scanner = new Scanner(System.in);
		int inputNum = 0;
		int inputNumLoc = 0;
		int temp = 0;
		
		// 숫자 받아오기
		System.out.print("입력할 숫자의 개수? : ");
		int[] putNum = new int[scanner.nextInt() + 1];
		
		System.out.println((putNum.length - 1) + "개의 숫자를 입력하세요!");
		for (int i = 0; i < (putNum.length-1); i++) {
			System.out.print((i+1) + "의 숫자 : ");
			putNum[i] = scanner.nextInt();
		}

		// 삽입할 위치 선택 및 출력

		System.out.print("숫자를 삽입하고자 하는 위치는 ? : ");
		inputNumLoc = scanner.nextInt();
		System.out.print("삽입하고자 하는 수는 ? : ");
		inputNum = scanner.nextInt();
		
		System.out.println("======결과======");
		for (int i = inputNumLoc - 1; i < putNum.length; i++) {
			//temp = putNum[i];
			temp = putNum[i];
			putNum[i] = inputNum;
			inputNum = temp;
			
		}
		// 다른 방법
//		for (int i = putNum.length - 1; i >= inputNumLoc - 1; i--) {
//			putNum[i+1] = putNum[i];
//		}
//		putNum[inputNumLoc-1] = inputNum; 
		
		
		for(int i = 0; i < putNum.length; i++) {
			System.out.println(putNum[i]);
		}
		
		scanner.close();
	}

}
