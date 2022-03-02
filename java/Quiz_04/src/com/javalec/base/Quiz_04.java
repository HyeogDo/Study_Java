package com.javalec.base;

import java.util.Scanner;

/*
 * date : 2022/02/23
 * name : HyeogDo
 * purpose : study if
 * 
 */


public class Quiz_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키(m), 몸무게(kg) 최대 최솟값 설정
		double height_max = 2.5;
		double height_min = 0.05;
		int weight_max = 500;
		int weight_min = 20;
		
		Scanner scanner = new Scanner(System.in);
		
		// 제목
		System.out.println("** BMI 계산기 **");
		System.out.println();
		
		// 데이터 입력받기
		System.out.print("신장(cm)을 입력하세요(5~250) : ");
		double height = scanner.nextInt();
		System.out.print("몸무게(kg)를 입력하세요(20~500) : ");
		int weight = scanner.nextInt();
		
		// cm -> m 변환
		height *= 0.01;
		
		
		// 예외 처리
		if ( height > height_max || height < height_min ) {
			System.out.println("잘못된 신장을 입력하셨습니다.");
		}
		if (weight > weight_max || weight < weight_min ) {
			System.out.println("잘못된 몸무게를 입력하셨습니다.");
		}
		
		// bmi 계산
		double bmi = weight / (height * height);
		

		
		if ((height <= height_max && height >= height_min) && (weight <= weight_max && weight >= weight_min)) {
			
			if (bmi < 25) {
				System.out.println("정상 체중입니다.");
			} else if ( bmi < 30 ) {
				System.out.println("초기 1단계 비만입니다.");
			} else if ( bmi < 35 ) {
				System.out.println("2단계 비만입니다.");
			} else {
				System.out.println("고도 비만입니다.");
			}
			
		}
		
		scanner.close();
	}

}
