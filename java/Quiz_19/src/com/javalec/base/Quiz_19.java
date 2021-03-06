package com.javalec.base;

import java.util.Scanner;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/28
 * 최종 수정일 : 2022/02/28
 * 목적 : for문과 배열의 이해
 */
public class Quiz_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경 변수 설정
		Scanner scanner = new Scanner(System.in);
		String[] section = {"Korean", "English", "Mathematics" };
		String[] student = {"NO1","NO2","NO3","NO4"};
		int[] score = new int[section.length*student.length];
		double[] average = new double[student.length];
		
		// 데이터 받아오기
		for(int i = 0; i < section.length; i++) {
			System.out.println(section[i] + "의 성적을 입력");
			for (int j = 0; j < student.length; j++) {
				System.out.print(student[j] + "의 성적은 : ");
				score[j + (student.length * i)] = scanner.nextInt();
				if(score[j + (student.length * i)] > 100 || score[j + (student.length * i)] < 0 ) {
					System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요");
					j--;
					continue;
				}
				average[j] += score[j + (student.length * i)];

			}
		}
		scanner.close();
		

		// 출력하기
		for (int i = 0; i < section.length; i++) {
			System.out.print("\t\t" + section[i]);
		}
		System.out.println("\t\tTotal" + "\t\tAverage");
		for (int i = 0; i < student.length; i++) {
			System.out.print(student[i] + "\t");
			for (int j = 0; j < section.length; j++) {
				System.out.printf("%10d\t", score[i + (student.length * j)]);
			}
			System.out.printf("\t\t%5.2f \t\t%5.2f\n", average[i], average[i]/(section.length * 1.0));
		}
		


	}

}
