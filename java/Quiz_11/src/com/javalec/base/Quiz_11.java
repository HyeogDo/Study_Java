package com.javalec.base;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/25
 * 최종 수정일 : 2022/02/25
 * 목적 : 배열과 for문을 익숙해지기
 */


public class Quiz_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경변수 설정
		int length = 9;
		int[] dan_3 = new int[length];
		int[] dan_5 = new int[length];
		int[] dan_9 = new int[length];
		
		
		// 구구단 저장
		for (int i = 0; i < length; i++) {
			dan_3[i] = 3*(i+1);
			dan_5[i] = 5*(i+1);
			dan_9[i] = 9*(i+1);
		}
		
		// 구구단 출력
		for(int i = 0; i < dan_3.length; i++) {
			System.out.print("5 X " + (i+1) + " = " + dan_5[i] + "\t");
			System.out.print("3 X " + (i+1) + " = " + dan_3[i] + "\t");
			System.out.print("9 X " + (i+1) + " = " + dan_9[i] + "\n");
		}
		
		System.out.println("---------------------------");
		
		// 옆으로 출력?
		for (int i = 0; i < dan_5.length; i++) {
			System.out.print("5 X " + (i+1) + " = " + dan_5[i] + "\t");			
		}
		System.out.println();
		for (int i = 0; i < dan_3.length; i++) {
			System.out.print("3 X " + (i+1) + " = " + dan_5[i] + "\t");			
		}
		System.out.println();
		for (int i = 0; i < dan_9.length; i++) {
			System.out.print("9 X " + (i+1) + " = " + dan_5[i] + "\t");			
		}
		
		
	}

}
