package com.javalec.base;

import java.util.Scanner;

/*
 * date : 2022/02/23
 * name : HyeogDo
 * purpose : study for
 */

public class Quiz_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 선언
		Scanner scanner = new Scanner(System.in);
		int start_Num = 0;
		int end_Num = 0;
		int sum_odd = 0;
		int sum_even = 0;
		double average = 0;
		int bridge = 0;
		
		// 숫자 받기
		System.out.print("Start Number : ");
		start_Num = scanner.nextInt();
		System.out.print("End Number : ");
		end_Num = scanner.nextInt();
		
		
		// 숫자 섞기
		if (start_Num > end_Num) {
			bridge = start_Num;
			start_Num = end_Num;
			end_Num = bridge;
		}
		
		// for문 돌리기
		for (int i = start_Num; i <= end_Num ; i ++) {
			if ( i % 2 == 0) {
				sum_even += i;
			} else {
				sum_odd += i;
			}
			average += i;
		}
		
		average /= (end_Num-start_Num+1);
		
		
		System.out.println(start_Num + "부터 " + end_Num + "까지의 수 중 짝수의 합은 " + sum_even + "이고, 홀수의 합은 " + sum_odd + "이고, 전체 평균은 " + average + "입니다.");
		scanner.close();

	}
	
}
