package com.javalec.base;

import java.util.Scanner;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/25
 * 최종 수정일 : 2022/02/25
 * 목적 : array 와 scanner 연습
 */


public class Quiz_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경변수
		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		Scanner scanner = new Scanner(System.in);
		int[] height = new int[name.length];
		int sum = 0; // 신장의 합계
		double average = 0; // 신장의 평균
//		int heightMax = 0; // 신장의 최대값
//		int heightMin = 0; // 신장의 최소값
//		int peopleMax = 0; // 신장의 최대값 사람
//		int peopleMin = 0; // 신장의 최소값 사람
		int[] heightMax = new int[name.length + 1];
		int[] heightMin = new int[name.length + 1];
		int countMax = 1;
		int countMin = 1;
		
		// 신장 입력받기

		for ( int i = 0; i < name.length; i++) {
			while(true) {
				System.out.print(name[i] + "의 신장을 입력하세요 : ");
				height[i] = scanner.nextInt();
				if (height[i] <= 30 || height[i] >= 300) {
					System.out.println("잘못된 키를 입력하셨습니다. 다시 입력해주세요");
				} else {
					sum += height[i];
					break;
				}
			}
		}

		
		
		// 입력받은 신장의 평균 구하기
		average = (double) sum / height.length;
		
		// 신장의 최대, 최소값 구하기
		heightMax[0] = height[0];
		heightMin[0] = height[0];
		
		for (int i = 1; i < height.length; i++) {
			if ( heightMax[0] < height[i] ) {
				heightMax[0] = height[i];
				countMax = 1;
				heightMax[countMax] = i;
			} else if(heightMax[0] == height[i] ) {
				countMax++;
				heightMax[countMax] = i;
			}

			if ( heightMin[0] > height[i] ) {
				heightMin[0] = height[i];
				countMin = 1;
				heightMin[countMin] = i;
			} else if(heightMin[0] == height[i] ) {
				countMin++;
				heightMin[countMin] = i;
			} 

		}

		
		// 확인용 출력
//		for (int i = 0 ; i < countMax; i++) {
//			System.out.println(countMax);
//			System.out.println(heightMax[i+1]);
//		}
//		for (int i = 0 ; i < countMin; i++) {
//			System.out.println(countMin);
//			System.out.println(heightMin[i+1]);
//		}
//		
		// 출력하기
		System.out.printf("평균 신장은 : %.2f\n", average);
		System.out.print("가장 큰 학생은 ");
		for (int i = 0; i < countMax; i++) {
			System.out.print(name[heightMax[i+1]] + " ");
		}
		System.out.println("이고 그 학생의 키는 " + heightMax[0]);
		System.out.print("가장 작은 학생은 ");
		for (int i = 0; i < countMin; i++) {
			System.out.print(name[heightMin[i+1]] + " ");
		}
		System.out.println("이고 그 학생의 키는 " + heightMin[0]);

		
		scanner.close();
		
	}

}
